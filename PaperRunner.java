class PaperRunner
{
  public static void main(String[] args)
	{
		System.out.println("Start running in main");
		
		Paper paper=new Paper("Small");    //referance
		paper.quality=7;
		paper.color="yellow";          //referance
		System.out.println("Thickness:"+paper.thickness);
		System.out.println("Size:"+paper.size);
		System.out.println("Quality:"+paper.quality);
		System.out.println("Color:"+paper.color);
		
		Paper paper1=new Paper("Medium");    //referance
		paper1.quality=5;
		paper.color="purple";            //referance
		System.out.println("Tickness:"+paper1.thickness);
		System.out.println("Size:"+paper1.size);
		System.out.println("Quality:"+paper1.quality);
		System.out.println("Color:"+paper1.color);
		
		Paper paper2=new Paper("Large");    //referance
		paper2.quality=3;
		paper.color="pink" ;           //referance
		System.out.println("Thickness:"+paper2.thickness);
		System.out.println("Size:"+paper2.size);
		System.out.println("Quality:"+paper2.quality);
		System.out.println("Color:"+paper2.color);
		
		System.out.println("end running in main");
			
	}
}