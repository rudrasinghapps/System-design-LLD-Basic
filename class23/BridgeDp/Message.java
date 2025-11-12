package SystemDesign.class23.BridgeDp;

public abstract class Message {
    String from;
    String to;
    String title;
    String body;
    MessageSender sender;


    public Message(String from, String to, String title, String body, MessageSender sender) {
        this.from = from;
        this.to = to;
        this.title = title;
        this.body = body;
        this.sender = sender;
    }


    void display(){
        sender.send(from , to , title ,body);
    }

    void send(MessageSender ms){
        ms.send(from , to , title ,body);
    }


}
