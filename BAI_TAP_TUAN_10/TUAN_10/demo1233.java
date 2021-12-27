package TUAN_10;

import java.util.Scanner;
import java.util.regex.Pattern;

import javax.sound.midi.Patch;

import java.util.*;

public class demo1233 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Pattern pt = Pattern.compile("^[0-9]$");
        while (true) {
            System.out.println("nhap txt");
            String txt = sc.nextLine();
           if(pt.matcher(txt).find()){
            System.out.println("hoi le");

               break; 
           }
            else{
                System.out.println("ko hoi le");
            }
        }
    }
}
