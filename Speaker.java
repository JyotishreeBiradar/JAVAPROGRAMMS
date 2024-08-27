class Speaker
{
	String brand="Sony";     //literal
	String size;
	double cost;
	String output;
	
	Speaker(String size)       //constructor
	{
		System.out.println("Speaker created");
		this.size=size;
	}
	
	public void SetCost(double cost)   //setter method
	{
		System.out.println("created setcost");
		this.cost=cost;
	}
}
