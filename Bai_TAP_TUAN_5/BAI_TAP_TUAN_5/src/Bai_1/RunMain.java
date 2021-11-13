package Bai_1;
import java.util.ArrayList;
import java.util.Scanner; 
import java.lang.Math;
public class RunMain {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("NHAP N");
        int n=sc.nextInt();
        ArrayList<DieuHoa> dieuhoa=new ArrayList<>(n);
        System.out.println("NHAP THONG TIN DIEU HOA");
        for(int i=0;i<n;i++){
            System.out.println("NHAP DIEU HOA THU: "+ (i+1));
            DieuHoa dieuhoa1= new DieuHoa(); 
            dieuhoa1.NHAP();
            dieuhoa.add(dieuhoa1);
        }
        for(int i=0;i<n;i++){
            if(dieuhoa.get(i).getTENHANGSP().equals("Electrolux")){
                dieuhoa.get(i).XUAT();
            }
        }
        if(n<0){
            System.out.println("KHONG TON TAI"); 
            System.exit(0);
        }
        int MINGIA=dieuhoa.get(0).getGIABAN();
        for(int i=1;i<n;i++){
             MINGIA=Math.min(MINGIA,dieuhoa.get(i).getGIABAN());
        }
        System.out.println("GIA BAN THAP NHAT: "+MINGIA);
    }

}
