package kr.ac.fighter;

public class FighterTest {

	public static void main(String[] args) {
		Fighter ryu = new Fighter("Ryu", 1000);
		Fighter ken = new Fighter("Ken", 1000);
		
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
