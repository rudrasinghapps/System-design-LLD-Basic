package SystemDesign.chain_of_Responsibility_design_pattern;

public class PositiveHandler extends Handler {

    PositiveHandler(Handler handler) {
        super(handler);
    }

    @Override
    void handelRequest(Request obj) {
        if (obj.state > 0) {
            System.out.println("Handel by Positive Handler");
        } else if (handler != null) {
            System.out.println("Not positive state , hence delegating next ");
            handler.handelRequest(obj);
        }
    }
}
