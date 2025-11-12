package SystemDesign.class19.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static void main() {
        List<Shape> list = new ArrayList<>();
        Circle cr = new Circle();
        Rectangle rc = new Rectangle();
         Triangle tr = new Triangle();
         list.add(cr);
         list.add(rc);
         list.add(tr);

         Details details = new Details();

         for(Shape sh:list){
            sh.draw();
            sh.accept(details);
         }
    }
}
