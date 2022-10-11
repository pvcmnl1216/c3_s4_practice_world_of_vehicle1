/*
 * Author Name: Philip Meshach
 * Date: 11-10-2022
 * Praise The Lord
 */

public class EngineImpl {
    public static void main(String[] args) {
        PetrolEngine petrolEngine = new PetrolEngine();
        petrolEngine.setMaxPower("150");
        petrolEngine.setMaxRpm(177);
        petrolEngine.setNoOfCylinders("4");
        System.out.println("getMaxPower = " + petrolEngine.getMaxPower());
        System.out.println("getMaxRpm = " + petrolEngine.getMaxRpm());
        System.out.println("getNoOfCylinders= " + petrolEngine.getNoOfCylinders());
    }


}
