package SystemDesign.command_design_pattern;

public class Remote {
    Command command1;
    Command command2;
    Command command3;
    Command command4;


    public void button1(){
        if(command1 == null){
            System.out.println("Button 1 Not assign");
            return;
        }
        command1.execute();
    }


    public void button2(){
        if(command2 == null){
            System.out.println("Button 2 Not assign");
            return;
        }
         command2.execute();
    }

    public void button3(){
        if(command3 == null){
            System.out.println("Button 3 Not assign");
            return;
        }
         command3.execute();
    }

    public void button4(){
        if(command4 == null){
            System.out.println("Button 4 Not assign");
            return;
        }
         command4.execute();
    }


}
