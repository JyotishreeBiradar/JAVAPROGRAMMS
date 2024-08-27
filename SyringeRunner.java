class SyringeRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in SyringeRunner");
		Syringe syringe=new Syringe(1.0,"BD");
		Syringe syringe1=new Syringe(5.0,"Terumo");
		
		System.out.println("Syringe syringe:"+syringe.type);
		syringe.disposable=false;
		System.out.println("Syringe syringe:"+syringe.capacity);
		System.out.println("Syringe syringe1:"+syringe1.capacity);
		System.out.println("Syringe syringe:"+syringe.brand);
		System.out.println("Syringe syringe1:"+syringe1.brand);
		System.out.println("Syringe syringe:"+syringe.disposable);
		
		System.out.println("end main in SyringeRunner");
	}
}