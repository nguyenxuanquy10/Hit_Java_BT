package Bai_3;
import java.util.Scanner;
public class News implements INews {
    static Scanner sc= new Scanner(System.in);
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rateList = new int[3];

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return this.averageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + title + "\tpublishDate: " + publishDate + "\tAuthor: " + author + "\tContent: "
                + content + "\tAverageRate: " + averageRate);

    }

    public void Calculate() {
        int sum = 0;
        for (int i = 0; i < rateList.length; i++) {
            sum += rateList[i];
        }
        this.averageRate = (float) sum / 3;
    }
    public void inputRateList(){
        for(int i=0;i<rateList.length;i++){
           rateList[i]=sc.nextInt();
        }
    }
}
