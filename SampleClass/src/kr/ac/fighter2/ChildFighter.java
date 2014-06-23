package kr.ac.fighter2;

public class ChildFighter extends Fighter{

	public ChildFighter(String name, int hp, int power, int depence) {
		super(name, hp, power, depence);
	}
	
	@Override
	protected void beAttack(int power) {
		System.out.println("ChildFighter's beAttack() 호출됨");
		hp-=power;
		if(hp<=0)alive=false;
	}
}
