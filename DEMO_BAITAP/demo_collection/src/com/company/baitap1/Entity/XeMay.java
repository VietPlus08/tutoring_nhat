package com.company.baitap1.Entity;

public class XeMay extends PhuongTien{
    private String congXuat;

    public XeMay(String congXuat) {
        this.congXuat = congXuat;
    }

    public XeMay(String bienKiemSoat, String tenHSX, int namSX, String chuSoHuu, String congXuat) {
        super(bienKiemSoat, tenHSX, namSX, chuSoHuu);
        this.congXuat = congXuat;
    }

    public XeMay() {

    }

    public String getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(String congXuat) {
        this.congXuat = congXuat;
    }
}
