package baitap.lab3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class bai5 {

    public static void main(String[] args) {
        try {           
            FileInputStream fis = new FileInputStream("nhanvien.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            System.out.println("Doc file nhanvien.bin");
            NhanVien[] objNV = new NhanVien[3];
            for(int i = 0; i < 3; i++) {
                objNV[i] = (NhanVien) ois.readObject();
                System.out.println(objNV[i].toString());
            }
            
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
