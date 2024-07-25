class GameNames
{
   public static void main(String[] args)
   {
     System.out.println("start main in GameNames");
	 
	 String game1="Volley ball";
	 String game2="Badmitton";
	 String game3="Cricket";
	 String game4="Football";
	 String game5="Hockey";
	 String game6="Tennis";
	 String game7="Basketball";
	 String game8="Throwball";
	 String game9="Hide and seek";
	 String game10="Lagori";
	 
	 String[] Totalgamenames={game1,game2,game3,game4,game5,game6,game7,game8,game9,game10};
	 
    for(int begin=0;begin<Totalgamenames.length;begin++)
	  {
		
		  System.out.println("Begin:"+Totalgamenames[begin]);
	  }
	  System.out.println(Totalgamenames.length);
	  System.out.println("end main in gameNames");  

}
}