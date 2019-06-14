package baitap.lab3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = "";
        NhanVien objNV = new NhanVien("MaNV", "HoTen", 0, 0);
        
        System.out.print("Nhap ma nhan vien: ");
        temp = sc.nextLine();
        objNV.setMaNV(temp);
        System.out.print("Nhap ho ten nhan vien: ");
        temp = sc.nextLine();
        objNV.setHoten(temp);
        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        objNV.setTuoi(tuoi);
        System.out.print("Nhap luong: ");
        float luong = sc.nextFloat();
        objNV.setLuong(luong);
        
        System.out.println(objNV.toString());
        
    }
}
