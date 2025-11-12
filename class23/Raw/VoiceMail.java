package SystemDesign.class23.Raw;

public class VoiceMail extends Message{
    @Override
    void send() {
        System.out.println(this.from);
        System.out.println(this.to);
        System.out.println(this.title);
        System.out.println(this.body);
        System.out.println("Sending message by VoiceMail");
    }
}
