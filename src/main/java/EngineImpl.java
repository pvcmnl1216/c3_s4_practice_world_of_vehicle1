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

        CNGEngine cngEngine = new CNGEngine();
        cngEngine.setMaxPower("111");
        cngEngine.setMaxRpm(122);
        cngEngine.setNoOfCylinders("4");
        System.out.println("cngEngine MaxPower = " + cngEngine.getMaxPower());
        System.out.println("cngEngine MaxRpm = " + cngEngine.getMaxRpm());
        System.out.println("cngEngine NoOfCylinders = " + cngEngine.getNoOfCylinders());

        EvEngine evEngine = new EvEngine();
        evEngine.setVoltage(12.2);
        evEngine.setMaxPower("133");
        evEngine.setMaxRpm(222);
        evEngine.setNoOfCylinders("4");
        System.out.println("evEngine MaxPower = " + evEngine.getMaxPower());
        System.out.println("evEngine MaxRpm = " + evEngine.getMaxRpm());
        System.out.println("evEngine NoOfCylinders = " + evEngine.getNoOfCylinders());

    }


}
