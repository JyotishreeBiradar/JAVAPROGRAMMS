class AnimalName
{
	public static void main(String[] args)
	{
		System.out.println("start main in AnimalName");
		
		String animal1="Dog";
		String animal2="Cat";
		String animal3="Cow";
		String animal4="Elephant";
		String animal5="Rabbit";
		String animal6="Tiger";
		String animal7="Sheep";
		String animal8="Goat";
		String animal9="Bear";
		String animal10="Lion";
		String animal11="Donkey";
		String animal12="Monkey";
		String animal13="Giraffe";
		String animal14="Camel";
		String animal15="Buffelo";
		String animal16="Leopard";
		String animal17="Zebra";
		String animal18="Deer";
		String animal19="Cheetah";
		String animal20="Fox";
		String[] Totalanimalnames={animal1,animal2,animal3,animal4,animal5,animal6,animal7,animal8,animal9,animal10,animal11,animal12,animal13,animal14,animal15,animal16,animal17,animal18,animal19,animal20};
		
		for(int begin=Totalanimalnames.length-1;begin>=0;begin--)
	  {
		
		  System.out.println("Begin:"+Totalanimalnames[begin]);
	  }
	  System.out.println(Totalanimalnames.length);
	  System.out.println("end main in animalName");  
		
	
	}
	
}