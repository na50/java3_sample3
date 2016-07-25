package animal;

public class Horse implements Animal{

	String name;

	int speed;

	Horse(){
		this.name = "”n";
		this.speed = 80;
	}
	
	public String getName(){
		return name;
	}

	public int getSpeed(){
		return speed;
	}

	public String race(Animal a){
		if(speed > a.getSpeed()){
			return "win";

		}else if(speed == a.getSpeed()){
			return "draw";

		}else {
			return "lose";
		}
	
}}