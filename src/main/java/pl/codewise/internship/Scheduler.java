/*
 * Mirosław Stec
 * */
package pl.codewise.internship;


public class Scheduler implements Runnable{
	
	@Override
	public void run() {
		while(true){
			if(TaskStorage.getHowManyElements()>0){
		checkTimeOut();
		executeTask();
			}
		}
		
	}
	
	private void  executeTask(){
		
		Thread task = new Thread(TaskStorage.getTaskCollectionElement(0));
		try {
			task.start();
			task.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		TaskStorage.removeTask(0);
		TaskStorage.removeExpire(0);
		
	}
	
	private void checkTimeOut(){
		int i = 0 ;
		for(Task task : TaskStorage.getTaskCollection()){
			
			if(task.getTimeRunTask() - System.nanoTime() > TaskStorage.getExpireInSecondCollectionElement(i)){
				timeOut(i);
				TaskStorage.removeTask(i);
				TaskStorage.removeExpire(i);
				i--;
			}
		i++;
				
		}
		
	}

	
	
	
	private void timeOut(int i){
		System.out.println("timeOut task number  "+ TaskStorage.getTaskCollectionElement(i).getTaskNumber());
	}


	
	

}
