package BTL_JAVA;

import java.util.Scanner;
import java.io.IOError;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class Main12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String[] name = { "quy", "quy1", "quy2", "quy3", "quy4" };
        List<String> a = new ArrayList<>(Arrays.asList(name));
        Iterator t= a.iterator(); 
       
        while(t.hasNext()){
            Object t1=t.next(); 
            System.out.println(t1);
        }
    }
}