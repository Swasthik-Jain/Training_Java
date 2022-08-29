package monday;

import java.io.InterruptedIOException;

class ChildThread extends Thread{
    public void run(){
    try{  

        System.out.println("thread calling");
        Thread.sleep(1000);
     } 
     catch(InterruptedException e){
            System.err.println("InterruptedException caught!");
           //e.printStackTrace();
        }
    }
}
public class interruptedclass{
    public static void main(String[] args) throws InterruptedException
    { 
        ChildThread childThread=new ChildThread();
        childThread.start();
        childThread.interrupt();

    }
}
