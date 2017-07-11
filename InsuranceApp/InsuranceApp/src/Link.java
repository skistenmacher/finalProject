public class Link {

	public String name;
	public String state;
	public int veh;
	public int drv;
	public String cov;

	public Link next;


	public Link(String name, String state, int drv, int veh, String cov) {
		this.name = name;
		this.state = state;
		this.drv = drv;
		this.veh = veh;
		this.cov = cov;
	}

	public void display() {

		System.out.println("Name: " + name + "; " + "State: " + state + "; " + "Drivers: " + drv + "; " + "Vehicles: " + veh + "Coverage: " + cov);

	}

	public String toString() {

		return name;

	}

}