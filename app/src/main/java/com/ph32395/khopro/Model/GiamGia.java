package com.ph32395.khopro.Model;

public class GiamGia {
    private int id_GiamGia;
    private int Phan_Tram_Giam;

    public GiamGia() {
    }

    public GiamGia(int id_GiamGia, int phan_Tram_Giam) {
        this.id_GiamGia = id_GiamGia;
        Phan_Tram_Giam = phan_Tram_Giam;
    }

    public int getId_GiamGia() {
        return id_GiamGia;
    }

    public void setId_GiamGia(int id_GiamGia) {
        this.id_GiamGia = id_GiamGia;
    }

    public int getPhan_Tram_Giam() {
        return Phan_Tram_Giam;
    }

    public void setPhan_Tram_Giam(int phan_Tram_Giam) {
        Phan_Tram_Giam = phan_Tram_Giam;
    }
}
