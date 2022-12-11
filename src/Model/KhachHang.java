/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String MaKH, CMND, HoKH, TenKH, gtKH, dcKH, sdtKH, emailKH,MSTKH;  
    private Date nsKH;
    
    public KhachHang(String MaKH,String CMND, String MSTKH,String HoKH,String TenKH,String gtKH,Date nsKH,String dcKH,String sdtKH,String emailKH){
        this.MaKH = MaKH;
        this.CMND = CMND;
        this.HoKH = HoKH;
        this.TenKH = TenKH;
        this.dcKH = dcKH;
        this.gtKH = gtKH;
        this.emailKH = emailKH;
        this.nsKH = nsKH;
        this.sdtKH = sdtKH;
        this.MSTKH = MSTKH;
    }
    public String getMSTKH(){
        return MSTKH;
    }
    public String getMaKH() {
        return MaKH;
    }

    public String getCMND() {
        return CMND;
    }

    public String getHoKH() {
        return HoKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public String getGtKH() {
        return gtKH;
    }

    public Date getNsKH() {
        return nsKH;
    }

    public String getDcKH() {
        return dcKH;
    }

    public String getStdKH() {
        return sdtKH;
    }

    public String getEmailKH() {
        return emailKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setHoKH(String HoKH) {
        this.HoKH = HoKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public void setGtKH(String gtKH) {
        this.gtKH = gtKH;
    }

    public void setNsKH(Date nsKH) {
        this.nsKH = nsKH;
    }

    public void setDcKH(String dcKH) {
        this.dcKH = dcKH;
    }

    public void setStdKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

    public void setEmailKH(String emailKH) {
        this.emailKH = emailKH;
    }
    public void setMSTKH(String MSTKH){
        this.MSTKH = MSTKH;
    }
        
}
