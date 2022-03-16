package LinkGitGK1;

import java.util.Date;

public class HanhKhach {
    private String maHanhKhach;
    private String tenHanhKhach;
    private String maPhong;
    private double donGia;
    private  Date ngayNhanPhong;
    private Date ngayTraPhong;

    public HanhKhach(String maHanhKhach){
        this.setMahanhkhach(maHanhKhach);
    }


    private void setMahanhkhach(String maHanhKhach) {
        if(maHanhKhach != null){
            this.maHanhKhach = maHanhKhach;
        }else{
            System.out.println("Ma Hang khong duoc rong !!!!");
        }
    }

    private void setMaphong(String Maphong ) {
        if(maPhong != null){
            this.maPhong = maPhong;
        }else{
            System.out.println("Ma Phong khong duoc rong !!!!");
        }
    }

    
    public void setNgayTraphong(Date ngayTraPhong) {
        if(ngayTraPhong.after(ngayNhanPhong)){
            this.ngayTraPhong = ngayTraPhong;
        }else{
           System.out.println("Ngay tra phong phai sau ngay nhan phong !!!");
       }
        
    }

    
    public String getMaKhachHang() {
        return maHanhKhach;
    }

    
    public String toString() {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");

        return "HanhKhach [donGia=" + donGia + ", maKhachHang=" + maHanhKhach + ", ngayTraPhong=" + ngayVietNam.format(ngayTraPhong) + ", ngaySX="
                + ((Object) ngayVietNam).format(ngayNhanPhong) + ", tenKhachHang=" + tenHanhKhach + ", ma phong"+ maPhong  +"]";
    }

    public boolean kiemTraNgayTraPhong(){//boolean//interface
        return this.tinhNgaySuDung();
    }

    private boolean tinhNgaySuDung() {
        return false;
    }

    private boolean tinhNgaySuDung{//implementation

        boolean isTraPhong = false;
        Date ngayHienTai = new Date();
        if(this.ngayTraPhong.before(ngayHienTai)){
            isTraPhong = true;
        }

        return isTraPhong;

    }
    
}
