package SystemDesign.chain_of_Responsibility_design_pattern;

public class Main {
    static void main() {

        PositiveHandler postive = new PositiveHandler(null);
        NeutralHandler  nuteral = new NeutralHandler(postive);
        NegativeHandler neagive = new NegativeHandler(nuteral);

        Request request = new Request(1);
        neagive.handelRequest(request);

    }
}
