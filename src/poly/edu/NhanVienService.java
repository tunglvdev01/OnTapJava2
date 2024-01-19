
package poly.edu;

import java.util.ArrayList;

public class NhanVienService {
    ArrayList<NhanVien> lstNV = new ArrayList<>();
    public void fakeData() { // them 3 nv vao bang
        lstNV.add(new NhanVien("N01", "Le Tung", 9));
        lstNV.add(new NhanVien("N02", "Le Tung1", 6));
        lstNV.add(new NhanVien("N03", "Le Tung2", 8));
    }

    // add Nhan vien vao list, thành công trả về true, lỗi trả về false
    public boolean addNhanVien(NhanVien nv) {
        try {
            lstNV.add(nv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // xoa nhan vien trong list tai vi tri index
    public boolean deleteNhanVien(int index) {
        try {
            lstNV.remove(index);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
