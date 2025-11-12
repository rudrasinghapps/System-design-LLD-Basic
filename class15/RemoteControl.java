package SystemDesign.class15;

public class RemoteControl {
    Commond commond1;
    Commond commond2;
    Commond commond3;
    Commond commond4;

    public void button1(){
        if(commond1 == null){
            System.out.println("Not Assight");
            return;
        }
          commond1.execute();
    }

    public void button2(){
        if(commond2 == null){
            System.out.println("Not Assight");
            return;
        }
      commond2.execute();
    }

    public void button3(){
        if(commond3 == null){
            System.out.println("Not Assight");
            return;
        }
     commond3.execute();
    }

    public void button4(){
        if(commond4 == null){
            System.out.println("Not Assight");
            return;
        }
    commond4.execute();
    }
}
