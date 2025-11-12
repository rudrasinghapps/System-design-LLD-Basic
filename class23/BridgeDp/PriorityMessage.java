package SystemDesign.class23.BridgeDp;

public class PriorityMessage extends Message{

    int priority;

    public PriorityMessage(String from, String to, String title, String body, MessageSender sender, int priority) {
        super(from, to, title, body, sender);
        this.priority = priority;

        if(priority >= 50){
            this.body += " // Important Message //";
        }
    }

    public void send(){

    }
}
