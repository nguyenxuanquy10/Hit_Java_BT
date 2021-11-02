package Bai_4;

import java.util.Scanner;

public class PhongMay {

    private String MAPHONG;
    private String TENPHONG;
    private double DIENTICH;
    private QuanLy x;
    private May[] y;
    private int n;

    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MA PHONG :");
        MAPHONG = sc.nextLine();
        System.out.println("NHAP TEN PHONG :");
        TENPHONG = sc.nextLine();
        System.out.println("NHAP DIEN TICH:");
        DIENTICH = sc.nextDouble();
        System.out.println("NHAP THONG TIN QUAN LY: ");

        x= new QuanLy();
        x.NHAP();
        System.out.println("NHAP N: ");
        n = sc.nextInt();
        y = new May[n];
        System.out.println("NHAP THONG TIN MAY");
        for (int i = 0; i < n; i++) {
            System.out.println("NHAP THONG TIN MAY THU : " + (i + 1));
            y[i] = new May();
            y[i].NHAP();
        }

    }

    public void XUAT() {
        System.out.println("XUAT THONG TIN MAY:");
        for (int i = 0; i < n; i++) {
            System.out.println("THONG TIN MAY THU: " + (i + 1));
            y[i].XUAT();
        }
    }

}
