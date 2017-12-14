// Team NOOOOO Ben Shapiro and Zane Wang
// APCS1 pd1
// HW54 -- One File to Bind Them All
// 2017-12-13

import java.util.ArrayList;

public class MySorts {
    // VOID version of SelectionSort
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

	    bubbleSortV(data);
	}
    }


    
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
