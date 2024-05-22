package top.yangcc.base.async.thread;

/**
 * 继承Thread创建线程
 */
public class RunnableTest implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        //直接用
        new Thread(new RunnableTest()).start();

        //lambda
        new Thread(()->{
            System.out.println("lambda-"+Thread.currentThread().getName());
        }).start();
    }

}
