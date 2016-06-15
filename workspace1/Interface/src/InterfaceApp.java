
public class InterfaceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Christian");
		
		Machine machine = new Machine(107);
		person.showinfo();
		machine.showinfo();
		
		machine.start();
		machine.stop();
	}

}
