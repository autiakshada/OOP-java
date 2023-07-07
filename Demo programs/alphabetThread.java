
    public class alphabetThread implements Runnable {
        @Override
        public void run() {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.println(ch);
                try {
                    Thread.sleep(2000); // Delay of 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    
        public static void main(String[] args) {
            alphabetThread alphabetThread = new alphabetThread();
            Thread thread = new Thread(alphabetThread);
            thread.start();
        }
    }
    

