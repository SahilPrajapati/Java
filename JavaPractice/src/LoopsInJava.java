
public class LoopsInJava {

	public static void main(String[] args) {
		
		System.out.println("Simple for loop");
		for(int i = 0; i < 5; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("\n" + "For each loop");
		int[] arr = {5,4,3,2,1};
		for(int i : arr)
		{
			System.out.println(i);
		}

		System.out.println("\n" + "While loop");
		int i = 5;
		while(i <= 10)
		{
			System.out.println(i++);
		}
		
		System.out.println("\n" + "Do while loop");
		i = 5;
		do
		{
			System.out.println(i++);
		}while(i <= 10);
		
	}

}
