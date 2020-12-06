package OPP_1mz;
//Ex33
public class SportCar extends Car implements LoudCar{

    public SportCar(String producer, String model, String color, Integer seatsNumber, Exercise_28_1mz engine) {
        super(producer, model, color, seatsNumber, engine);

    }

    @Override
    public String loudBrumBrum() {
        return "brum brum";
    }
}
