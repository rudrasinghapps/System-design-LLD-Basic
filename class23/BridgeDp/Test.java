package SystemDesign.class23.BridgeDp;

public class Test {
    static void main() {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();

        Message message  = new EncreptedMessage("Rudra" ,"diva" ,"Test" ,"Hello Diva" ,emailSender," - 8848");
        Message message1  = new PriorityMessage("Rudra" ,"diva" ,"Test" ,"Hello Diva" ,emailSender,50);

        message.display();
        System.out.println();
        message1.display();
        System.out.println(  );

        message.send(smsSender);
        System.out.println();
        message1.send(smsSender);
    }
}
