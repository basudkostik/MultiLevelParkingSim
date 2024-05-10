package Executable;



import java.util.Random;

import Extras.*;
import Floors.*;

public class Main {
	
	 public static boolean choose() {
	        Random random = new Random();
	        return random.nextBoolean();
	    }
	 
	 
	 public  static void  part_A() throws Exception {
		 MultiLevelParkingGarage newGarage = new MultiLevelParkingGarage ();
		 newGarage.printAllFloors();
	 }
	 
	 
	 
	 
	 public static void part_B() throws Exception
	 {
		 
		 
		 MultiLevelParkingGarage newGarage = new MultiLevelParkingGarage ();
		 LinkedList holder = new LinkedList () ; 
		 System.out.println("  ---------  ");
		 newGarage.printAllFloors();
		 
		 int iteration  = 1 ;
		 int Josephus = 3 ; 
		 Car removed = null ; 
		 Car pushed = null ; 
			
		 
			while ( !newGarage.groundFloor.isEmpty() ) {
		            System.out.println("\n\nIteration "  + iteration );
		            
		            boolean stackorcircualr = choose () ;
		            
		            
		            if(stackorcircualr   &&   newGarage.underGround.isStackEmpty()  && newGarage.secondFloor.isCircularEmpty() ) 
					{
		            	stackorcircualr = false ; 
					}
					else if(   !stackorcircualr   &&   newGarage.secondFloor.isCircularEmpty()  && !newGarage.underGround.isStackEmpty()  )
					{
						stackorcircualr = true ; 
					}
		            
		            if(stackorcircualr  && !newGarage.underGround.isStackEmpty() ) 
					{
		            	removed = newGarage.underGround.getTop();
		            	newGarage.underGround.removeCarfromStack() ; 
		            	newGarage.groundFloor.insertToQueue(removed);
						
					}
					
					else if( !stackorcircualr && !newGarage.secondFloor.isCircularEmpty())
					{
						removed = newGarage.secondFloor.removeCarfromCircularLinkedList(Josephus);
						newGarage.groundFloor.insertToQueue(removed);
						
					}
					else
					{
					}
		            
		            
		            pushed = newGarage.groundFloor.getHead_Queue() ; 
		            holder.push(pushed);
		            
		            
		            newGarage.groundFloor.removeCarfromQueue();
		            
  
		            System.out.println("\nRemaining cars:");
		            
		            if(!newGarage.secondFloor.isCircularEmpty()) {
		            	System.out.println("The cars are located in second floor:");
		            	newGarage.secondFloor.print_Circular();
		            }
		            else
		            {
		            	System.out.println("The cars are located in second floor:");
		            	System.out.print("Empty");
		            }
		            
		            if(!newGarage.groundFloor.isEmpty()) {
		            	System.out.println("\nThe cars are located in ground floor : ");
		            	newGarage.groundFloor.print_Queue();
		            }
		            else
		            {
		            	System.out.print("\nThe cars are located in ground floor : ");
		            	System.out.print("Empty");
		            }
		            
		            
		            if( !newGarage.underGround.isStackEmpty()) {
		            	System.out.println("\nThe cars are located in underground: ");
		            	newGarage.underGround.print_Stack();
		            }
		            else
		            {
		            	System.out.println("\nThe cars are located in underground: ");
		            	System.out.print("Empty");
		            }
		           
		            iteration ++ ;  
		        }		
			System.out.println("\n\nOrder of the car that leaved parking lot:" );
			holder.print_LinkedList();
	 }
    
	 public static void part_C() throws Exception
	 {
		 MultiLevelParkingGarage newGarage = new MultiLevelParkingGarage ();
		 System.out.println("  ---------  ");
		 newGarage.printAllFloors();
		 
		 int iteration  = 1 ;
		 int Josephus = 3 ; 
		 Car removed = null ; 
		 int numberofparkingproblems = 0 ; 
		 
		 long start = System.currentTimeMillis();
		 long loopTime = 0;
			
		 
			while (  loopTime  < 5000 && !newGarage.groundFloor.isEmpty() ) {
		            System.out.println("\n\nIteration "  + iteration );
		            
		            boolean stackorcircualr = choose () ;
		            
		            
		            if(stackorcircualr   &&   newGarage.underGround.isStackEmpty()  && newGarage.secondFloor.isCircularEmpty() ) 
					{
		            	stackorcircualr = false ; 
					}
					else if(   !stackorcircualr   &&   newGarage.secondFloor.isCircularEmpty()  && !newGarage.underGround.isStackEmpty()  )
					{
						stackorcircualr = true ; 
					}
		            
		            if(stackorcircualr  && !newGarage.underGround.isStackEmpty() ) 
					{
		            	removed = newGarage.underGround.getTop();
		            	newGarage.underGround.removeCarfromStack() ; 
		            	newGarage.groundFloor.insertToQueue(removed);
						
					}
					
					else if( !stackorcircualr && !newGarage.secondFloor.isCircularEmpty())
					{
						removed = newGarage.secondFloor.removeCarfromCircularLinkedList(Josephus);
						newGarage.groundFloor.insertToQueue(removed);
						
					}
					else
					{
					}
		            
		            
		            newGarage.groundFloor.removeCarfromQueue();
		            
  
		            System.out.println("\nRemaining cars:");
		            
		            if(!newGarage.secondFloor.isCircularEmpty()) {
		            	System.out.println("The cars are located in second floor:");
		            	newGarage.secondFloor.print_Circular();
		            }
		            else
		            {
		            	System.out.println("The cars are located in second floor:");
		            	System.out.print("Empty");
		            }
		            
		            if(!newGarage.groundFloor.isEmpty()) {
		            	System.out.println("\nThe cars are located in ground floor : ");
		            	newGarage.groundFloor.print_Queue();
		            }
		            else
		            {
		            	System.out.print("\nThe cars are located in ground floor : ");
		            	System.out.print("Empty");
		            }
		            
		            
		            if( !newGarage.underGround.isStackEmpty()) {
		            	System.out.println("\nThe cars are located in underground: ");
		            	newGarage.underGround.print_Stack();
		            }
		            else
		            {
		            	System.out.println("\nThe cars are located in underground: ");
		            	System.out.print("Empty");
		            }
		           
		            iteration ++ ;  
		            numberofparkingproblems ++ ; 
		            loopTime = System.currentTimeMillis() - start ; 
		        }			
			
			long finish =  System.currentTimeMillis() ; 
			
			double exetime = (double)(finish - start) / 1000  ;
			
			System.out.println("\n" + numberofparkingproblems + " cars left the garage in total "  + exetime + 
			" seconds for " );
			
			double average = (double)(numberofparkingproblems / exetime ) * 5 ; 
			
			System.out.println("\nThe average number of parking problems that can be solved by the computer in 5 seconds: " + average);
	 }
	public static void main(String[] args) throws Exception {
		
		part_B() ; 
		 
	}

}

