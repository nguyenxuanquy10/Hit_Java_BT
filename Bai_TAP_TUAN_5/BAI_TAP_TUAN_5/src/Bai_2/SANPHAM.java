package Bai_2;

import java.util.Scanner;

public class SANPHAM {
    private String MASP;
    private String TENSP;
    private int SOLUONG;
    private double DONGIA;

    public void INPUTSP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MASP: ");MASP = sc.nextLine();
        System.out.println("NHAP TENSP: ");TENSP = sc.nextLine();
        System.out.println("NHAP SOLUONG: ");SOLUONG = sc.nextInt();
        System.out.println("NHAP DONGIA: ");DONGIA = sc.nextDouble();
    }

    public void OUTPUTSP() {
        System.out.println("NHAP MASP: "+MASP);
        System.out.println("NHAP TENSP: "+TENSP);
        System.out.println("NHAP SOLUONG: "+SOLUONG);
        System.out.println("NHAP DONGIA: "+DONGIA);
        System.out.println("THANG TIEN: "+DONGIA*SOLUONG);
    }
    public int getSOLUONG() {
        return this.SOLUONG;
    }

   
    public double getDONGIA() {
        return this.DONGIA;
    
    }
}