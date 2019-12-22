package mvc.View;

import mvc.Controller.Controller;
import mvc.Model.Model;
import mvc.PubSub.IObservable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class View implements IObservable {

    private Model model;
    private Scanner scan;

    public View(Model model) {
        this.model = model;
        model.addObserver(this);
        scan = new Scanner(System.in);
    }

//    public void start() {
//        System.out.println("\n" + "Hyr ut bil(a)." + " Lägg till bil(b)." + " Avsluta(c).");
//    }

    public void showOptions(String option) {
        String input;
        switch (option) {
            case "start":
//                System.out.println("\n" + "Hyr ut bil(a)." + " Lägg till bil(b)." + " Avsluta(c).");
                input = scan.nextLine();
                showOptions(input);
                break;
            case "a":
                System.out.println("Ange index på den bil du vill hyra ut (anges ovan)");
                input = scan.nextLine();
                break;
            case "b":
                System.out.println("Lista med alla bilar");
                break;
            case "c":
                System.exit(0);
                break;
            default:
                return;
        }
    }

    @Override
    public void update(Object data) {
        System.out.println(data);
        //this.updateView((String) news);
    }
}


