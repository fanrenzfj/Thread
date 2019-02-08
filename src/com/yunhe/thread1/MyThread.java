package com.yunhe.thread1;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			//				sleep(2000);
			yield();
			System.out.println(getName()+"µÚ"+i+"´Î");
		}
	}

}
