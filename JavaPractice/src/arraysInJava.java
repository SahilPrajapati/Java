import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class arraysInJava {

	public static void main(String[] args) {
		
		//WAYS OF INITIALIZING ARRAY
		
		int[] arr1 = new int[5];
		System.out.println("Length of arr1: " + arr1.length);
		
		String[] arr2;
		arr2 = new String[5];
		System.out.println("Length of arr2: " + arr2.length);
		
		int[][] arr3 = new int[4][5];
		System.out.println("Length of arr3: " + arr3.length + "x"+arr3[0].length);
		
		int[][] arr4 = new int[2][];
		arr4[0] = new int[3];
		arr4[1] = new int[5];
		System.out.println("Length of arr4: " + arr4.length + "x"+arr4[1].length);
		
		int[] arr6 = {1, 2, 3};
		System.out.println("Length of arr6: " + arr6.length);
		
		int[][] arr7 = {{1,2,3}, {4,5,6}};
		System.out.println("Length of arr7: " + arr7.length + "x"+arr7[0].length);
		
		int[][] arr8 = {{1,2}, {3,4,5,6}};
		System.out.println("Length of arr8: " + arr8.length + "x"+arr8[0].length);

		
		//SORT
		
		int[] array1 = {5,4,2,7,2};
		String[] strArr = {"R", "Y", "T", "S"};
		
		Arrays.sort(array1);
		Arrays.sort(strArr);
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(strArr));
		
		
		//ArrayList to Array
		
		List<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		
		String[] strArray = strList.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray));
	}

}
