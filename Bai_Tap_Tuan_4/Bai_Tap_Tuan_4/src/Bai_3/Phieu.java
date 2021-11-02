package Bai_3;

import java.util.Scanner;

public class Phieu {
    private String MAPHIEU;
    private Hang[] x;
    private int n;

    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MA PHIEU: ");
        MAPHIEU = sc.nextLine();
        System.out.println("NHAP N: ");
        n = sc.nextInt();
        x = new Hang[n];
        System.out.println("NHAP THONG TIN HANG");
        for (int i = 0; i < n; i++) {

            System.out.println("NHAP HANG THU: " + (i + 1));
            x[i] = new Hang();
            x[i].NHAP();
        }
    }

    public void XUAT() {
        System.out.println("MA PHIEU: " + MAPHIEU);
        System.out.println("XUAT THOGN TIN HANG");
        int TONGTIEN = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("THONG TIN MAT HANG THU: " + (i + 1));
            x[i].XUAT();
            TONGTIEN += x[i].getDonGia();
        }
        System.out.println("TONG TIEN LA: " + TONGTIEN);
    }
}
