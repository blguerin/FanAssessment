public class Main {

    public static void main(String[] args){
        Fan fan = new Fan();
        fan.setDirection("clockwise");
        fan.setSpeed(0);

        fan.fanSettings();

        fan.pullDirection(fan.getDirection());
        fan.pullSpeed(fan.getSpeed());

        fan.fanSettings();

        fan.pullDirection(fan.getDirection());
//        fan.pullSpeed(fan.getSpeed());

        fan.fanSettings();

        fan.pullDirection(fan.getDirection());
        fan.pullSpeed(fan.getSpeed());

        fan.fanSettings();

//        fan.pullDirection(fan.getDirection());
        fan.pullSpeed(fan.getSpeed());

        fan.fanSettings();
    }
}
