package Connection;

import java.lang.reflect.Array;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.*;

/**
 *
 * @author conghau
 */
public class UpdateData {

    public static boolean upadateTaiKhoan(TaiKhoan tk) {
        String sqlCommnad = "update dbo.TaiKhoan set MatKhau=?" + " where MaNV?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommnad);
            ps.setString(1, tk.getMatKhau());
            ps.setString(2, tk.getMaNV());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean updateNhanVien(NhanVien nv) {
        String sqlCommand = "update dbo.NhanVien set  HoNV=? ,TenNV=? ,GTNV=? ,NSNV=? ,DCNV=? ,SDT=?,TrangThai=? " + " where MaNV=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, nv.getHoNV());
            ps.setString(2, nv.getTenNV());

            ps.setString(3, nv.getGtNV());
            ps.setDate(4, new Date(nv.getNsNV().getTime()));
            ps.setString(5, nv.getDcNV());
            ps.setString(6, nv.getStdNV());
            ps.setString(7, nv.getTrangThai());
            ps.setString(8, nv.getMaNV());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa nhân viên thất bại");
        return false;
    }

    public static boolean updateKhachHang(KhachHang kh) {
        String sqlCommand = "update dbo.KhachHang set CMND=?, HoKH=?, TenKH=?, GTKH=?, NSKH=?, DCKH=?, Email=?, SDT=?, MSTKH=? where MaKH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, kh.getCMND());
            ps.setString(2, kh.getHoKH());
            ps.setString(3, kh.getTenKH());
            ps.setString(4, kh.getGtKH());
            ps.setDate(5, new Date(kh.getNsKH().getTime()));
            ps.setString(6, kh.getDcKH());
            ps.setString(7, kh.getEmailKH());
            ps.setString(8, kh.getStdKH());
            ps.setString(9, kh.getMSTKH());
            ps.setString(10, kh.getMaKH());

            return (ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa khách hàng thất bại");
        return false;
    }

    public static boolean updateDongHo(DongHo dh) {
        String sqlCommand = "update dbo.DongHo set MaHang=?, MaLoai=?, TenDH=?, SLTon=?,Gia=?,TrangThai=? where MaDH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, dh.getMaHang());
            ps.setString(2, dh.getMaLoai());
            ps.setString(3, dh.getTenDH());
            ps.setInt(4, dh.getSLTon());
            ps.setBigDecimal(5, dh.getGia());
            ps.setString(6, dh.getTrangThai());
            // ps.setBytes(6, dh.getHinhAnh()); 
            ps.setString(7, dh.getMaDH());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa đồng hồ thất bại");
        return false;
    }

    public static boolean updateDongHo1(DongHo dh, CT_PhieuDat ct) {
        String sqlCommand = "update dbo.DongHo set MaHang=?, MaLoai=?, TenDH=?, SLTon=?,Gia=?,TrangThai=? from dbo.DongHo,dbo.CT_PhieuDat where DongHo.MaDH = CT_PhieuDat.MaDH";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, dh.getMaHang());
            ps.setString(2, dh.getMaLoai());
            ps.setString(3, dh.getTenDH());
            ps.setInt(4, dh.getSLTon() - ct.getSoLuong());
            ps.setBigDecimal(5, dh.getGia());
            ps.setString(6, dh.getTrangThai());
            // ps.setBytes(6, dh.getHinhAnh()); 

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa đồng hồ thất bại");
        return false;
    }

    public static boolean updatePhieuDat(PhieuDat pd) {
        String sqlCommand = "update dbo.PhieuDat set MaKH=?, HoKH=?, TenKH=?, DCKH=?, SDT=?,NgayDat=?, NgayGiao=? where MaPhieuDat=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, pd.getMaKH());
            ps.setString(2, pd.getHoKH());
            ps.setString(3, pd.getTenKH());
            ps.setString(4, pd.getDcKH());
            ps.setString(5, pd.getSdtKH());
            ps.setDate(6, new Date(pd.getNgayDat().getTime()));
            ps.setDate(7, new Date(pd.getNgayGiao().getTime()));
            ps.setString(8, pd.getMaPD());
            return (ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa phiếu đặt thất bại");
        return false;
    }

    public static boolean updateHoaDon(HoaDon hd) {
        String sqlCommand = "update dbo.HoaDon set MaPhieuDat=?, MaNV=?, MSTHD=?, NgayIn=?, ThanhTien=? where MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, hd.getMaPD());
            ps.setString(2, hd.getMaNV());
            ps.setString(3, hd.getMSTHD());
            ps.setDate(4, new Date(hd.getNgayIn().getTime()));
            ps.setBigDecimal(5, hd.getThanhTien());
            ps.setString(6, hd.getMaHD());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa hóa đơn thất bại");
        return false;
    }

    public static boolean updateCT_PhieuBaoHanh(CT_PhieuBaoHanh bh) {
        String sqlCommand = "update CT_BaoHanh set MaNV=?,TrangThai=? where MaBH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, bh.getMaNV());
            ps.setString(2, bh.getTrangThai());

            ps.setString(3, bh.getMaPBH());

            if (ps.executeUpdate() > 0) {
                System.out.println("sửa chi tiết phiếu bảo hành thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa chi tiết phiếu bảo hành thất bại");
        return false;
    }

    public static boolean updateKhuyenMai(KhuyenMai km) {
        String sqlCommand = "update dbo.KhuyenMai set MaNV=?, LyDo=?, NgayBD=?, NgayKT=? where MaKM=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, km.getMaNV());
            ps.setString(2, km.getLyDoKM());
            ps.setDate(3, new Date(km.getNgayBD().getTime()));
            ps.setDate(4, new Date(km.getNgayKT().getTime()));

            ps.setString(5, km.getMaKM());

            if (ps.executeUpdate() > 0) {
                System.out.println("sửa khuyến mãi thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa khuyến mãi thất bại");
        return false;
    }

    public static boolean updateCT_KhuyenMai(CT_KhuyenMai ctkm) {
        String sqlCommand = "update dbo.CT_KhuyenMai set PTKM=? where MaKM=? and MaDH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, ctkm.getPTKM());
            ps.setString(3, ctkm.getMaDH());
            ps.setString(2, ctkm.getMaKM());
            if (ps.executeUpdate() > 0) {
                System.out.println("sửa chi tiết khuyến mãi thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa chi tiết khuyến mãi thất bại");
        return false;
    }

    public static boolean updatePhieuBaoHanh(PhieuBaoHanh ctbh) {
        String sqlCommand = "update dbo.BaoHanh set MaDH=?, NgayBD=?, NgayKT=? where MaBH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, ctbh.getMaDH());
            ps.setDate(2, new Date(ctbh.getNgayBD().getTime()));
            ps.setDate(3, new Date(ctbh.getNgayKT().getTime()));
            ps.setString(4, ctbh.getMaPBH());
            return (ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa bảo hành thất bại");
        return false;
    }

    public static boolean updateCT_PhieuDat(CT_PhieuDat ctpd) {
        String sqlCommand = "update dbo.CT_PhieuDat set SLDat=?, Gia=? where MaPhieuDat=? and MaDH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setInt(1, ctpd.getSoLuong());
            ps.setBigDecimal(2, ctpd.getGia());
            ps.setString(3, ctpd.getMaPD());
            ps.setString(4, ctpd.getMaDH());
            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa chi tiết phiếu đặt thất bại");
        return false;
    }

    public static boolean updateCT_PhieuDat1(CT_PhieuDat ctpd) {
        String sqlCommand = "update dbo.CT_PhieuDat set SLDat=?, Gia=?,MaDH=? where MaPhieuDat=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, ctpd.getSoLuong());
            ps.setBigDecimal(2, ctpd.getGia());
            ps.setString(4, ctpd.getMaPD());
            ps.setString(3, ctpd.getMaDH());
            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa chi tiết phiếu đặt thất bại");
        return false;
    }

    public static boolean doiMatKhau(TaiKhoan tk, String mk) {
        String sqlCommand = "update dbo.TaiKhoan set   MatKhau = ? " + " where MaNV=?";

        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, mk);
            ps.setString(2, tk.getMaNV());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Đổi mật khẩu thất bại");
        return false;
    }

    public static boolean updateHangDH(HangDH hdh) {
        String sqlCommand = "update dbo.HangDH set  TenHang=? " + " where MaHang=?";

        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);

            ps.setString(1, hdh.getTenHang());
            ps.setString(2, hdh.getMaHang());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa hãng đồng hồ thất bại");
        return false;
    }

    public static boolean updateLoaiDH(LoaiDH ldh) {
        String sqlCommand = "update dbo.LoaiDH set TenLoai=? " + " where MaLoai=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, ldh.getTenLoai());
            ps.setString(2, ldh.getMaLoai());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa loại đồng hồ thất bại");
        return false;
    }
}
