package Bai_2; 

public class RunMain{
    public static void main(String[] args) {
        Array arr1= new Array(); 
        Array arr2= new Array(); 
        
        arr1.InputData();
        arr2.InputData();
        double tbc1=(double)arr1.Sum()/arr1.getN(); 
        double tbc2=(double)arr2.Sum()/arr2.getN(); 
        System.out.println(tbc1); 
        if(tbc1>tbc2){
            System.out.println("Day 1 lon hon"); 
        }
        else if(tbc1<tbc2){
            System.out.println("Day 2 lon hon"); 
        }
        else System.out.println("Bye");
    }
}