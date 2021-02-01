package dj.learning.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * prior to java -8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 0.0");
            }
        };
        new Thread(runnable).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 0.1");
            }
        }).start();
        /**
         * lambda way
         */
        Runnable lambdaRunnable = () -> System.out.println("Inside lamda runnable - 1");
        new Thread(lambdaRunnable).start();
        //or
        new Thread(()->System.out.println("Inside lamda runnable - 2")).start();

    }
}
