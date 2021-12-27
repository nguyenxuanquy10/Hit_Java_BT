
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit;

public class App {
  public void writetofile(List<Student> result) {
    for (Student i : result) {
      System.out.println(i.toString());
    }
    try {
      FileWriter fw = new FileWriter("data1.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      for (Student i : result) {
        System.out.println(i);
        bw.write(i.toString());
        bw.newLine();
      }
      bw.close();
      fw.close();
    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public static void readfile(List<Student> result) {
    try {
      FileReader fr = new FileReader("data1.txt");
      BufferedReader br = new BufferedReader(fr);
      String line = "";
      while (true) {
        line = br.readLine();
        String[] subresult = line.split(";");
        Student substudent = new Student(subresult[0], Integer.valueOf(subresult[1]), subresult[2]);
        if (line == null)
          break;
        result.add(substudent);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) throws IOException {
    Student s1 = new Student("quy", 18, "name");
    Student s2 = new Student("quy1", 18, "name");
    Student s3 = new Student("quy2", 18, "name");
    Student s4 = new Student("quy2", 18, "name");
    List<Student> result = new ArrayList<>();
    readfile(result);
    result.forEach(i -> System.out.println(i.toString()));

  }
}

class Student {
  private String name;
  private int age;
  private String gender;

  public Student(String name, int age, String gender) {
    this.age = age;
    this.name = name;
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "infora: " + name + " " + age + " " + gender;
  }
}