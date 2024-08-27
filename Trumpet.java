class Trumpet
{
	double cost=5000;
	String material;
	double length;
	boolean isGoldPlated;
	
	public Trumpet(String materialLocal,double lengthLocal)
	{
	material=materialLocal;
	length=lengthLocal;
	
	System.out.println("created Trumpet using String,double constructor....");
	}
}