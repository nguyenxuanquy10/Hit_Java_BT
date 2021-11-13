package Bai_3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class RunMain {
    public static void main(String[] args) {
        LOPHOC lophoc = new LOPHOC();
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MALH:");
        String MALH = sc.nextLine();
        lophoc.setMALH(MALH);
        System.out.println("NHAP TENLH:");
        String TENLH = sc.nextLine();
        lophoc.setTENLH(TENLH);
        System.out.println("NHAP NGAYMO: ");
        String NGAYMO = sc.nextLine();
        lophoc.setNGAYMO(NGAYMO);
        System.out.println("NHAP N");
        int N = sc.nextInt();
        lophoc.setN(N);
        sc.nextLine();
        ArrayList<SINHVIEN> sinhvien0 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            System.out.println("NHAP THONG TIN sinh vien thu " + (i + 1));
            NGUOI nguoi = new NGUOI();
            nguoi.NHAP();
            SINHVIEN sinhvien = new SINHVIEN();
            sinhvien.setNGUOI(nguoi);
            System.out.println("NHAP MASV");
            String MASV = sc.nextLine();
            sinhvien.setMASV(MASV);
            System.out.println("NHAP NGANH");
            String NGANH = sc.nextLine();
            sinhvien.setNGANH(NGANH);
            System.out.println("NHAP KHOAHOC");
            int KHOAHOC = sc.nextInt();
            sinhvien.setKHOAHOC(KHOAHOC);
            sc.nextLine();
            sinhvien0.add(sinhvien);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("XUAT THONG TIN SINH VIEN " + (i + 1));
            sinhvien0.get(i).XUAT();
            System.out.println("MASV " + sinhvien0.get(i).getMASV());
            System.out.println("NGANH " + sinhvien0.get(i).getNGANH());
            System.out.println("KHOAHOC " + sinhvien0.get(i).getKHOAHOC());
        }
        int dem=0; 
        for (int i = 0; i < N; i++) {
            if (sinhvien0.get(i).getKHOAHOC() == 15) {
                dem++; 
            }
        }
        System.out.println("SO LUONG SINH VIEN KHOA 15 la: "+ dem);
        System.out.println("THONG TIN SINH VIEN SAP XEP LAI: ");
        Collections.sort(sinhvien0, new SINHVIEN());
        for (int i = 0; i < N; i++) {
            System.out.println("XUAT THONG TIN SINH VIEN " + (i + 1));
            sinhvien0.get(i).XUAT();
            System.out.println("MASV " + sinhvien0.get(i).getMASV());
            System.out.println("NGANH " + sinhvien0.get(i).getNGANH());
            System.out.println("KHOAHOC " + sinhvien0.get(i).getKHOAHOC());
        }
    }
}
