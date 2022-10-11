/*
 * Author Name: Philip Meshach
 * Date: 11-10-2022
 * Praise The Lord
 */

public class EvEngine extends Engine {
    private double voltage;
    private String maxPower;
    private int maxRpm;

    public EvEngine() {
    }

    public EvEngine(int modelNumber, String displacement, String maxPower, int maxRpm, String noOfCylinders, double voltage, String maxPower1, int maxRpm1) {
        super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        this.voltage = voltage;
        this.maxPower = maxPower1;
        this.maxRpm = maxRpm1;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
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
    public String toString() {
        return "EvEngine{" +
                "voltage=" + voltage +
                ", maxPower='" + maxPower + '\'' +
                ", maxRpm=" + maxRpm +
                '}';
    }
}
