package com.st.Atomic.Operation;

public class ProcessingThread implements Runnable {

	//private AtomicInteger count = new AtomicInteger();
	static volatile  int count;
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            //count.getAndIncrement();
            ++count;
        }
    }

    public int getCount() {
      // return this.count.get();
    	return this.count;
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
