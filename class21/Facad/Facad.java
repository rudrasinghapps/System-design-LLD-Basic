package SystemDesign.class21.Facad;

public class Facad {
    static void work(){
        A a = new A();
        B b =new B();
        C c = new C();

        int x =  a.fun1();
        int y = a.fun2(x);
        String str1 = b.fun3();
        String str2 = b.fun4();
        c.fun5(y,str1);
        c.fun6(str2);
    }
}
