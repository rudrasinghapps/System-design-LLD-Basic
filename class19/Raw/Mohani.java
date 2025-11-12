package SystemDesign.class19.Raw;

public class Mohani extends Human {


    int num = 900;
    String level = "Easy -> Hard";


    @Override
    void name() {
        System.out.println("Mohani");
    }

    @Override
    void passObj(Visitor visitor) {
       visitor.visit(this);
    }
}
