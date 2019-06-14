package baitap.lab3;

import java.io.Serializable;

public class NhanVien implements Serializable{
    private String maNV;
    private String hoten;
    private int tuoi;
    private float luong;

    public NhanVien(String maNV, String hoten, int tuoi, float luong) {
        this.maNV = maNV;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    @Override
    public String toString() {
        return (getMaNV() + "\t" + getHoten() + "\t" + getTuoi() + "\t" + getLuong() + "\n");
    }
}
