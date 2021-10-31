package Bai_2;
import java.util.Scanner; 
public class Array {
    private int N; 
    private int[] a;
    public void InputData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap n: ");
        N= sc.nextInt(); 
        a= new int[N];
        System.out.println("nhap phan tu mang: "); 
        for(int i=0;i<N;i++){
           a[i]=sc.nextInt();
        }
    }
    public void Show(){
      System.out.println("xuat mang: "); 
      for(int i=0;i<N;i++){
          System.out.print(a[i]+" "); 
      }
      System.out.println();
    }
    public int Sum(){
        int tong=0; 
        for(int i=0;i<N;i++){
            tong+=a[i]; 
        }
        return tong; 
    }
    public void Filter(boolean t){
        if(t){
            System.out.println("Cac so chan:");
            for(int i=0;i<N;i++){
                if(a[i]%2==0){
                    System.out.print(a[i]+" ");
                }
            }
        }
        else{
            System.out.println("Cac so le"); 
            for(int i=0;i<N;i++){
                if(a[i]%2==1){
                    System.out.println(a[i]+" ");
                }
            }
        }
        System.out.println();
    }
    public int getN() {
        return this.N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public int[] getA() {
        return this.a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public Array(int N, int[] a) {
        this.N = N;
        this.a = a;
    }
    public Array(){
       this.N=0; 
       this.a=null; 
    }

}
