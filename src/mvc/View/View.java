package mvc.View;

import mvc.Controller.Controller;

import java.util.Scanner;

public class View {
    public View() {
        Controller controller = new Controller(this);
        Scanner scan = new Scanner(System.in);
        while(true) {
            String input;
            System.out.println("\n" + "Visa bilar(a), Hyr ut bil(b), Lägg till bil(c) exit(d)");
            input = scan.nextLine();

            switch (input) {
                case "a":
                    // Visa bilar med deras indexposition
                    // Kalla på metoden
                    break;
                case "b":
                    // Välj vilken bil med en siffra.
                    System.out.println("Vilken bil vill du hyra ut. Välj med en siffra.");
                    input = scan.nextLine();
                    // Kalla på metoden
                    break;
                case "c":
                    // Lägg till bil
                    String make = null, model = null;
                    System.out.println("Skriv in märke:");
                    input = scan.nextLine();
                    make = input;
                    System.out.println("Skriv in model:");
                    input = scan.nextLine();
                    model = input;
                    controller.addCar(make, model);
                    break;
                case "d":
                    System.exit(0);
            }
        }
    }
}
