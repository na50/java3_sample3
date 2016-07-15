package animal;

public class Horse implements Animal{
	String name;
	int speed;
	
	public Horse(){
		name = "”n";
		speed = 80;
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