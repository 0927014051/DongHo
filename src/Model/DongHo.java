package Model;

import java.math.BigDecimal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class DongHo {
  
    private String MaDH, TenDH,TrangThai,MaLoai,MaHang;
   // private byte[] HinhAnh;
    private BigDecimal Gia;
    private int SLTon; 

    public DongHo(String MaDH, String TenDH, String TrangThai,String MaLoai,String MaHang, BigDecimal Gia, int SLTon) {
        this.MaDH = MaDH;
        this.TenDH = TenDH;
        this.Gia = Gia;
        this.TrangThai = TrangThai;
        this.MaLoai = MaLoai;
        this.MaHang = MaHang;
        this.SLTon = SLTon;
    }
    public String getMaLoai(){
        return MaLoai;
    }
    public String getMaHang(){
        return MaHang;
    }
    public void setMaLoai(String MaLoai){
        this.MaLoai = MaLoai;
    }
    public void setMaHang(String MaHang){
        this.MaHang = MaHang;
    }
    public String getMaDH() {
        return MaDH;
    }

    public String getTenDH() {
        return TenDH;
    }

//    public byte[] getHinhAnh() {
//        return HinhAnh;
//    }

    public String getTrangThai() {
        return TrangThai;
    }

    public BigDecimal getGia() {
        return Gia;
    }

    public int getSLTon() {
        return SLTon;
    }

    public void setMaDH(String MaDH) {
        this.MaDH = MaDH;
    }

    public void setTenDH(String TenDH) {
        this.TenDH = TenDH;
    }

//    public void setHinhAnh(byte[] HinhAnh) {
//        this.HinhAnh = HinhAnh;
//    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public void setGia(BigDecimal Gia) {
        this.Gia = Gia;
    }

    public void setSLTon(int SLTon) {
        this.SLTon = SLTon;
    }
    
}
