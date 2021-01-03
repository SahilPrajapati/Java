
abstract class Shape
{
	public int length;
	public int breadth;
	
	public Shape(int l, int b)
	{
		this.length = l;
		this.breadth = b;
	}
	
	public void display()
	{
		System.out.println("Length is: " + length);
		System.out.println("Breadth is: " + breadth);
	}
	
	public abstract int getArea();
}

class triangle extends Shape
{
	public triangle(int l, int b)
	{
		super(l,b);
	}
	@Override
	public int getArea()
	{
		return (this.breadth * this.length)/2;
	}
}

class rectangle extends Shape
{
	public rectangle(int l, int b)
	{
		super(l, b);
	}
		
	@Override
	public int getArea()
	{
		return (this.breadth * this.length);
	}
}

public class abstractClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle rect = new rectangle(4,8);
		triangle tri = new triangle(4,6);
		
		System.out.println("Rectangle Area: " + rect.getArea());
		System.out.println("Triangle Area: " + tri.getArea());
	}

}
