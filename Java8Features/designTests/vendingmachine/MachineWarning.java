package vendingmachine;

public class MachineWarning extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MachineWarning(String string) {
		super();
		System.out.println(string);
	}

}
