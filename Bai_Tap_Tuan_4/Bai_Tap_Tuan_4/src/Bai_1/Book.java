package Bai_1;

import java.util.Scanner;

public class Book {
    private String MaSach;
    private String TenSach;
    private String NhaXuatBan;
    private int SoTrang;
    private int GiaTien;

    public void Nhap() {

        Scanner sc = new Scanner(System.in);

        System.out.println("NHAP MA SACH");
        MaSach = sc.nextLine();
        System.out.println("NHAP TEN SACH");
        TenSach = sc.nextLine();
        System.out.println("NHAP NHA XUAT BAN");
        NhaXuatBan = sc.nextLine();
        System.out.println("NHAP SO TRANG");
        SoTrang = sc.nextInt();
        System.out.println("NHAP GIA TIEN");
        GiaTien = sc.nextInt();
        System.out.println();

    }

    public void Xuat() {

        System.out.println(" MA SACH: " + MaSach);

        System.out.println(" TEN SACH: " + TenSach);

        System.out.println(" NHA XUAT BAN: " + NhaXuatBan);

        System.out.println(" SO TRANG: " + SoTrang);

        System.out.println(" GIA TIEN: " + GiaTien);

        System.out.println();
    }
}
