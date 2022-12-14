/*
 * Author Name: Philip Meshach
 * Date: 29-08-2022
 * Praise The Lord
 */

public class Engine {
    private int modelNumber;
    private String displacement;
    private String maxPower;
    private int maxRpm;
    private String noOfCylinders;

    public Engine() {
    }

    public Engine(int modelNumber, String displacement, String maxPower, int maxRpm, String noOfCylinders) {
        this.modelNumber = modelNumber;
        this.displacement = displacement;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;
        this.noOfCylinders = noOfCylinders;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(String maxPower) {
        this.maxPower = maxPower;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    public String getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(String noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "modelNumber=" + modelNumber +
                ", displacement='" + displacement + '\'' +
                ", maxPower='" + maxPower + '\'' +
                ", maxRpm=" + maxRpm +
                ", noOfCylinders='" + noOfCylinders + '\'' +
                '}';
    }
}
