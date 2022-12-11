/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class CT_PhieuDat {
    private String MaPhieuDat;
    private int SLDat;
    private BigDecimal Gia;
    private String MaDH;
    
    public String getMaPD() {
        return MaPhieuDat;
    }

    public void setMaPD(String MaPD) {
        this.MaPhieuDat = MaPD;
    }

    public String getMaDH() {
        return MaDH;
    }

    public void setMaDH(String MaDH) {
        this.MaDH = MaDH;
    }


    public CT_PhieuDat(String MaPD, int SoLuong, BigDecimal Gia, String MaDH) {
        this.MaPhieuDat = MaPD;
        this.SLDat = SoLuong;
        this.Gia = Gia;
        this.MaDH = MaDH;

    }

    public int getSoLuong() {
        return SLDat;
    }

    public BigDecimal getGia() {
        return Gia;
    }

    public void setSoLuong(int SoLuong) {
        this.SLDat = SoLuong;
    }

    public void setGia(BigDecimal Gia) {
        this.Gia = Gia;
    }
    
    public CT_PhieuDat() {
    }

}
