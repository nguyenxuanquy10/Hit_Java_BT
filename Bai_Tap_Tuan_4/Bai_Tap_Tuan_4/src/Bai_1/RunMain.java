package Bai_1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("NHAP N: ");
        n = sc.nextInt();
        Book[] book = new Book[n];
        for (int i = 0; i < n; i++) {
        
            System.out.println("NHAP THONG TIN CUON SACH THU: " + (i + 1));
            book[i] = new Book();
            book[i].Nhap();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("THONG TIN CUON SACH THU" + (i + 1));
            book[i].Xuat();
        }
    }
}