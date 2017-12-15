// Team NOOOOO Ben Shapiro and Zane Wang
// APCS1 pd1
// HW55 -- Never Fear, Big Oh Is Here! 
// 2017-12-14

import java.util.ArrayList;

public class MySorts {

    /* add(ArrayList):
       Execution times:
       n = 1, best case time = 0, worst case time = 0 (assumes that a simple
       pass through equals one "time")
       n = 10, best case time = 0, worst case time = 0
       n = 100, best case time = 0, worst case time = 0
       n = 1000, best case time = 0, worst case time = 0
       n times, best case time = 0, worst case time = 0
       
       add() performs 0 passes by performing an operation at final index. 
       Thus, it is O(0).
    */

    /* add(ArrayList, index):
       Execution times:
       n = 1, best case time = 0, worst case time = 1 (assumes that a simple
       pass through equals one "time")
       n = 10, best case time = 0, worst case time = 1
       n = 100, best case time = 0, worst case time = 1
       n = 1000, best case time = 0, worst case time = 1
       n times, best case time = 0, worst case time = 1
       
       add(index) performs 1 pass, starting from the back end, and interacts 
       with each element before that index. Thus, it is O(1).
    */

    /* bubbleSort:
       Execution times:
       n = 1, best case time = 1, worst case time = 1 (assumes that a simple 
       pass through equals one "time")
       n = 10, best case time = 1, worst case time = 90
       n = 100, best case time = 1, worst case time = 9,900
       n = 1000, best case time = 1, worst case time = 999,000
       n times, best case time = 1, worst case time = n^2 - n
       
       bubbleSort performs n-1 passes, and interacts with each element n times (once for each element) so therefore performs an operation
       n * n - 1 times, or n^2 - n times.
       
    */
    
    // VOID version of BubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSort( ArrayList<Comparable> data){

	int swapCount = 0;

	int oldCount = 0;

	Comparable swapIt;

	for (int passes = 0; passes < data.size() - 1; passes +=1){
      
	    for ( int current = 0; current < data.size() - 1; current += 1){
		oldCount = swapCount;
	      
		if (data.get(current).compareTo(data.get(current + 1)) > 0){

		    swapCount += 1;

		    swapIt = data.get(current);

		    data.set(current, data.get(current + 1));

		    data.set(current + 1, swapIt);

		}
	    }

	}

	if (oldCount == swapCount){

	    return;
	}
	else{

	    bubbleSort(data);
	}
    }

    /* selectionSort:
       Execution times:
       n = 1, best case time = 1, worst case time = 1 (assumes that a simple 
       pass through equals one "time")
       n = 10, best case time = 1, worst case times = 10
       n = 100, best case time = 1, worst case times = 100
       n = 1000, best case time = 1, worst case times = 1000
       n times, best case time = 1, worst case times = n

       selectionSort performs 1 passes, and interacts with each element 1 time
       so therefore performs an operation n times. Thus, it is O(n);
    */

    
    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
       
    
    public static void selectionSort( ArrayList<Comparable> data ) 
    {
	//note: this version places greatest value at rightmost end,

	//maxPos will point to position of SELECTION (greatest value)
	int maxPos;

	for( int pass = data.size()-1; pass > 0; pass-- ) {
	    
	    maxPos = 0;
	    for( int i = 1; i <= pass; i++ ) {
	        
		if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
		    maxPos = i;
	    }
	    data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
	    
	}
    }

    /* insertionSort:
       Execution times:
       n = 1, best case time = 1, worst case time = 1 //assumes that a simple 
       pass through equals one "time"
       n = 10, best case time = 10, worst case times = 10
       n = 100, best case time = 100, worst case times = 100
       n = 1000, best case time = 1000, worst case times = 1000
       n times, best case time = n, worst case times = n

       insertionSort performs n-1 passes, and interacts with each element until
       it has reached it's final position so therefore performs an operation
       n^2 times. Thus, it is O(n^2).
    */

	// VOID version of InsertionSort
	// Rearranges elements of input ArrayList
	// postcondition: data's elements sorted in ascending order

    
	public static void insertionSort( ArrayList<Comparable> data )
	{
	    // each pass will increase the number of sorted elements by 1
	    for (int sorted = 1; sorted < data.size(); sorted++) {
		int newNum = sorted;
		// newNum is the position of the new number added to sorted
		// if larger, then subtract one swaps with sorted number before it
		// if not, then it is at relative sorted position
		while (newNum > 0 && (data.get(newNum).compareTo(data.get(newNum - 1)) < 0)) {
		    data.set(newNum, data.set(newNum - 1, data.get(newNum)));
		    newNum--;
		}
	    }	
	}//end insertionSortV
}
