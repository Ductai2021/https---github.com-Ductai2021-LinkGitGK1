package Buoi6;

public class HinhChuNhat {
    // implemention
    private float Chieudai;
    private float Chieurong;

    // interface

    public void setChieuDai(float chieudai) {
        this.Chieudai = chieudai;
    }

    public void setChieuRong(float chieurong) {
        this.Chieudai = chieurong;
    }

    public float TinhDienTich() {
        return this.Chieudai * this.Chieurong;
    }

    public float TinhChuVi() {
        return (this.Chieudai + this.Chieurong) * 2;
    }

    public String toString() {
        String str = "chieudai: " + this.Chieudai + "chieurong" + this.Chieurong;
        str += "dientich: " + this.TinhDienTich() + "chuvi" + this.TinhChuVi();

        return str;
    }

}
