package mvc.Controller;

import mvc.Model.Car;
import mvc.View.View;
import mvc.Model.Agency;

public class Controller {
    private View view;
    private Agency agency;

    public Controller(View view) {
        this.view = view;
    }

    public void getCar() {

    }

    public void rentCar(String number) {
        int numberInList = Integer.parseInt(number);
    }

    public void addCar(String make, String model) {
        agency.addCarToList(new Car(make, model));
    }


}
