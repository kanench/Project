
public class Machine implements Info, IStartable{
	
	int id;

	public Machine(int id) {
		this.id = id;
	}

	@Override
	public void showinfo() {
		System.out.println("Machine ID: " + id);
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Machine is Starting ");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Machine is Stopping ");
	}

}
