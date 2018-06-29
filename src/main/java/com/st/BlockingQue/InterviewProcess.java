package com.st.BlockingQue;

import java.util.concurrent.BlockingQueue;

public class InterviewProcess implements Runnable {

	private BlockingQueue<String> que;
	public InterviewProcess(BlockingQueue<String> que) {
		// TODO Auto-generated constructor stub
		this.que = que;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String msg;
		try {
			Thread.sleep(10000);
			while(!(msg = que.take()).equals("Stop")) {
				System.out.println("Interview Completed For - "+ msg);
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
