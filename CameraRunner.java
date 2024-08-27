class CameraRunner
{
	public static void main(String[] args)
	  {
		System.out.println("start main in CameraRunner");
		
		Camera ref=new Camera();
		System.out.println("default value:"+ref.cost);
		
		Camera ref1=new Camera();
		System.out.println("updated value:"+ref1.costs);
		
		Camera ref2=new Camera();
		System.out.println("default brand:"+ref2.brand);
		
		Camera ref3=new Camera();
		System.out.println("updated brand:"+ref3.brands);
		
		
		System.out.println("end main in CameraRunner");
	}
}