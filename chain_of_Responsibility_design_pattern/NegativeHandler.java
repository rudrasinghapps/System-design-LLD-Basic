package SystemDesign.chain_of_Responsibility_design_pattern;

public class NegativeHandler extends Handler {

    NegativeHandler(Handler handler) {
        super(handler);
    }

    @Override
    void handelRequest(Request obj) {
        if (obj.state < 0) {
            System.out.println("Handel by Negative Handler");
        } else if (handler != null) {
            System.out.println("Not negative state , hence delegating next ");
            handler.handelRequest(obj);
        }
    }
}
