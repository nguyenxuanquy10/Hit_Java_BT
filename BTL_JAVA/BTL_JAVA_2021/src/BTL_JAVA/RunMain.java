package BTL_JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien manage = new QuanLySinhVien();
        manage.DocFile1();
        manage.XuatDuLieu();
        // while(true){
        TitleLogin();
        int x = sc.nextInt();
        switch (x) {
            case 1: {
                LogInForAdmin(sc);
                boolean choosequanly = true;
                while (choosequanly) {
                    sc.nextLine();
                    int yourchoose = sc.nextInt();
                    MenuQuanLy();
                    switch (yourchoose) {
                        case 1: {
                            String newId=sc.nextLine(); 
                            manage.TimKiemBangId(newId);
                            break;
                        }
                        case 2: {
                            String newId=sc.nextLine(); 
                            manage.XoaBangId(newId);
                            manage.VietFile1();
                            break;
                        }
                        case 3: {
                            
                            break;
                        }
                        case 4: {
                            break;
                        }
                        case 5: {
                            break;
                        }
                        case 6: {
                            break;
                        }
                        case 7: {
                            break;
                        }
                        case 8: {
                            break;
                        }
                        case 9: {
                            break;
                        }
                        case 10: {
                            break;
                        }
                        default: {
                            System.out.println("NHAP SAI,NHAP LAI");
                        }
                    }
                }
                break;
            }
            case 2: {
                SinhVien result = new SinhVien();
                List<SinhVien> account = new ArrayList<>();
                manage.LayTatCaSinhVien(account);
                System.out.println(account);
                LoginInForsinhvien(sc, account, result);
                System.out.println(result);
                boolean checkstudent = true;
                while (checkstudent) {
                    // System.out.println("1.Change All Common Information");
                    // System.out.println("2.Change Specific Information");
                    // System.out.println("3.Check For Schedule Subject");
                    // System.out.println("4.Check For Schedule Exam");
                    // System.out.println("5.Pay Fee");
                    // System.out.println("6.Chech GPA");
                    MenuForsinhvien();
                    int x1 = sc.nextInt();
                    switch (x1) {
                        case 1: {
                            result.ThayDoiThongTinCuThe(sc);
                            break;
                        }
                        case 2: {
                            result.CheckLichHoc();
                            break;
                        }
                        case 3: {
                            result.CheckLichThi();
                            break;

                        }
                        case 4: {
                            result.DongHoc(sc);
                            break;
                        }
                        case 5: {
                            result.CheckGPA();
                            break;
                        }
                        case 6: {
                            result.KhaiBaoYTe();
                            break;
                        }
                        case 7: {
                            result.XemThongTin();
                            break;
                        }
                        case 8: {
                            checkstudent = false;
                            break;
                        }
                        default: {
                            System.out.println("INVALID,INPUT AGAIN");
                        }
                    }
                }
                break;
            }
            case 3: {

                break;
            }
            default: {
                System.out.println("INVALID,INPUT AGAIN");
            }
        }
        SinhVien a= new SinhVien("2020606494","Abcde@11", "Nguyen Van A","18", "hanoi", "nam", "0979379087",
        "202000111", "full", "t2:toan/t3:ly", "t2:toan", 7.5, "good",
        "2", "f0");
        // sinhvien b= new sinhvien("NGUYEN B", "18", "hanoi", "women", "0979",
        // "202000123", "2020606495", "full", "t2:toan/t3:ly", "t2:toan", 7.5, "good",
        // "2", "f0");
        // sinhvien c= new sinhvien("NGUYEN C", "18", "hanoi", "women", "0979",
        // "202000123", "2020606496", "full", "t2:toan/t3:ly", "t2:toan", 7.5, "good",
        // "2", "f0");
        // sinhvien d= new sinhvien("NGUYEN D", "18", "hanoi", "women", "0979",
        // "202000123", "2020606497", "full", "t2:toan/t3:ly", "t2:toan", 7.5, "good",
        // "2", "f0");
        // sinhvien e= new sinhvien("NGUYEN E", "18", "hanoi", "women", "0979",
        // "202000123", "2020606498", "full", "t2:toan/t3:ly", "t2:toan", 7.5, "good",
        // "2", "f0");
        // sinhvien f= new sinhvien("NGUYEN F", "18", "hanoi", "women", "0979",
        // "202000123", "2020606499", "full", "t2:toan/t3:ly", "t2:toan", 7.5, "good",
        // "2", "f0");
        // manage.ThemSV(a);
        // manage.ThemSV(b);
        // manage.ThemSV(c);
        // manage.ThemSV(d);
        // manage.ThemSV(e);
        // manage.ThemSV(f);
        // manage.VietFile1();
    }

    public static void LogInForAdmin(Scanner sc) {
        sc.nextLine();
        while (true) {
            System.out.println("----------Nhap You Account----------");
            String ID = "admin";
            String PASSWORD = "admin";
            System.out.println("Nhap You ID: ");
            String newid = sc.nextLine();
            System.out.println("Nhap Your Password: ");
            String newpass = sc.nextLine();
            newid = newid.trim();
            newpass = newpass.trim();
            if (ID.equals(newid) && PASSWORD.equals(newpass)) {
                System.out.println("VALID ACCOUNT");
                break;
            }
            System.out.println("INVALILD ACCOUNT, INPUT AGAIN");
        }
    }

    public static void LoginInForsinhvien(Scanner sc, List<SinhVien> account, SinhVien result) {
        while (true) {
            sc.nextLine();
            System.out.println("----------Nhap You Account----------");
            System.out.println("Nhap You ID: ");

            String newid = sc.nextLine();
            System.out.println("Nhap Your Password: ");
            String newpass = sc.nextLine();
            String newid1 = newid.trim();
            newpass = newpass.trim();
            if (!newpass.equals(newid)) {
                System.out.println("INVALILD ACCOUNT, INPUT AGAIN");
            } else {
                SinhVien result1 = account.stream().filter(o -> o.getId().equals(newid1)).findFirst().orElse(null);
                result.SetTatCaThongTingNguoi(result1);
                System.out.println(result1);
                if (result != null) {
                    System.out.println("VALID ACCOUNT");
                    break;
                }
                System.out.println("INVALILD ACCOUNT, INPUT AGAIN");
            }
        }
    }

    public static void TitleLogin() {
        System.out.println("----------Access by Admin Account or sinhvien Account----------");
        System.out.println("----------Nhap 1 For Admin Account----------");
        System.out.println("----------Nhap 2 For sinhvien Account----------");
    }

    public static void MenuForsinhvien() {
        System.out.println("1.Thay Doi Thong Tin");
        System.out.println("2.Kiem Tra Lich Hoc");
        System.out.println("3.Kiem Tra Lich Thi");
        System.out.println("4.Dong Hoc");
        System.out.println("5.Kiem Tra GPA");
        System.out.println("6.Khai Bao Y Te");
        System.out.println("7.Xem Thong Tin");
        System.out.println("8.Thoat Chuong Trinh");
    }

    public static void MenuQuanLy() {
        System.out.println("1.Tim kiem sinh vien theo id");
        System.out.println("2.Xoa sinh vien theo id");
        System.out.println("3.Them mot sinh vien ");
        System.out.println("4.Them nhieu sinh vien");
        System.out.println("5.Tim kiem sinh vien theo cmt");
        System.out.println("6.Xoa sinh vien vien cmt");
        System.out.println("7.Xem thong tin sinh vien nhiem COVID");
        System.out.println("8.Kiem tra so luong sinh vien du dien kien den truong");
        System.out.println("9.Kiem tra thong tin sinh vien chua dong hoc");
        System.out.println("10.Kiem tra thong tin sinh vien dong day du");
        System.out.println("11.Kiem tra thong tin sinh vien dat hoc bong");
        System.out.println("12.Kiem tra thong tin sinh vien thi lai");
        System.out.println("13.Sap xep thong tin sinh vien theo GPA");
        System.out.println("14.Sap xep thong tin sinh vien theo ten");
        System.out.println("15.Sap xep thong tin theo ID");

    }
}
