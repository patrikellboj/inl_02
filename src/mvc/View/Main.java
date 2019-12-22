package mvc.View;

import mvc.Controller.Controller;
import mvc.Model.Model;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();  // observable
        View view = new View(model);  // observer
        Controller ctrl = new Controller(model, view);

//        view.start();
//        view.showOptions("start");
    }
}
