class Paper
{
  double thickness=15;
  String size;
  double quality;
  String color;
  
  Paper(String size)
  {
	  System.out.println("created size");
	  this.size=size;
  }
  
  public void Setquality(double quality)
  {
	   System.out.println("created quality");
      this.quality=quality;	   
  }
}