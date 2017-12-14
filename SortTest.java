// Team NOOOOOO Ben Shapiro and Zane Wang
// APCS1 pd1
// HW53 -- Solid Comparitive Analysis
// 2017-12-13

import java.util.ArrayList;

public class SortTest {

    public static void main (String[] args){

	/* The best case scenario for BubbleSort is if the numbers are already
 in ascending order because there is the least number of swaps done this way,
 thus taking less time to compute. The worst case scenario is if the input is 
 in descending order because there would be a swap for every comparison,
 since the last number each time has to move to the front for each pass. */
	ArrayList newt = new ArrayList<Integer>();

	
	for (int current = 0; current < 5; current += 1){

	    newt.add(current);
	}

	System.out.println("newt before sorting:");
	System.out.println(newt);
	
	MySorts.bubbleSort(newt);

	System.out.println("newt after sorting:");
	System.out.println(newt);

	ArrayList twen = new ArrayList<Integer>();

	for (int current = 4; current >= 0; current -= 1) {
	    twen.add(current);
	}
	System.out.println("twen before sorting:");
	System.out.println(twen);

	MySorts.bubbleSort(twen);

	System.out.println("twen after sorting:");
	System.out.println(twen);

	/* There is no best case scenario for Selection sort because no matter 
 what the input is, there will be a swap for every pass to make sure that the
 number is in the correct resting position, not just relative to the adjacent 
 numbers. If a number is already in the correct position, it still swaps, just
 with itself. */

	ArrayList lizard = new ArrayList<Integer>();

	for (int current = 0; current < 5; current += 1){
	    lizard.add(current);
	}
	System.out.println("lizard before sorting:");
	System.out.println(lizard);
	
	MySorts.selectionSort(lizard);

	System.out.println("lizard after sorting:");
	System.out.println(lizard);

	ArrayList drazil = new ArrayList<Integer>();

	for (int current = 4; current >= 0; current -= 1){
	    drazil.add(current);
	}
	System.out.println("drazil before sorting:");
	System.out.println(drazil);
	
	MySorts.selectionSort(drazil);

	System.out.println("drazil after sorting:");
	System.out.println(drazil);

	/* The best case scenario for the insertion sort is if the list is 
 already in ascending order because then there are no swaps, and there is little
 computation. The worst case scenario is if the list is in descending order 
 because every number will have to swap and be walked to the beginning per pass
 where each pass sorts the next number into the already sorted section.*/
	
	ArrayList tuatara = new ArrayList<Integer>();

	for (int current = 0; current < 5; current += 1){

	    tuatara.add((int) (Math.random() * 50));
	}

	System.out.println("tuatara before sorting:");
	System.out.println(tuatara);

	MySorts.insertionSort(tuatara);

	System.out.println("tuatara after sorting:");
	System.out.println(tuatara);
			  
    }
}
