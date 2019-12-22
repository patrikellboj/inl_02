package mvc.Model;
import mvc.PubSub.IObservable;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Car> cars;
    private String data;
    private IObservable observer;

    public List<Car> getCars() {
        return cars;
    }

    public Model() {
        cars = new ArrayList<>();
    }

    public void addObserver(IObservable observer) {
        this.observer = observer;
    }

    public void updateView(String data, boolean cars) {
        observer.update((cars ? generateCarsString(this.cars) + "\n" : "") + data);
    }

    public void addCarToList(Car car) {
        this.cars.add(car);
        updateView("Ny bil lades till -> " + car.toString(), false);
    }

    public void rentOutCar(String index) {
        int i = Integer.parseInt(index);

        if (i > this.cars.size() -1) {
            updateView("Det finns ingen bil med detta index. Ovan ser du bilar som finns i registret", true);
        } else {
            this.cars.get(i).rentOutCar();
            updateView(this.cars.get(i).toString() + "Bilen är nu uthyrd.", false);
        }
    }

    private String generateCarsString(List<Car> cars) {
        String s = "";
        for (int i = 0; i < cars.size(); i++) {
            s += "[" + i + "] " + cars.get(i).toString();
        }
        return s;
    }

}







