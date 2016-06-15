
public class Robot {
		double id;
		
		class Brain{
			public void think(){
				System.out.println("Robot " + id +"is thniking....");
			}
		}	
		
		public Robot(double id) {
			this.id = id;
		}
		
		public void play(){
			Brain brain = new Brain();
			brain.think();
			System.out.println("Finished!!");
			
			class Temp{
				public void doSomething(){
				
					System.out.println("Did Something!!!");
			
				}
				
		}
			Temp temp = new Temp();
			temp.doSomething();
		}

}
