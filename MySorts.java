// Team NOOOOO Ben Shapiro and Zane Wang
// APCS1 pd1
//
// 2017-12-13

public class MySorts {
    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) 
    {
	//note: this version places greatest value at rightmost end,

	//maxPos will point to position of SELECTION (greatest value)
	int maxPos;

	for( int pass = data.size()-1; pass > 0; pass-- ) {
	    System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
	    maxPos = 0;
	    for( int i = 1; i <= pass; i++ ) {
		System.out.println( "maxPos: " + maxPos );//diag
		System.out.println( data );//diag
		if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
		    maxPos = i;
	    }
	    data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
	    System.out.println( "after swap: " +  data );//diag
	}
	// VOID version of InsertionSort
	// Rearranges elements of input ArrayList
	// postcondition: data's elements sorted in ascending order
	public static void insertionSortV( ArrayList<Comparable> data )
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
    }//end selectionSortV