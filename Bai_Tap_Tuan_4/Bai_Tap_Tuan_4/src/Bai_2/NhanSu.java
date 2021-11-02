package Bai_2;

import java.util.Scanner;

public class NhanSu {
    private String MANHASU;
    private String HOTEN;
    private Date NS;

    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MA NHAN SU: ");
        MANHASU = sc.nextLine();
        System.out.println("NHAP HO TEN");
        HOTEN= sc.nextLine();
        NS=new Date();
        NS.NHAP();
    }

    public void XUAT() {
        System.out.println("MA NHAN SU: " + MANHASU);
        System.out.println("HO TEN: " + HOTEN);
        NS.XUAT();
    }
}
