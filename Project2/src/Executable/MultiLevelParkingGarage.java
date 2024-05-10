package Executable;

import Extras.Car;
import Floors.CircularLinkedList;
import Floors.Queue;
import Floors.Stack;



public class MultiLevelParkingGarage {
	Stack underGround ; 
	Queue groundFloor ; 
	CircularLinkedList secondFloor ;
	
	MultiLevelParkingGarage() throws Exception{
		underGround = new Stack();
		groundFloor = new Queue();
		secondFloor = new CircularLinkedList();
	}
	
	
	public void printAllFloors() throws Exception {
		System.out.println("The cars are located in second floor:");
		secondFloor.print_Circular();
		
		System.out.println("\nThe cars are located in ground floor:");
		groundFloor.print_Queue();
		
		System.out.println("\nThe cars are located in underground: ");
		underGround.print_Stack();
		
		System.out.println("");
		
	}
	
}
