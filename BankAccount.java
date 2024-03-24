public abstract class BankAccount {

    // declare lowRate & highRate
    public static float lowRate;
    public static float highRate;


    // public getter/setter for highRate/lowRate
    public static float getLowRate() {
        return lowRate;
    }

    public static void setLowRate(float rate) {
        if (rate < 0) {
            lowRate = 0;
        } else if (rate > highRate) {
            lowRate = highRate;
        } else {
            lowRate = rate;
        }
    }

    public static float getHighRate() {
        return highRate;
    }

    public static void setHighRate(float rate) {
        if (rate > 10) {
            highRate = 10;
        } else if (rate < lowRate) {
            highRate = lowRate;
        } else {
            highRate = rate;
        }
    }





}
