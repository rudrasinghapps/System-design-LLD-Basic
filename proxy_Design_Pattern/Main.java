package SystemDesign.proxy_Design_Pattern;

public class Main {
    static void main()  {
         ProxyClass proxyClass = new ProxyClass();

        System.out.println(proxyClass.calculateTask(5));
        System.out.println(proxyClass.calculateTask(5));
        System.out.println(proxyClass.calculateTask(6));
        System.out.println(proxyClass.calculateTask(7));
        System.out.println(proxyClass.calculateTask(8));
        System.out.println(proxyClass.calculateTask(9));
        System.out.println(proxyClass.calculateTask(6));


    }
}
