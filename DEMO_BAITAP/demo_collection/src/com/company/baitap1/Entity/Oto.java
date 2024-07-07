package com.company.baitap1.Entity;

public class Oto extends PhuongTien implements Comparable<Oto>{
    private int soChoNgoi;
    private String kieuXe;

    public Oto(String bienKiemSoat, String tenHSX, int namSX, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHSX, namSX, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Oto() {

    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Oto{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }

    @Override
    public int compareTo(Oto o) {
        return o.getTenHSX().compareTo(getTenHSX());
    }
}
