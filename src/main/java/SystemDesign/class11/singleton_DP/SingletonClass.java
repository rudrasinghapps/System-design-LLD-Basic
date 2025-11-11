package SystemDesign.class11.singleton_DP;

public class SingletonClass {

    private static  SingletonClass singletonClass;

    private int x;
    private int y;

    private SingletonClass(int x ,int y){
        this.x = x;
        this.y = y;
    }

    public static  SingletonClass getObject(){
        if(singletonClass == null) singletonClass = new SingletonClass(4,5);
        return singletonClass;
    }

    public void details(){
        System.out.println("Singleton class");
    }

    @Override
    public String toString() {
        return "SingletonClass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
