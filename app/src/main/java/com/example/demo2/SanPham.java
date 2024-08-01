package com.example.demo2;

public class SanPham {
    private String MaSP, TenSp, MoTa;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSp, String moTa) {
        MaSP = maSP;
        TenSp = tenSp;
        MoTa = moTa;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String tenSp) {
        TenSp = tenSp;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }
}
