package baitap.lab2;

import java.util.Scanner;

public class SinhVien {

    private int maSV;
    private String hoten;
    private int diem;
    private String xeploai;
    private static final int DIEM = 0;
    private static final String XEPLOAI = "CHUA_XEP_LOAI";
    private static final int MASV = 0;
    private static final String HOTEN = "CHUA_CO_TEN";

    public SinhVien(int maSV, String hoten, int diem, String xeploai) {
        this.maSV = maSV;
        this.hoten = hoten;
        this.diem = diem;
        this.xeploai = xeploai;
    }

    public SinhVien() {
        this(MASV, HOTEN, DIEM, XEPLOAI);
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    public void XepLoai() {
        if (diem >= 8) {
            this.xeploai = "gioi";
        } else if (diem >= 7) {
            this.xeploai = "Kha";
        } else if (diem >= 5) {
            xeploai = "Trung Binh";
        } else {
            xeploai = "Kem";
        }
    }

    @Override
    public String toString() {
        return maSV + "\t" + hoten + "\t" + diem + "\t" + xeploai + "\n";
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.maSV = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ho ten: ");
        this.hoten = sc.nextLine();
        try {
            System.out.print("Nhap diem: ");
            this.diem = Integer.parseInt(sc.nextLine());           
        }
        catch(NumberFormatException e) {
            System.out.println("sai dinh dang, phai nhap so nguyen duong pham vi tu 0 - 10");
            while(true) {
                System.out.print("Nhap diem: ");
                this.diem = Integer.parseInt(sc.nextLine());
                if(this.diem >= 0 && this.diem <= 10) {
                    break;
                }
            }
        }
        catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        SinhVien objSV = new SinhVien();
        System.out.println("Sinh vien: " + objSV);
        objSV.Nhap();
        objSV.XepLoai();
        System.out.println("============Sau khi nhap============");
        System.out.println(objSV);
    }
}
