package SystemDesign.facade_method_design_pattern;

public class Main {
    static void main() {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.onHomeTheater();

        System.out.println("---------------------");

        homeTheaterFacade.offHomeTheater();
    }
}
