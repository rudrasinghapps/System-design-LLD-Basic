package SystemDesign.class23.BridgeDp;

public class EncreptedMessage extends Message{

    String key;

    public EncreptedMessage(String from, String to, String title, String body, MessageSender sender, String key) {
        super(from, to, title, body, sender);
        this.key = key;
        this.body = body+key;
    }
}
