/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class CT_KhuyenMai {
    private String MaKM;
    private String MaDH;
    private int PTKM;

 
    
    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getMaDH() {
        return MaDH;
    }

    public void setMaDH(String MaDH) {
        this.MaDH = MaDH;
    }
  



    public CT_KhuyenMai(String MaKM, String MaDH,int PTKM) {
        this.MaKM = MaKM;
        this.MaDH = MaDH;
        this.PTKM = PTKM;
    }

    public int getPTKM() {
        return PTKM;
    }

    public void setPTKM(int PTKM) {
        this.PTKM = PTKM;
    }
        public CT_KhuyenMai() {
    }
    
}
