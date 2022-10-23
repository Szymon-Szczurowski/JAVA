public class Roadster {
    float topSpeed;
    float acceleration;
    float crazyTopSpeed;
    float crazyAcceleration;

    boolean crazyNode;

    Roadster(float topSpeed, float acceleration){
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration){
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
    }

    public float getTopSpeed(){
        return this.topSpeed;
    }

    public float getAcceleration(){
        return this.acceleration;
    }

    public float getTopSpeed(boolean crazyMode) {
        if (crazyMode) {
            return crazyTopSpeed;
        }
        return topSpeed;
    }

    public float getAcceleration(boolean crazyMode) {
        if (crazyMode) {
            return crazyAcceleration;
        }
        return acceleration;
    }
}
