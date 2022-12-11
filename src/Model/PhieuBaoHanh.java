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
public class PhieuBaoHanh {
    private String MaPBH;
    private String MaDH;
    private Date NgayBD, NgayKT;
    public String getMaPBH() {
        return MaPBH;
    }

    public void setMaPBH(String MaPBH) {
        this.MaPBH = MaPBH;
    }

    public String getMaDH() {
        return MaDH;
    }
    
    public void setMaDH(String MaDH) {
        this.MaDH = MaDH;
    }


    public PhieuBaoHanh(String MaPBH, String MaDH, Date NgayBD, Date NgayKT) {
        this.MaPBH = MaPBH;
        this.MaDH = MaDH;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
    }

    public void setNgayBD(Date NgayBD) {
        this.NgayBD = NgayBD;
    }

    public void setNgayKT(Date NgayKT) {
        this.NgayKT = NgayKT;
    }

    public Date getNgayBD() {
        return NgayBD;
    }

    public Date getNgayKT() {
        return NgayKT;
    }
    
        public PhieuBaoHanh() {
    }

}
