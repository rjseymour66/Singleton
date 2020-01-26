public class PerformanceStage {

    private static PerformanceStage instance;
    private static int counter;

    // private constructor
    private PerformanceStage(){
        counter++;
    }

    public synchronized static PerformanceStage getInstance(){
        if(instance == null) {
            instance = new PerformanceStage();
        }
        return instance;
    }

    public void turnOnLights() {
        System.out.println("Turned on lights...");
    }

    public int getCounter() {
        return counter;
    }
}
