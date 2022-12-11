package Connection;

import Model.DongHo;
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
public class DeleteData {

    public static boolean deleteTaiKhoan(String taiKhoan) {
        String sqlCommand = "delete from dbo.TaiKhoan where MaNV=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, taiKhoan);
            ps.executeUpdate();

            System.out.println("Xóa tài khoản thành công");
        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa tài khoản thất bại");
        return false;
    }

    public static boolean deletetNhanVien(String MaNV) {
        String sqlCommand = "delete from dbo.NhanVien where MaNV=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaNV);

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa nhân viên thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa nhân viên thất bại");
        return false;
    }

    public static boolean delelteKhachHang(String MaKH) {
        String sqlCommand = "delete from dbo.KhachHang where MaKH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaKH);

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa khách hàng thành công");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa khách hàng thất bại");
        return false;
    }

    public static boolean deleteDongHo(String MaDH) {
        String sqlCommand = "delete from dbo.DongHo where MaDH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaDH);

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa đồng hồ thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa đồng hồ thất bại");
        return false;
    }

    public static boolean deletePhieuDat(String MaPD) {
        String sqlCommand = "delete from dbo.PhieuDat where MaPhieuDat=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaPD);

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa phiếu đặt thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa phiếu đặt thất bại");
        return false;
    }

    public static boolean deleteHoaDon(String MaHD) {
        String sqlCommand = "delete from dbo.HoaDon where MaHoaDon=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaHD);
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa hóa đơn thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa hóa đơn thất bại");
        return false;
    }

    public static boolean deleteBaoHanh(String MaBH) {
        String sqlCommand = "delete from dbo.BaoHanh where MaBH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaBH);

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa phiếu bảo hành thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa phiếu bảo hành thất bại");
        return false;
    }

    public static boolean deleteKhuyenMai(String MaKM) {
        String sqlCommand = "delete from dbo.KhuyenMai where MaKM=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaKM);

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa khuyến mãi thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa khuyến mãi thất bại");
        return false;
    }

    public static boolean delelteCT_KhuyenMai(String CTKM, String MaDH) {
        String sqlCommand = "delete from dbo.CT_KhuyenMai where MaKM=? and MaDH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, CTKM);
            ps.setString(2, MaDH);

            if (ps.executeUpdate() > 0) {
                System.out.println("xóa chi tiết khuyến mãi thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa chi tiết khuyến mãi thất bại");
        return false;
    }

    public static boolean deleteCT_PhieuBaoHanh(String MaBH) {
        String sqlCommand = "delete from dbo.CT_BaoHanh where MaBH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaBH);

            if (ps.executeUpdate() > 0) {
                System.out.println("xóa chi tiết bảo hành thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa chi tiết bảo hành thất bại");
        return false;
    }

    public static boolean deleteCT_PhieuDat(String MaPD, String MaDH) {
        String sqlCommand = "delete from dbo.CT_PhieuDat where MaPhieuDat=? and MaDH=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaPD);
            ps.setString(2, MaDH);

            if (ps.executeUpdate() > 0) {
                System.out.println("xóa chi tiết phiếu đặt thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa chi tiết phiếu đặt thất bại");
        return false;
    }

    public static boolean deleteHangDH(String MaHang) {
        String sqlCommand = "delete from dbo.HangDH where MaHang=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaHang);

            if (ps.executeUpdate() > 0) {
                System.out.println("xóa hãng đồng hồ thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa hãng đồng hồ thất bại");
        return false;
    }

    public static boolean deleteLoaiDH(String MaLoai) {
        String sqlCommand = "delete from dbo.LoaiDH where MaLoai=?";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, MaLoai);

            if (ps.executeUpdate() > 0) {
                System.out.println("xóa loại đồng hồ thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa loại đồng hồ thất bại");
        return false;
    }

}
