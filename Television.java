/** 
*The purpose of this class is to model a television
*Your name and today’s date
*/

public class Television
{
	private final String MANUFACTURER; //For the manufacturer name
	private final int SCREEN_SIZE;     //For the screen size
	private boolean powerOn;           //Switch to turn TV on
	private int channel;               //For channel number
	private int volume;                //For volume number
	
	/**
	 * This constructor method is meant to set variables of
	 * the TV
	 * @param brand sets the manufacturer of the television
	 * @param size sets the size of the screen
	 */
	public Television(String brand, int size)
	{
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	/**
	 * This method gets and returns the number in volume
	 * @return volume
	 */
	public int getVolume()
	{
		return volume;
	}
	
	/**
	 * This method gets and returns the number in channel
	 * @return channel
	 */
	public int getChannel()
	{
		return channel;
	}
	
	/**
	 * This method gets and returns the manufacturer
	 * @return MANUFACTURER
	 */
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	
	/**
	 * This method gets and returns the number in SCREEN_SIZE
	 * @return SCREEN_SIZE
	 */
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	/**
	 * This method sets the channel of the TV
	 * @param station is the channel that is set
	 */
	public void setChannel(int station)
	{
		this.channel = station;
	}
	
	/**
	 * This method turns the TV on or off
	 */
	public void power()
	{
		powerOn = !powerOn;
	}
	
	/**
	 * This method increases the volume by one
	 */
	public void increaseVolume()
	{
		volume++;
	}
	
	/**
	 * This method decreases the volume by one
	 */
	public void decreaseVolume()
	{
		volume--;
	}
}
