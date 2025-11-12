package SystemDesign.singleton_design_pattern;

public class Main {
    static void main() {

        SingletonClass singletonClass = SingletonClass.getObject();
        SingletonClass singletonClass1 = SingletonClass.getObject();
        SingletonClass singletonClass2 = SingletonClass.getObject();

        System.out.println(singletonClass);
        System.out.println(singletonClass1);
        System.out.println(singletonClass2);

        System.out.println(singletonClass.hashCode());
        System.out.println(singletonClass1.hashCode());
        System.out.println(singletonClass2.hashCode());


    }
}
