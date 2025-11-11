package SystemDesign.class11.adapter_DP;

import java.util.List;

public class Consumer {
    IPhoneListSource source;

    Consumer(IPhoneListSource source){
        this.source = source;
    }

    public void printAllPhoneNumber(){
        List<String> phoneNumber =  source.getPhoneNumber();
        System.out.println(phoneNumber);
    }
}
