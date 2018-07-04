/**
 * 创建多线程的方式二:通过实现Runnable接口的方式
 * 实现的方式优于继承的方式
 * 1.避免了java的单继承局限性
 * 2.如果多个线程需要操作同一份资源,更适合用实现的方式
 */
//1.创建了一个实现了Runnable接口的类
class PrintNum1 implements Runnable{
    //2.实现接口的抽象方法
    public void run(){
        //子线程代码
        for(int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

}
public class TestThread1 {
    public static void main(String[] args){
        //创建一个Runnable 接口实现类的对象
        PrintNum1 p = new PrintNum1();
        //将此对象最为形参传递给Thread类的构造器中，创建Thread类对象，此对象即为一个线程
        Thread t1 = new Thread(p);
        t1.start();//调用start()方法:启动线程并执行run()方法
        Thread t2 = new Thread(p);
        t2.start();
    }

}
