package Bai00;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

@FunctionalInterface
interface okema {
    public String say(String time1);
}

public class RunMain {
    public static void main(String[] args) {
        System.out.println("1.Add new material");
        System.out.println("2.Delete material");
        System.out.println("3.Show the in4 material");
        System.out.println("4.Search material");
        System.out.println("5.Exit program");
        Scanner sc = new Scanner(System.in);
        ManageBook magabook = new ManageBook();
        while (true) {
            int x = sc.nextInt();
            System.out.println("1.add book");
            System.out.println("2.add magazine");
            System.out.println("3.add newspaper");

            switch (x) {
            case 1: {
                int y = sc.nextInt();
                switch (y) {
                case 1: {
                    CommonBook book = new Book("book", "book1", "book2", "book3", 18);
                    magabook.AddMaterial(book);
                    CommonBook book1 = new Book("book1", "book1", "book2", "book3", 18);
                    magabook.AddMaterial(book1);
                    CommonBook book2 = new Book("book2", "book1", "book2", "book3", 18);
                    magabook.AddMaterial(book2);
                    break;
                }
                case 2: {
                    CommonBook magazine = new Maga("maga", "maga1", "maga2", "maga3", "maga4");
                    magabook.AddMaterial(magazine);
                    break;
                }
                case 3: {
                    break;

                }
                }
                break;
            }
            case 2: {
                magabook.DeleteMaterial("book");
                break;
            }
            case 3:{
                magabook.Showin4();
                break;
            }
            case 4:{
                magabook.ShowparticularBook();
                break; 
            }
            }
        }
    }
}
