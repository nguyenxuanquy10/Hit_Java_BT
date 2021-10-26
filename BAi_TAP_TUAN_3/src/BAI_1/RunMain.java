package BAI_1;


public class RunMain{
      public static void main(String[] args){
          Person a= new Person("quy","nam",20,"game");
          System.out.println(a.toString()); 
          Person b= new Person(); 
          Person c= new Person(); 
         b.setAge(19);
         b.setGender("nu");
         b.setHobby("game");
         b.setName("duong");
         System.out.println(b.getAge());
         System.out.println(b.getGender());
         System.out.println(b.getHobby());
         System.out.println(b.getName());
         c.setAge(19);
         c.setGender("nu");
         c.setHobby("game");
         c.setName("duong");
         System.out.println(c.getAge());
         System.out.println(c.getGender());
         System.out.println(c.getHobby());
         System.out.println(c.getName());
      }
 }