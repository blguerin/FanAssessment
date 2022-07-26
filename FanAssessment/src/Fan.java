public class Fan {
    private int speed;
    private String direction;

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public String getDirection(){
        return direction;
    }

    public void setDirection(String direction){
        this.direction = direction;
    }

    public int pullSpeed(int speed){
        if (speed == 3) {
             setSpeed(0);
        }
        else {
            setSpeed(getSpeed() + 1);
        }
        return speed;
    }

    public String pullDirection(String direction) {
        if (direction == "clockwise") {
            setDirection("counterclockwise");
        }
        else {
            setDirection("clockwise");
        }
        return direction;
    }

    public void fanSettings() {
        System.out.println("Fan speed is " + speed + " and direction is " + direction);
    }

}
