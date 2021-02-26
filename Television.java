/** 
*The purpose of this class is to model a television
*Taj Wilkinson, 2/24/21
*/

public class Television {
	private final String MANUFACTURER; //represents the brand of TV
	private final int SCREEN_SIZE; //represents the size of the screen
	
	private boolean powerOn; //represents whether the TV is on or off; false is off, true is on
	private int channel; //represents the channel the TV is tuned to 
	private int volume; //represents how loud the volume is; 0 is silent
	
	/**
	 * Constructor for Television objects.
	 */
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	//accessors
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	//mutators
	
	public void setChannel(int newChannel)  {
		channel = newChannel;
	}
	
	/**
	 * Turns power off if it is on, and turns it on if it is off.
	 * Equivalent to pressing a TV's power button.
	 */
	public void power() {
		powerOn = !powerOn;
	}
	/**
	 * Decreases volume by 1.
	 */
	public void decreaseVolume() {
		volume--;
	}
	/**
	 * Increases volume by 1.
	 */
	public void increaseVolume() {
		volume++;
	}
	
}
