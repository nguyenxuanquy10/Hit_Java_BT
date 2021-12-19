package Bai_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class RunMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<PERSON> kq = new ArrayList<>();
    try {
      System.out.println("NHAP n: ");
      int n = sc.nextInt();
      sc.nextLine();
      for (int i = 0; i < n; i++) {
        PERSON sub = new PERSON();
        sub.nhap(sc);
        kq.add(sub);
      }
      // sort by id
      System.out.println("SORT BY ID");
      Collections.sort(kq);
      kq.forEach(System.out::println);
      // sort name
      System.out.println("SORT BY NAME");
      Collections.sort(kq, new Comparator<PERSON>() {
        @Override
        public int compare(PERSON o1, PERSON o2) {
          if (o1.getName().compareTo(o2.getName()) == 0) {
            return o2.getAddress().compareTo(o1.getAddress());
          }
          return o1.getName().compareTo(o2.getName());
        }
      });
      kq.forEach(System.out::println);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}