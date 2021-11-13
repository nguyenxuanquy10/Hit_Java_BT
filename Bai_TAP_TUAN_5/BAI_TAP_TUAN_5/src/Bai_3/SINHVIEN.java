package Bai_3;

import java.util.Comparator;

public class SINHVIEN extends NGUOI implements Comparator<SINHVIEN>{
    private String MASV; 
    private String NGANH; 
    private int KHOAHOC; 

    public String getMASV() {
        return this.MASV;
    }

    public void setMASV(String MASV) {
        this.MASV = MASV;
    }

    public String getNGANH() {
        return this.NGANH;
    }

    public void setNGANH(String NGANH) {
        this.NGANH = NGANH;
    }
    public int getKHOAHOC() {
        return this.KHOAHOC;
    }

    public void setKHOAHOC(int KHOAHOC) {
        this.KHOAHOC = KHOAHOC;
    }  
    
    public void setNGUOI(NGUOI nguoi) {
        this.HOTEN=nguoi.HOTEN; 
        this.QUEQUAN=nguoi.QUEQUAN; 
        this.NGAYSINH=nguoi.NGAYSINH;
    }  
    
    public SINHVIEN() {
    }
    @Override
    public int compare(SINHVIEN a,SINHVIEN b){
        if(a.getKHOAHOC()>b.getKHOAHOC()) return 1; 
        return -1; 
    }
}
