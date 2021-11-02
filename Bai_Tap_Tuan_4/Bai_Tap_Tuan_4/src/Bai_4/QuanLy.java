package Bai_4;

import java.util.Scanner;

public class QuanLy {
    private String MAQL;
    private String HOTEN;

    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MAQL: ");
        MAQL = sc.nextLine();
        System.out.println("NHAP HO TEN: ");
        HOTEN = sc.nextLine();
    }

    public void XUAT() {
        System.out.println("MAQL: " + MAQL);

        System.out.println("HO TEN: " + HOTEN);

    }
}
