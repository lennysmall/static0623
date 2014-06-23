package kr.ac.fighter2;

public class Fighter {
	String name;
	int hp;
	int power;
	int depence;
	Fighter another;

	boolean alive = true;
	public Fighter(String name,
			int hp,
			int power,
			int depence
			){

		this.name = name;
		this.hp = hp;
		this.power = power;
		this.depence = depence;
	}
	public void setTarget(Fighter fighter){
		this.another = fighter;
	}

	public void attack(){
		if(another == null){
			System.out.println("공격대생이 지정되지 않았습니다.");
			return;
		}
		int rnd = (power/2)+ (int)(Math.random()*power);
		another.beAttack(power);
		System.out.println(name+" is attack on "+another.name+" deal with "
				+power+" ("+another.name+" Hp :"+ another.hp+"/1000"+")");
	}

	protected void beAttack(int power){
		System.out.println("Fighter's beAttack() 호출됨");
		if(power>depence){
			hp-=(power - depence);
		}
		
		if(hp<=0) alive = false;
	}

	public boolean isAlive(){
		return alive;
	}

	
}
