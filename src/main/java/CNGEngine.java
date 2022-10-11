/*
 * Author Name: Philip Meshach
 * Date: 11-10-2022
 * Praise The Lord
 */

class CNGEngine extends Engine {
    private String maxPower;
    private int maxRpm;
    private String noOfCylinders;

    public CNGEngine() {
    }

    public CNGEngine(int modelNumber, String displacement, String maxPower, int maxRpm, String noOfCylinders, String maxPower1, int maxRpm1, String noOfCylinders1) {
        super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        this.maxPower = maxPower1;
        this.maxRpm = maxRpm1;
        this.noOfCylinders = noOfCylinders1;
    }

    @Override
    public String getMaxPower() {
        return maxPower;
    }

    @Override
    public void setMaxPower(String maxPower) {
        this.maxPower = maxPower;
    }

    @Override
    public int getMaxRpm() {
        return maxRpm;
    }

    @Override
    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    @Override
    public String getNoOfCylinders() {
        return noOfCylinders;
    }

    @Override
    public void setNoOfCylinders(String noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    @Override
    public String toString() {
        return "CNGEngine{" +
                "maxPower='" + maxPower + '\'' +
                ", maxRpm=" + maxRpm +
                ", noOfCylinders='" + noOfCylinders + '\'' +
                '}';
    }
}
