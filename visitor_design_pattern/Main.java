package SystemDesign.visitor_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        Mobile mobile = new Mobile("Samsung", "Galaxy S21", 128, 35000);
        Laptop laptop = new Laptop("Dell", "Inspiron 15", 16, 55000);

        BrandFinder brandFinder = new BrandFinder();
        ModelFinder modelFinder = new ModelFinder();

        mobile.accept(brandFinder);
        mobile.accept(modelFinder);

        System.out.println("-------------");

        laptop.accept(brandFinder);
        laptop.accept(modelFinder);
    }
}
