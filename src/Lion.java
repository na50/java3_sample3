package animal;

public class Lion implements Animal{
	String name;
	int speed;
	
	public Lion(){
		name = "ƒ‰ƒCƒIƒ“";
		speed = 60;
	}

	public String getName(){
		return name;
	}
	
	public int getSpeed(){
		return speed;
	}

	public String race(Animal a){
		if(speed > a.getSpeed()){
			return name + " Win";
		}else if(speed < a.getSpeed()){
			return name + " Lose";
		}else{
			return "Draw";
		}
	}
}