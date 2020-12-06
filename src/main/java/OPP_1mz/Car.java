package OPP_1mz;

import lombok.Getter;
import lombok.Setter;

//Ex32
public abstract class Car {
    @Getter
    @Setter
    private String producer,color,model;
    @Getter
    @Setter
    private Integer seatsNumber;
    private Exercise_28_1mz engine;

    //piszemy Getter and Setter do Engine

    public void setEngine(Exercise_28_1mz engine1){
        this.engine=engine1;
    }
    public Exercise_28_1mz getEngine(){
        return this.engine;
    }
    //tworze konstruktor ze wszystkimi argumentami

    public Car(String producer, String model, String color, Integer seatsNumber, Exercise_28_1mz engine){
        this.producer=producer;
        this.model=model;
        this.color=color;
        this.seatsNumber=seatsNumber;
        this.engine=engine;
    }

}
