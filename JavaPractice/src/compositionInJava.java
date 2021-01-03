
class Job
{
	private String role;
	private long salary;
	private int id;
	
	public void setRole(String r)
	{
		this.role = r;
	}
	public String getRole()
	{
		return this.role;
	}
	
	public void setSalary(long s)
	{
		this.salary = s;
	}
	public long getSalary()
	{
		return this.salary;
	}
	
	public void setId(int i)
	{
		this.id = i;
	}
	public int getId()
	{
		return this.id;
	}
}

class Person
{
	private Job job;
	
	public Person()
	{
		job = new Job();
	}
	
	public void setJob(String r, long s, int i)
	{
		this.job.setRole(r);
		this.job.setSalary(s);
		this.job.setId(i);
	}
	
	public void displayJob()
	{
		System.out.println("Role is : " + this.job.getRole());
		System.out.println("Salary is : " + this.job.getSalary());
		System.out.println("Id is : " + this.job.getId());
		
		System.out.println();
	}
}

public class compositionInJava {

	public static void main(String[] args) {
		Person personObj1 = new Person();
		Person personObj2 = new Person();
		
		personObj1.setJob("Manager", 5000L, 1);
		personObj2.setJob("Accountant", 2000L, 2);
		
		personObj1.displayJob();
		personObj2.displayJob();
	}

}
