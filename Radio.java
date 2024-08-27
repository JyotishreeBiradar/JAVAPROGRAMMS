class Radio
{
	double frequency=98.7;
	String brand;
	double price;
	boolean isOn;
	
	public Radio(String brandLocal,double priceLocal)
	{
		brand=brandLocal;
		price=priceLocal;
		System.out.println("created radio using string,double constructor....");
	}
}