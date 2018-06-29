package com.st.BlockingQue;

import java.util.concurrent.BlockingQueue;

public class InterviewSchedule implements Runnable {

	private BlockingQueue<String> que;
	public InterviewSchedule(BlockingQueue<String> que) {
		// TODO Auto-generated constructor stub
		this.que = que;
	}
	@Override
	public void run() {
		System.out.println("20 Candidate Arrived");
		for(int i=1; i <= 20; i++) {
			String studName = "stud - "+i;
			try {
				que.put(studName);
				System.out.println("InterView Schedule for "+ studName);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Interview Scheduled for all candidate");
		try {
			que.put("Stop");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
