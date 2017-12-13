import java.util.ArrayList;

public class SortTest {

    public static void main (String[] args){

	ArrayList newt = new ArrayList<Integer>();

	
	for (int current = 0; current < 5; current += 1){

	    newt.add((int) (Math.random() * 50));
	}

	System.out.println("newt before sorting:");
	System.out.println(newt);
	
	MySorts.bubbleSortV(newt);

	System.out.println("newt after sorting:");
	System.out.println(newt);

	ArrayList lizard = new ArrayList<Integer>();

	for (int current = 0; current < 5; current += 1){

	    lizard.add((int) (Math.random() * 50));
	}

	System.out.println("lizard before sorting:");
	System.out.println(lizard);

	MySorts.selectionSortV(lizard);

	System.out.println("lizard after sorting:");
	System.out.println(lizard);

	ArrayList tuatara = new ArrayList<Integer>();

	for (int current = 0; current < 5; current += 1){

	    tuatara.add((int) (Math.random() * 50));
	}

	System.out.println("tuatara before sorting:");
	System.out.println(tuatara);

	MySorts.selectionSortV(tuatara);

	System.out.println("tuatara after sorting:");
	System.out.println(tuatara);
			  
    }
}
