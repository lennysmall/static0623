package kr.ac.fighter2;

public class FighterTest {

	public static void main(String[] args) {
		Fighter ryu = new Fighter("Ryu", 1000, 100, 50);
//		Fighter ken = new Fighter("Ken", 1000, 80, 60);
		ChildFighter ken = new ChildFighter("Ken", 1000, 80, 60);
		
		ryu.setTarget(ken);
		ken.setTarget(ryu);


		while(ryu.isAlive() && ken.isAlive()){
			ryu.attack();
			ken.attack();

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
