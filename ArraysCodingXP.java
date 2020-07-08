
public class ArraysCodingXP {

	public static int indexOf(int[]nums, int numToFind) {
		int index = 0;
		int ans = -1;
		int ans2 = -1;
		while (index < nums.length) {
			if (ans != -1 && nums[ans] == nums[index]) {
				ans2 = index;
				System.out.println("there are two or more of the same numToFind, one at index: " + ans + " and at index: " + ans2);
			}
			else if (nums[index] == numToFind) {
				ans = index;
				}				
			index++;
		}
		//System.out.println("the variable ans is " +ans + " and ans2 is: "+ ans2);
		return ans;		
	}
		
	public static String[] doubleSize(String[] strs) {
		int index = 0;
		String[] morestrs = new String[2 * strs.length];
		while (index < strs.length) {
			morestrs[index] = strs[index];
			index++;
		}
		return morestrs;
	}
	public static void insert(double[]nums, double numToInsert, int insertAtIndex) {
		if (insertAtIndex < nums.length) {
		double[] copynums = new double[nums.length];
		int index = 0;
			while (index < nums.length) {
				if (index == insertAtIndex) {
					copynums[index] = nums[insertAtIndex];
				}
				else if (index < insertAtIndex) {
					copynums[index] = nums[index];
				}
				else if (index > insertAtIndex) {
					copynums[index] = nums[index-1];
				}
				index++;
			}
			copynums[insertAtIndex] = numToInsert;
			int i = 0;
			while (i<copynums.length) {
				System.out.print(copynums[i] + ", ");
				i++;
			}
			
			i = 0;
			while (i < copynums.length) {
				nums[i]=copynums[i];
				i++;
			}
			
			}
		else {
			System.out.println("Sorry that index is out of range");
			}
		
		}
		
	
	//To test a method follow the following code
	public static void main(String args[]) {
		//int[] nums = {2,6,4,9,11,2};
		double[] nums = new double[3];
		//System.out.println(indexOf(nums,2));
		insert(nums,45.1,3);
	}
		
	
}
