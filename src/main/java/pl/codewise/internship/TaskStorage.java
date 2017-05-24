/*
 * Mirosław Stec
 * */
package pl.codewise.internship;

import java.util.LinkedList;
import java.util.List;

public class TaskStorage {
	private static List<Task> taskCollection = new LinkedList<Task>();
	private static List<Integer> expireInSecondCollection = new LinkedList<Integer>();
	private static int howManyElements;
	
	public synchronized static int getHowManyElements(){
		return howManyElements;
	}
	
	public TaskStorage(int expireInSecond , Task callback){
		taskCollection.add(callback);
		expireInSecondCollection.add(expireInSecond);
		howManyElements++;
	}
	
	public synchronized void addTask(int expireInSecond , Task callback){
		taskCollection.add(callback);
		expireInSecondCollection.add(expireInSecond);
		howManyElements++;
	}
	
	public synchronized static void removeTask(int i){
		taskCollection.remove(i);
		howManyElements--;
	}
	
	public synchronized static void removeExpire(int i){
		expireInSecondCollection.remove(i);
	}
	public synchronized static Task getTaskCollectionElement(int i){
		return taskCollection.get(i);
	}
	
	public synchronized static Integer getExpireInSecondCollectionElement(int i){
		return expireInSecondCollection.get(i);
	}
	
	public synchronized static List<Task> getTaskCollection() {
		return taskCollection;
	}
	public synchronized static List<Integer> getExpireInSecondCollection() {
		return expireInSecondCollection;
	}
	
}
