package Connection;

import Model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.TaiKhoan;
import Controller.controller;

//import java.lang.ModuleLayer.Controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author PC
 */
public class LoadData {

    public static void loadTableTaiKhoan() {

        ResultSet rs = DataConnection.retrieveData("select * from dbo.TaiKhoan");
        try {
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan(
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getString(1).trim(),
                        rs.getString(4).trim());

                controller.arrayListTaiKhoan.add(taiKhoan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableNhanVien() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.NhanVien");
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getString(4).trim(),
                        rs.getDate(5),
                        rs.getString(6).trim(),
                        rs.getString(7).trim(),
                        rs.getString(8).trim());

                controller.arrayListNhanVien.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableKhachHang() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.KhachHang");
        try {
            while (rs.next()) {
                KhachHang kh = new KhachHang(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getString(4).trim(),
                        rs.getString(5).trim(),
                        rs.getString(6).trim(),
                        rs.getDate(7),
                        rs.getString(8).trim(),
                        rs.getString(9).trim(),
                        rs.getString(10).trim());
                controller.arrayListKhachHang.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTablePhieuDat() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.PhieuDat");
        try {
            while (rs.next()) {
                PhieuDat pd = new PhieuDat(
                        rs.getString(1).trim(),
                        rs.getString(3).trim(),
                        rs.getString(4).trim(),
                        rs.getString(5).trim(),
                        rs.getString(2).trim(),
                        rs.getString(6).trim(),
                        rs.getDate(7),
                        rs.getDate(8));

                controller.arrayListPhieuDat.add(pd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableCT_PhieuDat() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.CT_PhieuDat");
        try {
            while (rs.next()) {
                CT_PhieuDat ctpd = new CT_PhieuDat(
                        rs.getString(1).trim(),
                        rs.getInt(3),
                        rs.getBigDecimal(4),
                        rs.getString(2).trim());
                controller.arrayListCT_PhieuDat.add(ctpd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableCT_PhieuBaoHanh() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.CT_BaoHanh");
        try {
            while (rs.next()) {
                CT_PhieuBaoHanh ctpbh = new CT_PhieuBaoHanh(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim());
                controller.arrayListCT_PhieuBaoHanh.add(ctpbh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void loadTablePhieuBaoHanh() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.BaoHanh");

        Date datenow = Calendar.getInstance().getTime();
        try {
            while (rs.next()) {
                PhieuBaoHanh pbh = new PhieuBaoHanh(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getDate(3),
                        rs.getDate(4));
                controller.arrayListPhieuBaoHanh.add(pbh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableKhuyenMai() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.KhuyenMai");

        try {
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getDate(4),
                        rs.getDate(5));
                controller.arrayListKhuyenMai.add(km);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableCT_KhuyenMai() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.CT_KhuyenMai");

        Date datenow = Calendar.getInstance().getTime();
        try {
            while (rs.next()) {
                CT_KhuyenMai ctkm = new CT_KhuyenMai(
                        rs.getString(1).trim(),
                        rs.getString(2).trim(),
                        rs.getInt(3));
                controller.arrayListCT_KhuyenMai.add(ctkm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableHoaDon() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.HoaDon");

        Date datenow = Calendar.getInstance().getTime();
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon(
                        rs.getString(1).trim(),
                        rs.getString(6).trim(),
                        rs.getString(2).trim(),
                        rs.getString(3).trim(),
                        rs.getBigDecimal(5),
                        rs.getDate(4));
                controller.arrayListHoaDon.add(hd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableDongHo() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.DongHo");

        Date datenow = Calendar.getInstance().getTime();
        try {
            while (rs.next()) {
                DongHo dh = new DongHo(
                        rs.getString(1).trim(),
                        rs.getString(4).trim(),
                        //rs.getBytes(8),
                        rs.getString(7).trim(),
                        rs.getString(3).trim(),
                        rs.getString(2).trim(),
                        rs.getBigDecimal(5),
                        rs.getInt(6));
                controller.arrayListDongHo.add(dh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableLoaiDH() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.LoaiDH");

        Date datenow = Calendar.getInstance().getTime();
        try {
            while (rs.next()) {
                LoaiDH ldh = new LoaiDH(
                        rs.getString(1).trim(),
                        rs.getString(2).trim());
                controller.arrayListLoaiDH.add(ldh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void loadTableHangDH() {
        ResultSet rs = DataConnection.retrieveData("select * from dbo.HangDH");

        Date datenow = Calendar.getInstance().getTime();
        try {
            while (rs.next()) {
                HangDH hdh = new HangDH(
                        rs.getString(1).trim(),
                        rs.getString(2).trim());
                controller.arrayListHangDH.add(hdh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LoadData() {
        Controller.controller.arrayListTaiKhoan.removeAll(Controller.controller.arrayListTaiKhoan);
        Controller.controller.arrayListNhanVien.removeAll(Controller.controller.arrayListNhanVien);
        Controller.controller.arrayListKhachHang.removeAll(Controller.controller.arrayListKhachHang);
        Controller.controller.arrayListPhieuDat.removeAll(Controller.controller.arrayListPhieuDat);
        Controller.controller.arrayListCT_PhieuDat.removeAll(Controller.controller.arrayListCT_PhieuDat);
        Controller.controller.arrayListPhieuBaoHanh.removeAll(Controller.controller.arrayListPhieuBaoHanh);
        Controller.controller.arrayListCT_PhieuBaoHanh.removeAll(Controller.controller.arrayListCT_PhieuBaoHanh);
        Controller.controller.arrayListKhuyenMai.removeAll(Controller.controller.arrayListKhuyenMai);
        Controller.controller.arrayListChucVu.removeAll(Controller.controller.arrayListChucVu);
        Controller.controller.arrayListHoaDon.removeAll(Controller.controller.arrayListHoaDon);
        Controller.controller.arrayListDongHo.removeAll(Controller.controller.arrayListDongHo);
        Controller.controller.arrayListLoaiDH.removeAll(Controller.controller.arrayListLoaiDH);
        Controller.controller.arrayListHangDH.removeAll(Controller.controller.arrayListHangDH);
        Controller.controller.arrayListCT_KhuyenMai.removeAll(Controller.controller.arrayListCT_KhuyenMai);

        loadTableCT_PhieuDat();
        loadTableCT_KhuyenMai();
        loadTableCT_PhieuBaoHanh();
        loadTableDongHo();
        loadTableHoaDon();
        loadTableKhachHang();
        loadTableKhuyenMai();
        loadTableNhanVien();
        loadTablePhieuBaoHanh();
        loadTablePhieuDat();
        loadTableTaiKhoan();
        loadTableHangDH();
        loadTableLoaiDH();

    }

}
