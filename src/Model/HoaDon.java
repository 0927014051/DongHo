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
public class HoaDon {

    private String maHD;
    private String maPD;
    private String maNV;
    private Date NgayIn;
    private String MSTHD;
    private BigDecimal ThanhTien;

    public String getMSTHD() {
        return MSTHD;
    }

    public void setMSTHD(String MSTHD) {
        this.MSTHD = MSTHD;
    }

    public BigDecimal getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(BigDecimal ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
   
    public HoaDon(){
    }
    public HoaDon(String maHD, String maNV, String maPD,String MSTHD,BigDecimal ThanhTien, Date NgayIn){
        this.maHD = maHD;
        this.maNV = maNV;
        this.maPD = maPD;
        this.NgayIn = NgayIn;
        this.MSTHD = MSTHD;
        this.ThanhTien = ThanhTien;
    }
 public String getMaPD() {
        return maPD;
    }

    public void setMaPD(String maPD) {
        this.maPD = maPD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaHD() {
        return maHD;
    }

    public Date getNgayIn() {
        return NgayIn;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setNgayIn(Date NgayIn) {
        this.NgayIn = NgayIn;
    }
//    public static NhanVien  showNhanVien(String maNV){
//        for (NhanVien nv: ModuleLayer.controller.Controller.arrayListNhanVien){
//            if (nv.getMaNV().equals(this.maNV))
//                return nv;
//        }
//        return null;
//    }
    
}
