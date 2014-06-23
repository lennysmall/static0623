package kr.ac.fighter;

public class Fighter {
	String name;
	int hp;
	boolean alive = true;
	public Fighter(String name, int hp){
		this.name = name;
		this.hp = hp;
	}

	public void attack(Fighter fighter, int power){
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
}
