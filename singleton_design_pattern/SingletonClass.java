package SystemDesign.singleton_design_pattern;

public class SingletonClass {

    private static volatile   SingletonClass instance;     //   read instance from main memory..

    private int x;
    private int y;

    private SingletonClass(int x ,int y){
        this.x = x;
        this.y = y;
    }

    public static  SingletonClass getObject(){
        if(instance == null) {
            synchronized (SingletonClass.class){                          // class level lock...
              if(instance == null)  instance= new SingletonClass(4,5);
            }

        }
        return instance;
    }


    @Override
    public String toString() {
        return "SingletonClass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
