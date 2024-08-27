class MicroScopeRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in MicroScopeRunner");
		
		MicroScope ref=new MicroScope();
		MicroScope ref1=new MicroScope();
		MicroScope ref2=new MicroScope();
		MicroScope ref3=new MicroScope();
		MicroScope ref4=new MicroScope();
		MicroScope ref5=new MicroScope();
		MicroScope ref6=new MicroScope();
		
		System.out.println("referance MicroScope:"+ref.brand);
		System.out.println("referance MicroScope:"+ref1.magnification);
		System.out.println("referance MicroScope:"+ref2.size);
		System.out.println("referance MicroScope:"+ref3.price);
		
		ref.brand="Nikon";
		ref1.magnification=100;
		ref2.size="Large";
		ref3.price=100000;
		ref4.size="Big";
		ref5.brand="Magnus";
		ref6.price=80000;
		System.out.println("referance MicroScope:"+ref.brand);
		System.out.println("referance MicroScope:"+ref1.magnification);
		System.out.println("referance MicroScope:"+ref2.size);
		System.out.println("referance MicroScope:"+ref3.price);
		System.out.println("referance MicroScope:"+ref4.size);
		System.out.println("referance MicroScope:"+ref5.brand);
		System.out.println("referance MicroScope:"+ref6.price);
		
		System.out.println("end main in MicroScopeRunner");
	}
}