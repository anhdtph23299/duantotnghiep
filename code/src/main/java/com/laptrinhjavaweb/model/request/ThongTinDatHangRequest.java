package com.laptrinhjavaweb.model.request;

import com.laptrinhjavaweb.model.datarq.SanPhamGhnApi;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ThongTinDatHangRequest {
    // 1: Người bán/Người gửi.
    // 2: Người mua/Người nhận.

    private Long payment_type_id;     // Loại thanh toán
    private String note;             // Ghi chú

    // CHOTHUHANG, CHOXEMHANGKHONGTHU, KHONGCHOXEMHANG
    private String required_note;    // Ghi chú yêu cầu
    private String client_order_code; // Mã đơn hàng riêng của khách hàng.

    private String from_name;        // Tên người gửi
    private String from_phone;       // Số điện thoại người gửi
    private String from_address;     // Địa chỉ người gửi
    private String from_ward_name;   // Tên phường/ngõ người gửi
    private String from_district_name; // Tên quận/huyện người gửi
    private String from_province_name; // Tên tỉnh/thành phố người gửi

    private String to_name;          // Tên người nhận
    private String to_phone;         // Số điện thoại người nhận
    private String to_address;       // Địa chỉ người nhận
    private String to_ward_name;     // Tên phường/ngõ người nhận
    private String to_district_name; // Tên quận/huyện người nhận
    private String to_province_name; // Tên tỉnh/thành phố người nhận

    private Long cod_amount;         // Số tiền thu hộ
    private String content;          // Nội dung đơn hàng
    private Integer weight = 100;    // Trọng lượng
    private Integer length = 10;     // Chiều dài
    private Integer width = 10;      // Chiều rộng
    private Integer height = 10;     // Chiều cao
    private Long deliver_station_id; // ID trạm giao hàng

    // private Long insurance_value;    // Giá gốc đơn hàng
    private Long service_id;         // ID dịch vụ
    private Long service_type_id;    // 2: Chuyển phát thương mại điện tử, 5: Chuyển phát truyền thống
    // private Object coupon;           // Mã khuyến mãi
    private Long pickup_time;        // Thời gian mong muốn lấy hàng

    private List<SanPhamGhnApi> items;
}
