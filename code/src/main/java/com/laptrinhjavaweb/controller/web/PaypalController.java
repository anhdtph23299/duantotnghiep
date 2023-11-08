package com.laptrinhjavaweb.controller.web;

import com.laptrinhjavaweb.ApiController.ApiGiaoHangController;
import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.entity.enumentity.PhuongThucThanhToanEnum;
import com.laptrinhjavaweb.service.GiaoHangService;
import com.laptrinhjavaweb.util.paypal.Order;
import com.laptrinhjavaweb.util.paypal.PaypalService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller()
@RequestMapping("/pay")
public class PaypalController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    PaypalService service;

    @Autowired
    ApiGiaoHangController giaoHangController;

    @Autowired
    GiaoHangService giaoHangService ;

    public static final String SUCCESS_URL = "pay/success";
    public static final String CANCEL_URL = "pay/cancel";

    @GetMapping("")
    public String home() {
        return "paypal/index";
    }

    @PostMapping("")
    public String payment(@ModelAttribute Order order) {
//        Order order = new Order();
//        order.setPrice(10);
//        order.setDescription("Test payment");
//        order.setMethod("paypal");
//        order.setCurrency("USD");
//        order.setIntent("sale");
        System.out.println(order);
        try {
            Payment payment = service.createPayment(order.getPrice(), order.getCurrency(), order.getMethod(),
                    order.getIntent(), order.getDescription(), "http://localhost:8080/" + CANCEL_URL,
                    "http://localhost:8080/" + SUCCESS_URL+"/"+order.getIdkh()+"/"+order.getIdttmuahang());
            for(Links link:payment.getLinks()) {
                if(link.getRel().equals("approval_url")) {
                    return "redirect:"+link.getHref();
                }
            }

        } catch (PayPalRESTException e) {

            e.printStackTrace();
        }
        return "redirect:/pay";
    }

    @GetMapping(value = CANCEL_URL)
    public String cancelPay() {
        return "cancel";
    }

    @GetMapping(value = "/success/{idkh}/{ttgh}")
    public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId,
                             @PathVariable(name = "idkh")Long idkh,
                             @PathVariable(name = "ttgh")Long ttgh
    ) {
        try {
            Payment payment = service.executePayment(paymentId, payerId);
            System.out.println(payment.toJSON());
            if (payment.getState().equals("approved")) {
               HoaDon hoaDon= giaoHangService.thanhToan(idkh,ttgh, PhuongThucThanhToanEnum.CHUYENKHOAN);
                if (hoaDon==null){
                    return "web/403";
                }
                taoHangGiaoHangNhanh(hoaDon.getId());
                return "paypal/success";
            }
        } catch (PayPalRESTException e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/pay";
    }

    private void taoHangGiaoHangNhanh(Long idhd){
        String url = "http://localhost:8080/api/user/giaohang/datHang/"+idhd;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        // Xử lý phản hồi từ Controller B
        String responseBody = response.getBody();
    }
}
