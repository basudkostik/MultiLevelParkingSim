package Floors;

import Extras.Car ;
import Extras.Colours; 


public class Queue {
	private int sizeofQueue ;
	private Car head_Queue ; 
	private Car rear_Queue ; 
	
	public Queue(){
		sizeofQueue = 0   ; 
		head_Queue = null ; 
		rear_Queue = null ;
		createCarsforQueue();
	}

	public Car getHead_Queue() {
		Car car = new Car (head_Queue.getType() , head_Queue.getColour()) ; 
		return car ; 
	}

	public void setHead_Queue(Car head_Queue) {
		this.head_Queue = head_Queue;
	}

	public Car getRear_Queue() {
		return rear_Queue;
	}

	public void setRear_Queue(Car rear_Queue) {
		this.rear_Queue = rear_Queue;
	}
	
	public int getSize() {
		return sizeofQueue;
	}

	public void setSize(int sizeofQueue) {
		this.sizeofQueue = sizeofQueue;
	}
	
	
	private void createCarsforQueue() {	
		
	String type = "Queue" ; 
	
		for (int i = 1 ; i < 16 ; i++ ) {
			Car newCar = new Car( type , Colours.assignColour(i));
			insertToQueue(newCar);
		}
		
	}
		
	public void insertToQueue(Car car) {
		if ( isEmpty()) {
			head_Queue = car;
			rear_Queue = car ; 
		}
		else 
		{
			rear_Queue.setNext(car);
			rear_Queue = car ; 
		}
		
		sizeofQueue ++ ; 
	}
	
	public void removeCarfromQueue() throws Exception {
		if(isEmpty() ) 
			throw new Exception("The ground floor is empty");
		
		System.out.println( head_Queue.getType()  + "." + head_Queue.getColour() + " is leaving the  garage."   );
		sizeofQueue -- ; 
		if(sizeofQueue == 0)
			System.out.print(head_Queue.getType() + "." +  head_Queue.getColour() + " is last car of the ground floor\n");
		
		head_Queue = head_Queue.getNext() ; 
		
		
	}
	
	
	public boolean isEmpty() {
		return sizeofQueue  == 0 ; 
	}
	
	
	public void print_Queue() {
		Car temp = head_Queue ;

		while (   temp != null ) {
			System.out.print(temp.getType()   + "." + temp.getColour() + " " );
			temp = temp.getNext() ;
			
		}
	}
	

}
