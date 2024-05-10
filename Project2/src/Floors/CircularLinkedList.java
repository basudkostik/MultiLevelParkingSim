package Floors;

import Extras.Car ;
import Extras.Colours;

public class CircularLinkedList  {
	private int count ; 
	private Car head_Circular ; 
	private Car rear_Circular ;
	
	public CircularLinkedList() throws Exception {
		
		setCount(0) ; 
		setHead_Circular(null) ; 
		setRear_Circular(null) ; 
		createCarsforCircularLinkedList(); 
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Car getHead_Circular() {
		return head_Circular;
	}

	public void setHead_Circular(Car head_Circular) {
		this.head_Circular = head_Circular;
	}

	public Car getRear_Circular() {
		return rear_Circular;
	}

	public void setRear_Circular(Car rear_Circular) {
		this.rear_Circular = rear_Circular;
	}

	

	private void createCarsforCircularLinkedList() throws Exception {
		
		String type = "Circular" ; 
		
		for (int i = 1 ; i < 16 ; i++ ) {
			Car newCar = new Car( type , Colours.assignColour(i));
			insertToCircularLinkedList(newCar);
			count++ ; 
		}
	}
	
	private void insertToCircularLinkedList(Car newCar) throws Exception {
		if(getCount( ) == 15 )
			throw new Exception("The second floor is full.");
		
		if (  head_Circular == null && rear_Circular == null  ) {
			head_Circular =  newCar ;
			rear_Circular =  newCar ;
			rear_Circular.setNext(  head_Circular );
		}
		else 
		{
			rear_Circular.setNext(newCar);
			rear_Circular = newCar ; 
			rear_Circular.setNext(head_Circular) ; 
		}
	}
	
	
	
	public Car removeCarfromCircularLinkedList(int Josephus) throws Exception 
	
	{
		
		if ( isCircularEmpty()) {
			 throw new Exception("Circular queue is empty ");
	        }
		 
		
		int blabla = getCount() ;	
		
		Car curr = getHead_Circular() ; 
		Car deleted = null ; 
		
		 if( blabla == 1)
			{
			 deleted = new Car (head_Circular.getType() , head_Circular.getColour()) ;
			 head_Circular.setNext(null);
			 setHead_Circular(null); 
			 rear_Circular = null ; 
			 setCount(0); 
			 System.out.print(deleted.getType() + "." +  deleted.getColour() + " is last car of the second floor\n");
			 System.out.println( deleted.getType()  + "." +  deleted.getColour()  + " is moved to ground floor from  second floor");

			 return deleted ; 
			}
		
		 else if ( blabla > 1 )
		 {
			 while  ( blabla >  1 ) 
				{
					
					for(int i= 0 ; i < Josephus -1    ; i++) 
					{
						curr = curr.getNext();
						
						while( !curr.getNext().isVisible() ) 
						{
							curr = curr.getNext();
						}
					}
					
					curr.setVisible( false );	
					
					while (!curr.getNext().isVisible()) {
			            curr = curr.getNext();
			        }
					
					curr = curr.getNext();
					blabla-- ;
				}
			 
			 deleted = new Car(curr.getType() , curr.getColour()) ; 
			 setAllVisible() ; 
			 delete(curr); 
			 return deleted ; 
		 }
		 else
		 {
			 return deleted ; 
		 }
		
			
	}
	
	private void delete(Car removedCar) throws Exception {
		
		 if ( head_Circular == null) {
			 throw new Exception("Circular queue is empty ");
	        }
		 
		 
		 else if ( removedCar == head_Circular )  {
				setHead_Circular(head_Circular.getNext()) ; 
				setRear_Circular(head_Circular) ; 
				removedCar.setNext(null);
			}
				
			else 
			{
				Car curr = head_Circular ; 
				Car prev = null ; 
				
				while ( curr != removedCar ) {
					prev = curr ;
					curr = curr.getNext() ; 			
				}
				
				if(removedCar == rear_Circular  )
				{
					setRear_Circular(prev) ; 
				}
				prev.setNext(curr.getNext());
				removedCar.setNext(null);
			}
		 
		 count -- ; 
		 System.out.println( removedCar.getType()  + "." +  removedCar.getColour()  + " is moved to ground floor from  second floor");
	}
	
	
		
	
	private void setAllVisible() {
		
		Car curr = getHead_Circular() ; 
		
		do {
	        curr.setVisible(true);
	        curr = curr.getNext();
	    } while (curr != head_Circular);
	}
	
	
	
	public void print_Circular( ) throws Exception {
		
		if (head_Circular == null)
        {
			throw new Exception("Circular is empty") ; 
        }
		
		Car temp = head_Circular ; 
		
		if(  getCount() == 1 ) {
			System.out.println( "\n" + temp.getType()   + "." + temp.getColour() );
		}
		else {
			do{
				System.out.print(temp.getType()   + "." + temp.getColour() + " ");
				temp = temp.getNext() ; 
				}while (temp != head_Circular );
			
			System.out.println(" ");
		}

		}
	
	
	
	public boolean isCircularEmpty() {
		return count == 0 ; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 

 
