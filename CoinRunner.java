class CoinRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in CoinRunner");
		
		Coins coins=new Coins();
		System.out.println("default value:"+coins.coin);
		
		Coins coins1=new Coins();
		System.out.println("updated value:"+coins1.type);
		
		Coins coins2=new Coins();
		System.out.println(coins2.material);
		
		
		System.out.println("end main in coinRunner");
	}
	
}