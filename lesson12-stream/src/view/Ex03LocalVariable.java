package view;

public class Ex03LocalVariable {
    static int kms = 0;
    public static void main(String[] args) {
        running(10);
    }

    private static void running(int seconds){
        int round = 0;
        // anonymous class
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("This task will be run in " + seconds + " (s).");
                // round++;
                System.out.println(round);
                kms++;
            }
        };
        runner.run();
    }
}
