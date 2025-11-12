package SystemDesign.adapter_design_pattern;

public class Consumer {

    IPhoneNumbe  iPhoneNumbe;

    Consumer(IPhoneNumbe iPhoneNumbe){
        this.iPhoneNumbe = iPhoneNumbe;
    }

    public void printAllPhoneNumber(){

        for(String str:iPhoneNumbe.getPhoneNumer()){
            System.out.println("Phone Number -> "+str);
        }
    }
}
