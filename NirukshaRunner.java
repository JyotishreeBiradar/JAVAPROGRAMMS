class NirukshaRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in Niruksha");
		
		Niruksha niruksha=new Niruksha();
		System.out.println("default value:"+niruksha.height);
		
		Niruksha niruksha1=new Niruksha();
		System.out.println("updated value:"+niruksha.heights);
		
		
		System.out.println("end main in Niruksha");
	}
	
}