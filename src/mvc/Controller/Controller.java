package mvc.Controller;
import mvc.Model.Car;
import mvc.Model.Model;
import mvc.View.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;
    Scanner scan;

    public Controller(Model model, View view) {
        scan = new Scanner(System.in);
        this.model = model;
        this.view = view;

//        model.addCarToList(new Car("Audi", "A6"));
//        model.addCarToList(new Car("Volvo", "740"));
//        model.rentOutCar(1);
//        addCarToList(new Car("Pegeout", "306"));
//        addCarToList(new Car("Mercedes", "E-Type"));
        handleInput();
    }

    public void handleInput() {
        model.updateView("\n" + "Lägg till bil (a)\t" + "Hyr ut bil (b)\t" + "Se bilar (c)\t" + " Avsluta (d)", false);
        String input = scan.nextLine();

        switch (input) {
            case "start":
            case "a":
                addCar();
                handleInput();
                break;
            case "b":
                rentOutCar();
                handleInput();
                break;
            case "c":
                listCars();
                handleInput();
            case "d":
                exit();
                break;
            default:
                model.updateView(input + " är ett ogiltigt val", true);
                handleInput();
                return;
        }
    }

    private void listCars() {
        boolean hasCars = model.getCars().size() > 0;
        model.updateView(hasCars ? "" : "Det finns inga inga bilar i registret. Men du kan lägga till en", hasCars);
    }

    private void exit() {
        System.exit(0);
    }

    private void rentOutCar() {
        if (model.getCars().size() > 0) {
            model.updateView("Ange index på den bil du vill hyra ut (anges nedan) ", true);
            String index = scan.nextLine();
            model.rentOutCar(index);
        } else {
            model.updateView("Det finns inga bilar att hyra ut, men du kan lägga till en.", false);
        }
    }

    private void addCar() {
        model.updateView("Ange Märke ", false);
        String carMake = scan.nextLine();
        model.updateView("Ange Modell ", false);
        String carModel = scan.nextLine();
        model.addCarToList(new Car(carMake, carModel));
    }
}
