package SystemDesign;

import java.util.ArrayList;
import java.util.List;

public interface I {
    void m1();
}

class A implements I {


    public void m1() {
        System.out.println(" Interface A -> M1");
    }
    public void m2() {
        System.out.println(" class A -> M2");
    }

}
class B implements I{

    @Override
    public void m1() {
        System.out.println("Interface B -> M1 ");
    }
    public void m3() {
        System.out.println(" class B -> M3");
    }
}

class Main{
    static void main() {
        I a = new A();
      //  a.m1();

        I a1 = new A();

        I a2 = new A();

        I b = new B();
        I b1 = new B();


        List<I> list = new ArrayList<>();
        list.add(a);
        list.add(a1);
        list.add(a2);
        list.add(b);
        list.add(b1);

        for(I e:list){
         //   e.m1();
          //  if (e instanceof A) ((A) e).m2();
            if (e instanceof B) ((B) e).m3();
        }
    }
}
