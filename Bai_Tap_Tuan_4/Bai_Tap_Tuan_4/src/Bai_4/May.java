package Bai_4;

import java.util.Scanner;

public class May {
    private String MAMAY;
    private String KIEUMAY;
    private String TINHTRANG;

    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MA MAY: ");
        MAMAY = sc.nextLine();
        System.out.println("NHAP KIEU MAY: ");
        KIEUMAY = sc.nextLine();
        System.out.println("NHAP TINH TRANG: ");
        TINHTRANG = sc.nextLine();
    }

    public void XUAT() {
        System.out.println("MA MAY: " + MAMAY);

        System.out.println("KIEU MAY: " + KIEUMAY);

        System.out.println("TINH TRANG: " + TINHTRANG);
    }
}
