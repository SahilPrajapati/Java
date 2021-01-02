
class javaMethods {

	//Simple Method
	int add(int a, int b)
	{
		return a+b;
	}
	
	//Static Method
	static void print(String s)
	{
		System.out.println("Static Method : " +  s);
	}
	
	
	//METHOD OVERLOADING	
	void display(String s, int i)
	{
		System.out.println("The string is " + s + " and integer is " + i);
	}	
	void display(int i, String s)
	{
		System.out.println("The integer is " + s + " and string is " + s);
	}
	
	
	// method throwing exception
	public int divide(int x, int y) throws IllegalArgumentException 
	{
		if(y==0) throw new IllegalArgumentException("Can't divide by 0");
		return x/y;
	}
	
	//MAIN
	public static void main(String[] args)
	{
		javaMethods obj = new javaMethods();
		System.out.println("Simple Method : " + obj.add(5, 6));
		
		javaMethods.print("Calling static method");
		
		System.out.println();
		System.out.println("Method overloading");
		obj.display("Sahil", 7);
		obj.display(8, "Prajapati");
		
		System.out.println();
		System.out.println(obj.divide(4, 2));
		//obj.divide(5, 0);
	}
	
}

