class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Class A " + i + " " + this.getName());

            System.out.println(Thread.currentThread().getName());
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            // here we can not use this.getName() as this method is available in Thread class
            System.out.println("Class B " + i + " " + Thread.currentThread().getName());
        }
    }
}

public class ThreadExample{
    public static void main(String[] args) {
        System.out.println("Active Threads are: " + Thread.activeCount());

        // by extending Thread class
        A t1 = new A();
        t1.setName("T1");
        t1.start();

        A t2 = new A();
        t2.setName("T2");
        t2.start();

        // by implementing Runnable interface
        Thread t3 = new Thread(new B());
        t3.setName("T3");
        t3.start();

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=1;i<6;i++){
                    System.out.println(Thread.currentThread().getName() + " " + "Runnable Virtual Function");
                }
            }
        });
        t4.setName("T4");
        t4.start();


        // as Runnable is functional interface (means has single function), so 
        // we can use lambda function
        Thread t5 = new Thread( ()->{
                for(int i=1;i<6;i++){
                    System.out.println(Thread.currentThread().getName() + " " + "Runnable Virtual Function");
                }
        });
        t5.setName("T5");
        t5.start();


    }
}