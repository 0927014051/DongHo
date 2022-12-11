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
public class PhieuDat {
    private String maPD, hoKH, tenKH, dcKH, MaKH,sdtkh;
    private Date NgayGiao;
    private Date NgayDat;
    public Date getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(Date NgayDat) {
        this.NgayDat = NgayDat;
    }
   public String getSdtKH(){
       return sdtkh;
   }
   public void setSdtKH(String sdtkh){
       this.sdtkh = sdtkh;
   }
    public PhieuDat(){
    }
    public PhieuDat(String maPD, String hoKH, String tenKH, String dcKH, String MaKH,String sdtkh,Date NgayDat,Date NgayGiao){
        this.maPD = maPD;
        this.hoKH = hoKH;
        this.MaKH = MaKH;
        this.tenKH = tenKH;
        this.sdtkh = sdtkh;
        this.NgayGiao = NgayGiao;
        this.NgayDat = NgayDat;
        this.dcKH = dcKH;
        
    }
    public String getMaKH(){
        return MaKH;
    }
    public String getMaPD() {
        return maPD;
    }

    public String getHoKH() {
        return hoKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDcKH() {
        return dcKH;
    }

    public Date getNgayGiao() {
        return NgayGiao;
    }

    public void setMaPD(String maPD) {
        this.maPD = maPD;
    }

    public void setHoKH(String hoKH) {
        this.hoKH = hoKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setDcKH(String dcKH) {
        this.dcKH = dcKH;
    }

    public void setNgayGiao(Date NgayGiao) {
        this.NgayGiao = NgayGiao;
    }
    public void setMaKH(String MaKH){
        this.MaKH = MaKH;
    }
    
}
