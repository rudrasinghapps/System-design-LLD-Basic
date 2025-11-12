package SystemDesign.Interface;

public class dis3  implements Temp{

    String displayName;

    dis3(String displayName){
        this.displayName = displayName;
    }

    @Override
    public void getData(String str) {
        System.out.println("Dispaly  -----> " + this.displayName +"------>"+ str);
    }
}
