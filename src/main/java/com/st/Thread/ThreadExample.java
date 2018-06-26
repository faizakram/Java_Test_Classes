package com.st.Thread;

import java.util.Random;

public class ThreadExample implements Runnable {
	private int num = 10;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ThreadExample
		ThreadExample m1=new ThreadExample();  
		Thread thread =new Thread(m1);
		Thread thread2 =new Thread(m1);
		thread.start();
		thread2.start();
	/*	try {
			thread2.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//Thread.sleep(1000);
		//System.out.println(m1.num);
	}

/*	private void incrseValue()
	{
		
		
	}*/
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//incrseValue();
		try {
			num = num + 1;
			Thread.sleep((long) new Random().nextInt(100));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(num);
		System.out.println("thread is running...");  
		//num++;

	}

}
