package com.laptrinhjavaweb.dto;

public class NhanVienDTO {

    private Long id;
    private String maNV;
    private String matKhau;
    private String tenNV;
    private String sdt;
    private ChucVuDTO chucVuDTO;
    private Integer trangThai;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public ChucVuDTO getChucVuDTO() {
        return chucVuDTO;
    }

    public void setChucVuDTO(ChucVuDTO chucVuDTO) {
        this.chucVuDTO = chucVuDTO;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
