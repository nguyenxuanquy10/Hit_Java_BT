package BTL_JAVA;

//import java.util.F
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Read_File {
    private static final String NameFile = "data.txt";
    public static void DocFile(List<SinhVien> result) throws Exception {
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null)
                    break;
                String[] SubResult = line.split("-");
                // for(String o: SubResult) System.out.println(o);
                result.add(new SinhVien(SubResult[0], SubResult[1], SubResult[2], SubResult[3], SubResult[4],
                        SubResult[5], SubResult[6],
                        SubResult[7], SubResult[8], SubResult[9],SubResult[10], Double.parseDouble(SubResult[10]), SubResult[11],
                        SubResult[12], SubResult[13]));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void GhiFile(List<SinhVien> result) throws Exception {
        if (result.isEmpty()) {
            System.out.println("There Is No sinhvien in File");
            return;
        }
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (SinhVien o : result) {
                // System.out.println(o.toString());
                bw.write(o.toStringFile());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
