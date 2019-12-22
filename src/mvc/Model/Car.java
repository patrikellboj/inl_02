package mvc.Model;

public class Car {
    private String make;
    private String model;
    private boolean availability;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.availability = true;
    }

    public void rentCar() {
        this.availability = false;
    }


    @Override
    public String toString() {
        return "Märke: " + this.make +
                " Modell:" + this.model +
                "Tillgänglig: " + availability;
    }
//    public void returnCar() {
//        this.availability = true;
//    }
}
