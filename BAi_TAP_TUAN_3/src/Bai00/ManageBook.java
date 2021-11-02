package Bai00;

import java.util.ArrayList;
import java.util.List;

public class ManageBook {
    private List<CommonBook> ok;

    public ManageBook() {
        this.ok = new ArrayList<>();
    }

    public void AddMaterial(CommonBook subok) {
        this.ok.add(subok);
    }

    public boolean DeleteMaterial(String subok) {
        CommonBook deletebook = this.ok.stream().filter(o -> o.getIdCode().equals(subok)).findFirst().orElse(null);
        if (deletebook == null)
            return false;
        this.ok.remove(deletebook);
        return true;
    }

    public void Showin4() {
        this.ok.forEach(o -> System.out.println(o.toString()));
    }

    public void ShowparticularBook() {
        this.ok.stream().filter(commonbook -> commonbook instanceof Book)
                .forEach(book -> System.out.println(book.toString()));
    }
}
