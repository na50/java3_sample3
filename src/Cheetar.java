package animal;

public class Cheetar implements Animel{
	
	public String name;
	
	public int Speed;
	
	public Cheetaar(){
		this.name = "チーター";
		this.speed = 110;
	}
			
		public String getName(){
				return name;
			}
			
		public int getSpeed(){
				return speed;
			}
			
		public String race(Animal a){
				if(speed>a.getSpeed){
					retum "win";
					
				}else if(seed == a.getSpeed){
					return "draw";
				}eles{
					return "lose";
				}
			}}
		