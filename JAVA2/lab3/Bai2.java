package baitap.lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) throws IOException, NullPointerException {
        FileWriter fw = new FileWriter("nhanvien.txt");

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
            fw.write(objNV[i].getMaNV() + "\t" + objNV[i].getHoten() + "\t" + objNV[i].getTuoi() + "\t" + objNV[i].getLuong() +"\n");
        }
        fw.close();
        
//        for(int i = 0; i < 3; i++) {
//            System.out.println(objNV[i].toString());
//        }
        FileReader fr = new FileReader("nhanvien.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String text;
        while((text = br.readLine()) != null) {
            System.out.println(text);
        }
        
        br.close();
        fr.close();
    }
}
