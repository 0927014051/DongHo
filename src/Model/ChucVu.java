/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class ChucVu {
    private String MaCV, tenCV;
    private String MaNV;
   
    
    public ChucVu() {
    }

    public ChucVu(String MaCV, String tenCV,String MaNV) {
        this.MaCV = MaCV;
        this.tenCV = tenCV;
        this.MaNV = MaNV;
    }

    public String getMaCV() {
        return MaCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setMaCV(String MaCV) {
        this.MaCV = MaCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    } 
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
}
