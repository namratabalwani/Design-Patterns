class Client extends Thread{
    public static void main (String args[]){
        Client myClient = new Client();
        Thread t1 = new Thread(() -> {
            myClient.user1Logs();
        });

        Thread t2 = new Thread(() -> {
           myClient.user2Logs();
        });   

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Both threads have finished.");
    }
    public void user1Logs(){
        Logger logger1 = Logger.getLogger();
        logger1.Log("This message is from user 1.");
    }

    public void user2Logs(){        
        Logger logger2 = Logger.getLogger();
        logger2.Log("This message is from user 2.");
    }
}