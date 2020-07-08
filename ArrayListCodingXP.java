import java.util.ArrayList;

public class ArrayListCodingXP {
	
	public static int indexOf(ArrayList<Integer> nums, int numToFind) {
		int index = -1;
		int i = 0;
		for (Integer num : nums) {
			if (num == numToFind && index != -1) {
				int lastIndex = i;
			}
			else if (num == numToFind) {
				index = i;
			}
				//System.out.println(num);
				//System.out.println(nums.get(i));
			i++;
			
		}
		//System.out.println(index);
		return index;
	}
	
	public static void insert(ArrayList<Double> nums, double numToInsert, int insertAtIndex) {
		int i = 0;
		while (i<nums.size()) {
			if (i == insertAtIndex) {
				nums.add(insertAtIndex, numToInsert);
			}
			//System.out.println(nums);
			i++;
		}
	}
	
	public static String lastInAlphabet(ArrayList<String> strs) {
		//System.out.println(strs);
		if (strs.size()== 0) {
			return "";
		}
		int i = 0;
		while (i < strs.size()-1) {
			String str1 = strs.get(i);
			String str2 = strs.get(i+1);
			int sort = str1.compareTo(str2);
			if (sort > 0) {
				//System.out.println("if statement check index is " + i);
				strs.remove(i+1);
				strs.add(i, str2);
			}
			else if (sort < 0) {
				//System.out.println("else if statement check, index is " + i );
				strs.add(i+1, str1);
				strs.remove(i);
			}
		i++;
		
	
		}
		String lastString = strs.get(strs.size()-1);
		System.out.println(lastString);	
		return lastString;
		//this was typed online in GitHub
	}
}
