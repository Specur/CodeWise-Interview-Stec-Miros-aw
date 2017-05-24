/*
 * Mirosław Stec
 * */
package pl.codewise.internship;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class InternshipTaskTest {
	
//	@Mock
//	Scheduler scheduler;
	

	@Test
	public void oneTask(){
		Scheduler scheduler=  new Scheduler();
		Task taskOne = new Task(1);
		TaskStorage taskStorage = new TaskStorage(1000 , taskOne);
	//	scheduler.run();
		
		assertNotNull(scheduler);
		
	}
	
	
	
	
	
	
	
	
    @Test
    public void testGetNumber() {
        Task taskOne = new Task(1);
        
        assertEquals(1,taskOne.getTaskNumber());
        
    }
}
