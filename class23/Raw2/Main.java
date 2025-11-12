package SystemDesign.class23.Raw2;

public class Main {
    static void main() {
        Display display = new Display();
        Mohani mohani = new Mohani("Mohani" ,"Hard" ,900,"Black",display);
        Mohani mohani1 = new MohaniPlus("Mohani" ,"Hard" ,900,"Black",display ,"Easy , medium ,hard");
        mohani.showTheDetails();
        System.out.println();
        mohani1.showTheDetails();
    }
}
