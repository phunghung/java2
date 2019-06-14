package baitap.lab3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("nhanvien.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);        
        
        NhanVien[] objNV = new NhanVien[3];
        Scanner sc = new Scanner(System.in);
        String temp = "";
        for (int i = 0; i < 3; i++) {
            objNV[i] = new NhanVien("", "", 0, 0);
            System.out.print("Nhap ma nhan vien: ");
            temp = sc.nextLine();
            objNV[i].setMaNV(temp);
            System.out.print("Nhap ho ten nhan vien: ");
            temp = sc.nextLine();
            objNV[i].setHoten(temp);
            System.out.print("Nhap tuoi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            objNV[i].setTuoi(tuoi);
            System.out.print("Nhap luong: ");
            float luong = Float.parseFloat(sc.nextLine());
            objNV[i].setLuong(luong);   
            oos.writeObject(objNV[i]);
        }
//        oos.writeObject(objNV);
        
        oos.close();
        fos.close();
    }
}
