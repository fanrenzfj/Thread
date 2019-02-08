package com.yunhe.thread1;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        MyThread m3=new MyThread();
        m1.setName("林青霞");
//        m1.join();
        m2.setName("东方不败");
        m3.setName("任盈盈");
        m1.start();
        m2.start();
        m3.start();
      
	}

}
