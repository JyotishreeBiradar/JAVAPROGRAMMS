class RadioRunner
{
	public static void main(String[] values)
	{
		System.out.println("start main in RadioRunner");
		Radio radio=new Radio("Sony",3000);
		Radio radio1=new Radio("Panasonic",4000);
		
		System.out.println("Radio radio:"+radio.frequency);
		radio.isOn=true;
		System.out.println("Radio radio:"+radio.brand);
		System.out.println("Radio radio1:"+radio1.brand);
		System.out.println("Radio radio:"+radio.price);
		System.out.println("Radio radio1:"+radio1.price);
		System.out.println("Radio radio:"+radio.isOn);
		
		System.out.println("end main in RadioRunner");
	}
}