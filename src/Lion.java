package animal;

public class Lion implements Animal{
	private String name;

	private int speed;

	public Lion(){
		this.name = "ライオン";
		this.speed = 60;
	}

	public String getName(){
		return name;
	}

	public int getSpeed(){
		return speed;
	}

	public String race(Animal a){
		if (speed > a.getSpeed()) {
			return "win";
		}else if(speed == a.getSpeed()){
			return "draw";
		}else{
			return "lose";
		}
	}

}