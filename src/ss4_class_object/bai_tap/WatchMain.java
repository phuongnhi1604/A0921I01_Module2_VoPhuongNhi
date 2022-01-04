package ss4_class_object.bai_tap;

public class WatchMain {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        long n = 500000;
        int count = 0;
        int sum = 0;
        while (count < n) {
            for (int i = 0; i <= 100; i++) {
                sum += i;
            }
            count++;
        }
        watch.stop();
        System.out.println("StartTime: " + watch.getStartTime() + ", EndTime: " + watch.getEndTime() + "\nElapsedTime: " + watch.getElapsedTime() + " milliseconds.");
    }
}
