package OPP_1mz;

import lombok.Getter;
import lombok.Setter;

public class Exercise_28_1mz {
    public class Engine {
        private Double capacity;
        @Getter
        @Setter
        private Integer horsePower;
        @Getter
        @Setter
        private Double fuelComsumtion;

        public Engine(Double capacity, Integer hoursePower, Double fuelComsumtion) {
            this.capacity = capacity;
            this.horsePower = hoursePower;
            this.fuelComsumtion = fuelComsumtion;
        }

        //Ex30
        public void setCapacity(Double capacity) {
            this.capacity=capacity;
        }
        public Double getCapacity(){
            return this.capacity;
        }
        //Ex32

    }
}
