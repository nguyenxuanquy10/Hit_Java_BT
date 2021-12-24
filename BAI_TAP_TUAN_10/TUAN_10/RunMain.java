package TUAN_10;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class RunMain {
    private static final String NameFile = "ACC.txt";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> a = new ArrayList<>();
        DocFile(a);
        int n = 1;
        while (n <= 3 && n >= 0) {
            Menu();
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    addAccount(a, NameFile, sc);
                    break;
                }
                case 2: {
                    sc.nextLine(); 
                    System.out.println("nhap username");
                    String username = sc.nextLine();
                    System.out.println("nhap password");
                    String password = sc.nextLine();
                    Account kq = login(a, username, password, sc);
                    System.out.println("1.show info");
                    System.out.println("2.chang pass word");
                    int luachon = sc.nextInt();
                    switch (luachon) {
                        case 1: {
                            System.out.println(kq.toStringFile());
                            break;
                        }
                        case 2: {
                            sc.nextLine();
                            System.out.println("thay doi pass word");
                            kq.setPassWord(sc.nextLine());
                            updateFile(a);
                            GhiFile(a);
                            System.out.println("thay doi thanh cong");
                            break;
                        }
                        default: {
                            System.out.println("nhap sai lua chon,nhap lai");
                        }
                    }
                
                    break;

                }
                case 3: {
                    for (int i = 0; i < a.size(); i++) {
                        for (int j = i + 1; j < a.size(); j++) {
                            if (a.get(i).getUserName().compareTo(a.get(j).getUserName()) == -1) {
                                Collections.swap(a, i, j);
                            }
                        }
                    }
                    System.out.println("Sap xep");
                    a.forEach(o->System.out.println(o.toStringFile()));
                    updateFile(a);
                    GhiFile(a);
                    break;
                }
                default: {
                    System.out.println("thoat chuong tinh");
                }
            }
        }
    }

    // lua chon 1
    static void addAccount(ArrayList<Account> a, String nameFile, Scanner sc) throws Exception {
        Account kq = new Account();

        // regex id va username
        while (true) {
            System.out.println("nhap id: ");
            kq.setId(sc.nextLong());
            sc.nextLine();
            System.out.println("nhap username: ");
            kq.setUserName(sc.nextLine().trim());
            while (kq.getUserName().matches("[a-zA-Z0-9]{6,}$") == false) {
                System.out.println("nhap lai");
                kq.setUserName(sc.nextLine().trim());
            }
            if (kiemtra(a, kq) == true) {
                System.out.println("lap id,user,nhap lai");
            } else {
                System.out.println("hop le");
                break;
            }
        }

        // nhap full name:
        System.out.println("nhap full name: ");
        kq.setFulName(sc.nextLine());

        // regex for user
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$");
        while (true) {
            System.out.println("nhap password");
            kq.setPassWord(sc.nextLine());
            if (p.matcher(kq.getPassWord()).find()) {
                System.out.println("hop le");
                break;
            } else {
                System.out.println("nhap sai,nhap lai");
            }
        }

        // nhap lai password
        System.out.println("nhap lai password");
        String checkpass = sc.nextLine();
        while (checkpass.compareTo(kq.getPassWord()) != 0) {
            System.out.println("nhap lai, ko chinh xac");
            checkpass = sc.nextLine();
            checkpass = checkpass.trim();
        }
        System.out.println("hop le");
        p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        while (true) {
            System.out.println("nhap email");
            kq.setEmail(sc.nextLine());
            if (p.matcher(kq.getEmail()).find()) {
                break;
            } else {
                System.out.println("nhap sai,nhap lai");
            }
        }

        // regex for phone
        p = Pattern.compile("^[0-9]{10}");
        while (true) {
            System.out.println("nhap phone");
            kq.setPhone(sc.nextLine());
            if (p.matcher(kq.getPhone()).find()) {
                System.out.println("hop le");
                break;
            } else {
                System.out.println("nhap sai,nhap lai");
            }
        }

        // regex for time
        p = Pattern.compile("^(\\d\\d:\\d\\d:\\d\\d)");
        Pattern p1 = Pattern.compile("\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}:\\d{2}");
        while (true) {
            System.out.println("nhap time");
            kq.setCreateAt(sc.nextLine());
            if (p.matcher(kq.getCreateAt()).find() || p1.matcher(kq.getCreateAt()).find()) {
                System.out.println("hop le");
                break;
            } else {
                System.out.println("nhap sai,nhap lai");
            }
        }
        a.add(kq);
     updateFile(a);
    }

    // lua chon 2
    static Account login(ArrayList<Account> a, String username, String password, Scanner sc) {
      
        boolean flat = true;
        while (flat) {
            for (Account o : a) {
                if (o.getUserName().compareTo(username) == 0 && o.getPassWord().compareTo(password) == 0) {
                    System.out.println("hop le");
                    flat = false;
                    return o;
                }
            }
            System.out.println("nhap lai username");
            username = sc.nextLine();
            System.out.println("nhap lai password");
            password = sc.nextLine();
            System.out.println("nhap sai id,password");
        }
        return null;
    }

    // menu
    static void Menu() {
        System.out.println("1.Create new account.");
        System.out.println("2.Login to an existing account.");
        System.out.println("3.Sort accounts by username.");
        System.out.println("4.Exit");
    }

    // doc file
    public static void DocFile(List<Account> a) throws Exception {
        // System.out.println("doc ile");
        try {
            FileReader fr = new FileReader(NameFile);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                // System.out.println(line);
                line = br.readLine();
                if (line !=null) {
                    String[] Suba = line.split("-");
                   System.out.println(Arrays.toString(Suba));
                   if(Suba[0].length()>0)
                     a.add(new Account(Long.parseLong(Suba[0]),Suba[1],Suba[2],Suba[3],Suba[4],Suba[5],Suba[6]));
                }
                else break;  
              
            }
            br.close();
            fr.close();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // update file
    public static void updateFile(List<Account> a) throws Exception {
        try {
            FileWriter fr = new FileWriter(NameFile);
            BufferedWriter br = new BufferedWriter(fr);
            for (Account o : a) {
                // System.out.println(o.toStringFile());
                br.write(o.toStringFile());
                br.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // check id, user name
    public static boolean kiemtra(List<Account> a, Account b) throws Exception {
        for (Account o : a) {
            if (o.getId() == b.getId() || o.getUserName().compareTo(b.getUserName()) == 0) {
                return true;
            }
        }
        return false;
    }

    // ghi file
    public static void GhiFile(List<Account> a) throws Exception {
        try {
            FileWriter fw = new FileWriter(NameFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Account o : a) {
                // System.out.println(o.toString());
                bw.write(o.toStringFile());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
