package com.ph32395.khopro.Model;

public class NhanVien {
    private String id_NhanVien;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String matKhau;
    private String loaiTaiKhoan;

    public NhanVien() {
    }

    public NhanVien(String id_NhanVien, String hoTen,int tuoi,String gioiTinh, String matKhau, String loaiTaiKhoan) {
        this.id_NhanVien = id_NhanVien;
        this.hoTen = hoTen;
        this.matKhau = matKhau;
        this.loaiTaiKhoan = loaiTaiKhoan;
        this.tuoi = tuoi;
        this.gioiTinh=gioiTinh;
    }

    public String getId_NhanVien() {
        return id_NhanVien;
    }

    public void setId_NhanVien(String id_NhanVien) {
        this.id_NhanVien = id_NhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(String loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}