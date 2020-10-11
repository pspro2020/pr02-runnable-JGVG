package runnable;

public class Main {
    public static void main(String[] args) {

        for( int i = 0; i <= 10; i++){
            Thread tr = new Thread(new MyRunnable(i));
            if ((i % 2) == 0) {
                tr.setPriority(Thread.MAX_PRIORITY);
            } else {
                tr.setPriority(Thread.MIN_PRIORITY);
            }
            tr.start();
        }

    }

    private static class MyRunnable implements Runnable {
        private final int i;

        public MyRunnable(int i){
            this.i = i;

        }

        @Override
        public void run() {

            for(int j = 0; j<=10; j++){
                System.out.println(Thread.currentThread().getName()+": "+i+"^"+j+" = "+ (int)Math.pow(i,j));
            }
        }

    }
}

