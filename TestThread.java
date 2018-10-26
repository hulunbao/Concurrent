class PrintNum extends Thread{
    //创建多线程方式一:继承Thread类

    public void run(){
        //子线程执行的代码
        for(int i=1;i<=100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
    public PrintNum(String name){
        super(name);
    }
}
public class TestThread {
    public static void main(String[] args){
        PrintNum p1 = new PrintNum("Thread one");
        PrintNum p2 = new PrintNum("Thread two");
        p1.setPriority(Thread.MAX_PRIORITY);//10
        p2.setPriority(Thread.MIN_PRIORITY);//1
        p1.start();
        p2.start();
    }


}
