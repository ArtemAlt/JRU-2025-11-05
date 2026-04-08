import config.SimulationProperties;

public class Main {
    public static void main(String[] args) {
        SimulationProperties simulationProperties = SimulationProperties.getInstance();
        simulationProperties.configInfo();
    }
}