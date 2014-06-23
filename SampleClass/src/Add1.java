

public class Add1 {
	String name;
	int hp;
	boolean alive = true;
	public Add1(String name, int hp){
		this.name = name;
		this.hp = hp;
	}

	public void attack(Add1 fighter, int power){
		fighter.beAttack(power);
		System.out.println(name+" is attack on "+fighter.name+" deal with "
				+power+" ("+fighter.name+" Hp :"+ fighter.hp+"/1000"+")");
	}

	private void beAttack(int power){
		hp-=power;
		if(hp<=0) alive = false;
	}

	public boolean isAlive(){
		return alive;
	}






	public static void main(String[] args) {
		Add1 ryu = new Add1("Ryu", 1000);
		Add1 ken = new Add1("Ken", 1000);
		
		while(ryu.isAlive() && ken.isAlive()){
			int rnd = (int)(Math.random()*100);
			ryu.attack(ken, rnd);
			rnd = (int)(Math.random()*100);
			ken.attack(ryu, rnd);
			
		}
		if(ryu.isAlive()){
			System.out.println("winner is Ryu");
		}else if(ken.isAlive()){
			System.out.println("winner is Ken");
		}else{
			System.out.println("double K.O");
		}
	}

}

