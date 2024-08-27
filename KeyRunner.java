class KeyRunner
{
	public static void main(String[] args)
	  {
		System.out.println("start main in KeyRunner");
		
		Key ref=new Key();
		System.out.println("default value:"+ref.cost);
		
		Key ref1=new Key();
		System.out.println("updated:"+ref1.material);
		
		
		System.out.println("end main in KeyRunner");
	}
}