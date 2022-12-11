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
public class KhuyenMai {
    private String MaKM,MaNV,LyDoKM;
    private Date NgayBD, NgayKT;

    public KhuyenMai() {
    }

    public KhuyenMai(String MaKM,String MaNV,String LyDoKM, Date NgayBD, Date NgayKT) {
        this.MaKM = MaKM;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
        this.MaNV = MaNV;
        this.LyDoKM = LyDoKM;
    }

    public String getMaKM() {
        return MaKM;
    }

    public Date getNgayBD() {
        return NgayBD;
    }

    public Date getNgayKT() {
        return NgayKT;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public void setNgayBD(Date NgayBD) {
        this.NgayBD = NgayBD;
    }

    public void setNgayKT(Date NgayKT) {
        this.NgayKT = NgayKT;
    }
    public String getMaNV(){
        return MaNV;
    }
    public void setMaNV(String MaNV){
        this.MaNV = MaNV;
    }
    public String getLyDoKM(){
        return LyDoKM;

    }
    public void setLyDoKm(String LyDoKM){
        this.LyDoKM = LyDoKM;
    }
}
