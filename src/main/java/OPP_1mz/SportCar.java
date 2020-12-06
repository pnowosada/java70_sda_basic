package OPP_1mz;
//Ex33
public class SportCar extends Car implements LoudCar{
    //Ex34
    public SportCar(String producer, String model, String color,Exercise_28_1mz engine){
        super(producer,model,color,2,engine);

    }

    //Ex35 and Ex36
    public SportCar(String producer, String model, String color, Integer seatsNumber, Exercise_28_1mz engine) {
        super(producer, model, color, seatsNumber, engine);

    }

    @Override
    public String loudBrumBrum() {
        return "brum brum";
    }

    @Override
    public String toString() {
        return "SportCar" + super.toString();
    }
}
