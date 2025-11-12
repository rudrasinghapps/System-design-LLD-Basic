package SystemDesign.class19.Raw;

public class Srishti extends Human {



     int num = 50;
     String level = "Hard -> Extream";


    @Override
    void name() {
        System.out.println("Srishti");
    }

    @Override
    void passObj(Visitor visitor) {
       visitor.visit(this);
    }
}
