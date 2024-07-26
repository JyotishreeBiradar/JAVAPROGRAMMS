class SongNames
{
  public static void main(String[] args)
  {
	System.out.println("start main in SongNames");
	String song1="Amma I Love You";	
	String song2="Yenagali munde sagu ni";
    String song3="Yare ni devateya";
    String song4="Ninadena";
    String song5="Karmoda suridu";
    String song6="Nine nine";
    String song7="Araluva hugale";
    String song8="Bombe helutaite";
    String song9="Neenu iruvag";
    String song10="Anna tangiyar e bandha";
    

	
    String[] Totalsongnames={song1,song2,song3,song4,song5,song6,song7,song8,song9,song10};
	for(int begin=Totalsongnames.length-1;begin>=0;begin--)
	  {
		
		  System.out.println("Begin:"+Totalsongnames[begin]);
	  }
	  System.out.println(Totalsongnames.length);
		
	System.out.println("end main in SongNames");	
   }
	
	
}