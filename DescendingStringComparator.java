import java.util.Comparator;

public class DescendingStringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int compareResult = o1.compareTo(o2); //sorting/comparing in ascending order
		//could also just do : return -compareResult
		if (compareResult < 0) { //o1 is before o2 in the dictionary
			return 1; // to indicate that o1 should be ordered after o2
		} else if (compareResult > 0 ) { //o1 is after o2 in the dictionary
			return -1;
		} else { //compareREsult equals 0: and o1 and o2 are the same	
			return 0;
			
			
		}
	}

}
