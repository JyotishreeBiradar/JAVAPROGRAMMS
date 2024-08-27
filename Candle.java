class Candle
{
	double length;
	double price;
	String fragrance;
	
	public Candle(double length)
	{
	this.length=length;
	System.out.println("created candle using double constr");
	}
	
	Candle(double price,double length)
	{
		this.price=price;
		this.length=length;
		System.out.println("created candle using double");
	}
	
	Candle(String fragrance)
	{
		this.fragrance=fragrance;
		System.out.println("created candle");
	}
	
	Candle(String fragrance,double length)
	{
		this.fragrance=fragrance;
		this.length=length;
		System.out.println("created candle using String,double");
	}
	
	Candle(String fragrance,double price,double length)
	{
		this.fragrance=fragrance;
		this.price=price;
		this.length=length;
		System.out.println("created candle");
	}
	
}