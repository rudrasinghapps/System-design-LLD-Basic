package SystemDesign.visitor_design_pattern;

public  interface Visitor {
        void visit(Mobile mobile);
        void visit(Laptop laptop);

}
