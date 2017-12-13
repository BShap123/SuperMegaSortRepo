//Ben Shapiro
//APCS1 pd1
//HW #50 - Dat Bubbly Tho
//2017-12-10


/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 ******************************/

import java.util.ArrayList;

public class BubbleSort {

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {

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


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
	int swapCount = 0;

	int oldCount = 0;

	Comparable swapIt;

	for (int passes = 0; passes < input.size() - 1; passes +=1){
      
	    for ( int current = 0; current < input.size() - 1; current += 1){
		oldCount = swapCount;
	      
		if (input.get(current).compareTo(input.get(current + 1)) > 0){

		    swapCount += 1;

		    swapIt = input.get(current);

		    input.set(current, input.get(current + 1));

		    input.set(current + 1, swapIt);

		}
	    }

	}

      

	if (oldCount == swapCount){

	    return input;
	}
	else{

	    bubbleSort(input);
	}

	return input;
    }




  public static void main( String [] args )
  {

  /*===============for VOID methods=============
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
        
      ============================================*/

    
    	ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n" 
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n" 
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort
