package SystemDesign.Interface;

public class dis1 implements Temp{

    String displayName;

    dis1(String displayName){
        this.displayName = displayName;
    }

    @Override
    public void getData(String str ) {
        System.out.println("Dispaly  -----> " + this.displayName +"------>"+ str);
    }
}
