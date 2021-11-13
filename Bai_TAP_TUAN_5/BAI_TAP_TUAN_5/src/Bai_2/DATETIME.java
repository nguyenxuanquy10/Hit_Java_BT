package Bai_2;
import java.util.Scanner; 
public class DATETIME {
    private int NGAY; 
    private int THANG; 
    private int NAM; 
    public void INPUTDATE(){
        Scanner sc= new Scanner(System.in);
        System.out.println("NHAP NGAY: ");NGAY=sc.nextInt();
        System.out.println("NHAP THANG: "); THANG=sc.nextInt();
        System.out.println("NHAP NAM: "); NAM=sc.nextInt(); 
    }
    public void OUTPUTDATE(){
         System.out.println("NHAP NGAY: "+NGAY);
        System.out.println("NHAP THANG: "+THANG);
        System.out.println("NHAP NAM: "+NAM);  
    }
}
