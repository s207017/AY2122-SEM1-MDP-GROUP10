package algorithms.ReedsSheppCurves;

public class Letter {
    // public enum Steering {
    //     LEFT(1),
    //     STRAIGHT(0),
    //     RIGHT(-1);

    //     private int value;
    //     private Steering(int value){
    //         this.value = value;
    //     }
    // }

    // public enum Gear {
    //     FORWARD(1),
    //     BACKWARD(-1);

    //     private int value;
    //     private Gear(int value){
    //         this.value = value;
    //     }
    // }

    private double param; // t, u, or v, length of the letter curve
    private Steering steering;
    private Gear gear;
    
    public Letter(){}
    public Letter(double param, Steering steering, Gear gear){
        this.param = param;
        this.steering = steering;
        this.gear = gear;
    }

    public String toString(){
        String steering_str, gear_str, info_str;
        if (this.steering == Steering.LEFT){
            steering_str = "left";
        } else if (this.steering == Steering.RIGHT) {
            steering_str = "right";
        } else {
            steering_str = "straight";
        }

        if (this.gear == Gear.FORWARD){
            gear_str = "forward";
        } else {
            gear_str = "backward";
        }

        info_str = "{ Steering: " + steering_str + "\tGear: " + gear_str 
                    + "\tLength: " + Double.toString(Math.round(param * 100)/100) + " }";

        return info_str;
    }
}
