package com.yunhe.thread1;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        MyThread m3=new MyThread();
        m1.setName("����ϼ");
//        m1.join();
        m2.setName("��������");
        m3.setName("��ӯӯ");
        m1.start();
        m2.start();
        m3.start();
      
	}

}
