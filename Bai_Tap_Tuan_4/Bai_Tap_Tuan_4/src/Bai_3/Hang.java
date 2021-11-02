package Bai_3;

import java.util.Scanner;

public class Hang {
    private String MAHANG;
    private String TENHANG;
    private double DONGIA;

    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MA HANG: ");
        MAHANG = sc.nextLine();
        System.out.println("NHAP TEN HANG:");
        TENHANG = sc.nextLine();
        System.out.println("NHAP DON GIA: ");
        DONGIA = sc.nextDouble();
    }

    public void XUAT() {
        System.out.println("MA HANG: " + MAHANG);
        System.out.println("TEN HANG:" + TENHANG);
        System.out.println("DON GIA: " + DONGIA);
    }
    public double getDonGia(){
        return this.DONGIA;
    }
}
