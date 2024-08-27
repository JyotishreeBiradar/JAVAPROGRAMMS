class WalletRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in WalletRunner");
		Wallet ref=new Wallet();
		System.out.println("wallet cost:"+ref.cost);
		System.out.println("wallet brand:"+ref.brand);
		ref.cost=300;
		ref.brand="Leather";
		System.out.println("Wallet cost:"+ref.cost);
		System.out.println("Wallet brand:"+ref.brand);
		
		
		Spactula ref1=new Spactula();
		System.out.println("Spactula cost:"+ref1.cost);
		System.out.println("Spactula material:"+ref1.material);
		ref1.cost=150;
		ref1.material="Steel";
		System.out.println("Spactula cost:"+ref1.cost);
		System.out.println("Spactula material:"+ref1.material);
		
		IronBox ref2=new IronBox();
		System.out.println("IronBox cost:"+ref2.cost);
		System.out.println("IronBox material:"+ref2.material);
		ref2.cost=2000;
		ref2.material="Castiron";
		System.out.println("IronBox cost:"+ref2.cost);
		System.out.println("IronBox material:"+ref2.material);
		
		Pillow ref3=new Pillow();
		System.out.println("Pillow cost:"+ref3.cost);
		System.out.println("Pillow material:"+ref3.color);
		ref3.cost=200;
		ref3.color="Yellow";
		System.out.println("Pillow cost:"+ref3.cost);
		System.out.println("Pillow color:"+ref3.color);
		
		Mirror ref4=new Mirror();
		System.out.println("Mirror cost:"+ref4.cost);
		System.out.println("Mirror material:"+ref4.material);
		ref4.cost=1500;
		ref4.material="Glass";
		System.out.println("Mirror cost:"+ref4.cost);
		System.out.println("Mirror color:"+ref4.material);
		
		
		
		System.out.println("end main in WalletRunner");
	}
}