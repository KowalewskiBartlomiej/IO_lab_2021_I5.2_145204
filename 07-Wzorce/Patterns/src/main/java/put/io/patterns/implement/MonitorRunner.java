package put.io.patterns.implement;

public class MonitorRunner {

    public static void main(String args[]){
        SystemMonitor monitor = new SystemMonitor();

        while (true) {

            monitor.main();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
