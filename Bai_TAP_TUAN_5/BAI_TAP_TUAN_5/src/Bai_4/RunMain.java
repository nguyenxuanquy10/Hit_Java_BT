package Bai_4;

public class RunMain {
    public static void main(String[] args) {
       SUM<Integer> a=new SUM(); 
       a.setSoA(2);
       a.setSoB(1);; 
       System.out.println(a.getSoA()+a.getSoB());
       SUM<Long> a1=new SUM(); 
       a1.setSoA(2l);
       a1.setSoB(1l);; 
       System.out.println(a1.getSoA()+a1.getSoB());
       SUM<Float> a2=new SUM(); 
       a2.setSoA(2f);
       a2.setSoB(1f);; 
       System.out.println(a2.getSoA()+a2.getSoB());
       SUM<Double> a3=new SUM(); 
       a3.setSoA(2.0);
       a3.setSoB(1.0);; 
       System.out.println(a3.getSoA()+a3.getSoB());
    }
}
