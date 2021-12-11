package Bai_3;

import java.util.Scanner;
import java.util.ArrayList;

public class RunMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<News> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            Menu();
            System.out.println("Nhap lua chon cua ban");
            int x = sc.nextInt();
            switch (x) {
                case 1: {
                    t1(result);
                    break; 
                }
                case 2: {
                    t2(result);
                    break; 
                }
                case 3: {
                    t3(result);
                    break;
                }
                case 4: {
                    t4();
                    break; 
                }
            }
        }
    }

    public static void Menu() {
        System.out.println("1.Insert news");
        System.out.println("2.View list news");
        System.out.println("3.Average rate");
        System.out.println("4.Exit");
    }

    public static void t1(ArrayList<News> result) {
        News new1 = new News();
        System.out.println("Nhap Title: ");
        new1.setTitle(sc.nextLine());
        System.out.println("Nhap pushlishDate: ");
        new1.setPublishDate(sc.nextLine());
        System.out.println("Nhap author: ");
        new1.setAuthor(sc.nextLine());
        System.out.println("Nhap content: ");
        new1.setContent(sc.nextLine());
        System.out.println("Nhap danh gia: ");
        new1.inputRateList();
        result.add(new1);
    }

    public static void t2(ArrayList<News> result) {
        result.forEach(o -> o.Display());
    }

    public static void t3(ArrayList<News> result) {
        result.forEach(o -> o.Calculate());
        t2(result);
    }

    public static void t4() {
        System.exit(0);
    }
}