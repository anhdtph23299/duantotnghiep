package com.laptrinhjavaweb.dto;

public class NhanVienDTO extends AbstractDTO<NhanVienDTO>{

    private String ma;

    private String matkhau;

    private String ten;

    private String sodienthoai;

    private ChucVuDTO chucVuDTO;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public ChucVuDTO getChucVuDTO() {
        return chucVuDTO;
    }

    public void setChucVuDTO(ChucVuDTO chucVuDTO) {
        this.chucVuDTO = chucVuDTO;
    }
}
