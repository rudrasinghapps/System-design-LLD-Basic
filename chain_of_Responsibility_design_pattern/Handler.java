package SystemDesign.chain_of_Responsibility_design_pattern;

public abstract class Handler {
    Handler handler;

    Handler(Handler handler) {
        this.handler = handler;
    }

    abstract void handelRequest(Request obj);
}
