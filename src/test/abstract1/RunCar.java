package test.abstract1;

public class RunCar {

	public static void main(String[] args) {
		Lexus rx = new Lexus("Lexus");
		
		rx.name = "Lexus";
		rx.drive();
		rx.turnLeft();
		rx.stop();
		rx.stop();

	}

}
