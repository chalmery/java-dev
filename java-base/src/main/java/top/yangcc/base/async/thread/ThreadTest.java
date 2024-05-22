package top.yangcc.base.async.thread;

/**
 * 继承Thread创建线程
 * 缺点是需要继承，一般不咋用
 *
 */
public class ThreadTest extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new ThreadTest().start();
        new ThreadTest().start();
    }

}
