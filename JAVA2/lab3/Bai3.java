package baitap.lab3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bai3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
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
