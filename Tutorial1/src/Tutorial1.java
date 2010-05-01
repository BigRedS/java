package tutorial1;

/**
 * The tutorial1 package implements...
 */

:w

class Bicycle {

       int cadence = 0;
       int speed = 0;
       int gear = 1;

       void changeCadence(int newValue) {
            cadence = newValue;
       }

       void changeGear(int newValue) {
            gear = newValue;
       }

       void speedUp(int increment) {
            speed = speed + increment;   
       }

       void applyBrakes(int decrement) {
            speed = speed - decrement;
       }

       void printStates() {
            System.out.println("cadence:"+cadence+" speed:"+speed+" gear:"+gear);
       }
}

interface TV {
	int channel = 1;
	int volume = 2;
	
	public void changeChannel(int newValue);
	public void increaceVolume(int increment);
	public void decreaceVolume(int increment);
}

class digitalTV implements TV {
	
	boolean settopbox = false;
	int channel = 1; 
	int volume = 2;
	
	void setTopBox(boolean newValue){
		settopbox = newValue;
	}
	
	public void changeChannel(int newValue){
		channel = newValue;
	}
	public void increaceVolume(int increment){
		volume = volume + increment;
	}
	public void decreaceVolume(int increment){
		volume = volume - increment;
	}
	

	public void sayStuff(String string){
		String s = "hello";
		s = "Not hello";
		System.out.println(s);
	}
}

 

:w
^
1 error

