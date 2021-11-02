package Bai_5;

public class RunMain {
    public static boolean isPrime(int n){
       if(n<1) return false; 
       for(int i=2;i*i<=n;i++){
           if(n%i==0) return false; 
       }

       return true; 
    }
    public static boolean isPrime(long n){
        if(n<1) return false; 
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false; 
        }
 
        return true; 
     }
     public static boolean isPrime(float n){
        if((int)n!=n) return false; 
        if(n<1) return false; 
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false; 
        }
        return true; 
     }
     public static boolean isPrime(double n){
       // if((int)n!=n) return false; 
        if(n<1) return false; 
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false; 
        }
        return true; 
     }
    public static void main(String[] args) {
        System.out.println(isPrime(3)); 
        System.out.println(isPrime(10)); 
        System.out.println(isPrime(19l)); 
        System.out.println(isPrime(20l)); 
        System.out.println(isPrime(3.0f)); 
        System.out.println(isPrime(20.0f)); 
        System.out.println(isPrime(19.123)); 
        System.out.println(isPrime((double)20.00)); 
    }
}
