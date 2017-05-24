/*
 * Mirosław Stec
 * */
package pl.codewise.internship;

public class Task implements Runnable {
	private int taskNumber;
	private long timeRunTask;

	public Task(int taskNumber ) {
		this.taskNumber = taskNumber;
		this.timeRunTask = System.nanoTime();
	}

	public int getTaskNumber() {
		return taskNumber;
	}

	public void setTaskNumber(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	public long getTimeRunTask() {
		return timeRunTask;
	}

	public void setTimeRunTask(long timeRunTask) {
		this.timeRunTask = timeRunTask;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		sleep();
		executeTask();
		

	}

	private void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void executeTask() {
		System.out.println("execute task:  " + taskNumber);
	}

}
