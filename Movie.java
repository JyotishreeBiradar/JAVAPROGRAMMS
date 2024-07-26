class Movie
{
  public static void main(String[] args)
  {
	  System.out.println("start main in Movie");
	  String movie1="Ramachari";
	  String movie2="Kiratak";
	  String movie3="Janu";
	  String movie4="Modalasal";
	  String movie5="Googly";
	  String movie6="Masterpiece";
	  String movie7="Rajadhani";
	  String movie8="Lucky";
	  String movie9="Kgf";
	  String movie10="Rajahuli";
	  String movie11="Gajakesari";
	  String movie12="Drama";
	  String movie13="Yajamana";
	  String movie14="Parva";
	  String movie15="Kadamba";
	  String movie16="Kotigobba";
	  String movie17="Diggajaru";
	  String movie18="Soorappa";
	  String movie19="Habba";
	  String movie20="Laali";
	  
	  String[] Totalmovies={movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10,movie11,movie12,movie13,movie14,movie15,movie16,movie17,movie18,movie19,movie20};
	   
	  for(int begin=Totalmovies.length-1;begin>=0;begin--)
	  {
		
		  System.out.println("Begin:"+Totalmovies[begin]);
	  }
	  System.out.println(Totalmovies.length);
	  System.out.println("end main in Movie");  
  }



}