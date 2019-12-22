package mvc.Model;

import java.util.ArrayList;
import java.util.List;

public class Agency {
    private List<Car> cars;


    public Agency() {
        this.cars = new ArrayList<>();
    }

    public void addCarToList(Car car) {
        this.cars.add(car);
    }

    public List<Car> getCars() {
        return this.cars;
    }

}
