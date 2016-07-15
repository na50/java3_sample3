package animal;

public class Cheetar implements Animal{
	String name;
	int speed;
	
	public Cheetar(){
		name = "チーター";
		speed = 110;
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
