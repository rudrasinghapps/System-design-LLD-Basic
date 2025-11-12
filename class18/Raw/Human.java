package SystemDesign.class18.Raw;

public abstract class Human {

    public String calculate(int number ){
         String talaMu = totalMu(number);
        String type =  muType(talaMu);
        String level =  level(type);
        String catogery = catogery(level);
        return catogery;
    }

    public abstract String totalMu(int num);
    public abstract String muType(String str);
    public abstract String level(String  str);
    public abstract String catogery(String str);
}
