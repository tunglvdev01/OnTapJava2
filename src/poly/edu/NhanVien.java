
package poly.edu;


public class NhanVien {
    private String maNv;
    private String hoTen;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String maNv, String hoTen, double luong) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
