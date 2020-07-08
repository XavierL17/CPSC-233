//import java.util.Arrays;
public class Comments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// simple list data structure is an array
//it is technically a sequence of bits split up into blocks
//an array has a static size declared at creation, cannot change after the fact
//ONLY structure in JAVA that you can index into with these bad boys []
//within an array the types must be the same
//Below is an example of an array. before the array name is the type
		//int[] nums = {1,2,3,4,5,6,7,8,9,10};
		//String[] strs = new String[10]; //key word new creates an array of size ten
//putting values into an array :
		//strs[3] = "Hello";
//getting a value from an array :
		//int x = nums[9]; // x gets the value of 10
//getting the length of an array : 
		//int length = nums.length;
//if you need a bigger array you must create a bigger array and copy over all elements from the old array to the new array
//making a bigger array and copying data over looks like this :
		//int[] moreNums = new int[15];
		//int index = 0;
		//while (index<nums.length) {
			//moreNums[index]=nums[index];
			//index++;
//if you need to do more than store or get elements in an array 
//you must use static methods in the Array class
//overall very light and efficient way to use lists
//Arrays Class: MUST provide the array(s) as an argument
//There is searching, copying, sorting, testing, equality, fill
// to use you must import: java.import.util.Arrays;
//Arrays.sort(nums); sorts the array specified 
		}
//Arrays Class
//String[] strs2 = {"welcome","to","working","with","string","arrays"};
//goal 1sort strs and print result
//Arrays.sort(strs2);

//int index2 = 0;
//while(index2<strs2.length) {
	//System.out.print(strs2[index2] + ",");
	//index2++;	
//}
//System.out.println();
//goal 2: sort strs2 in descending, alphabetical order and print the result
//Arrays.sort(strs2, new DescendingStringComparator());

//index2 = 0;
//while(index2<strs2.length) {
	//System.out.print(strs2[index2] + ",");
	//index2++;		
//}
	//}
}









