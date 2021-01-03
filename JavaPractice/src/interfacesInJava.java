
interface Shapes
{
	void displayDimensions();
	double getArea();
}

class Rect implements Shapes
{
	private int length;
	private int breadth;
	
	public Rect(int l, int b)
	{
		this.length = l;
		this.breadth = b;
	}
	@Override
	public void displayDimensions()
	{
		System.out.println("Length is : " + length);
		System.out.println("Breadth is : " + breadth);
	}
	
	@Override
	public double getArea()
	{
		return (this.length * this.breadth);
	}
}


class Circle implements Shapes
{
	private int radius;
	
	public Circle(int r)
	{
		this.radius = r;
	}
	@Override
	public void displayDimensions()
	{
		System.out.println("\nRadius is : " + radius);
	}
	
	@Override
	public double getArea()
	{
		return (this.radius * this.radius * 3.14);
	}
}


public class interfacesInJava 
{

	public static void main(String[] args) 
	{
		Rect rect = new Rect(4, 5);
		
		rect.displayDimensions();
		System.out.println("Area is:" + rect.getArea());
		
		
		Circle cir = new Circle(4);
		
		cir.displayDimensions();
		System.out.println("Area is:" + cir.getArea());
	}

}
