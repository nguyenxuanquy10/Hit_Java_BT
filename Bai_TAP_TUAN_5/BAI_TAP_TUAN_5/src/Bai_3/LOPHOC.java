package Bai_3;
import java.util.ArrayList;
import java.util.Scanner;
public class LOPHOC {
    private String MALH; 
    private String TENLH; 
    private String NGAYMO; 
    private String GIAOVIEN; 
    private ArrayList<SINHVIEN> x; 
    private int n;
    public String getMALH() {
        return this.MALH;
    }

    public void setMALH(String MALH) {
        this.MALH = MALH;
    }

    public String getTENLH() {
        return this.TENLH;
    }

    public void setTENLH(String TENLH) {
        this.TENLH = TENLH;
    }

    public String getNGAYMO() {
        return this.NGAYMO;
    }

    public void setNGAYMO(String NGAYMO) {
        this.NGAYMO = NGAYMO;
    }

    public String getGIAOVIEN() {
        return this.GIAOVIEN;
    }

    public void setGIAOVIEN(String GIAOVIEN) {
        this.GIAOVIEN = GIAOVIEN;
    }

    public ArrayList<SINHVIEN> getX() {
        return this.x;
    }

    public void setX(ArrayList<SINHVIEN> x) {
        this.x = x;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }
     public LOPHOC(){
         x=new ArrayList<>(n);
     }     
     
}
