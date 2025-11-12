package SystemDesign.chain_of_Responsibility_design_pattern;

public class NeutralHandler extends Handler {

    NeutralHandler(Handler handler) {
        super(handler);
    }

    @Override
    void handelRequest(Request obj) {
        if (obj.state == 0) {
            System.out.println("Handel by Neutral Handler");
        } else if (handler != null) {
            System.out.println("Not neutral state , hence delegating next ");
            handler.handelRequest(obj);
        }
    }
}
