package com.st.BlockingQue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<String> que = new ArrayBlockingQueue<>(3);
		InterviewSchedule produce = new InterviewSchedule(que);
		InterviewProcess process = new InterviewProcess(que);
		new Thread(produce).start();
		new Thread(process).start();
	}

}
