/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String MaNV, HoNV, TenNV, gtNV, dcNV, stdNV;
    private String TrangThai;
    private Date nsNV;

    public NhanVien(String MaNV, String HoNV, String TenNV, String gtNV, Date nsNV, String dcNV, String stdNV,String TrangThai ) {
            this.MaNV = MaNV;
            this.HoNV = HoNV;
            this.TenNV = TenNV;
            this.dcNV = dcNV;
            this.gtNV = gtNV;
            this.stdNV = stdNV;
            this.nsNV = nsNV;
            this.TrangThai = TrangThai;
           
    }
    public String getTrangThai(){
        return TrangThai;
    }
    public void setTrangThai(String TrangThai){
        this.TrangThai = TrangThai;
    }
    public String getMaNV() {
        return MaNV;
    }

    public String getHoNV() {
        return HoNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public String getGtNV() {
        return gtNV;
    }

    public Date getNsNV() {
        return nsNV;
    }

    public String getDcNV() {
        return dcNV;
    }

    public String getStdNV() {
        return stdNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setHoNV(String HoNV) {
        this.HoNV = HoNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public void setGtNV(String gtNV) {
        this.gtNV = gtNV;
    }

    public void setNsNV(Date nsNV) {
        this.nsNV = nsNV;
    }

    public void setDcNV(String dcNV) {
        this.dcNV = dcNV;
    }

    public void setStdNV(String stdNV) {
        this.stdNV = stdNV;
    }
    public NhanVien(){
    }
    
}
