class Cable
{
	String brand="Finolex";
	double price;
	String material;
	String color;
	
	public Cable(double priceLocal,String materialLocal)
	{
		price=priceLocal;
		material=materialLocal;
		
		System.out.println("created Cable using double,String constructor....");
	}
}