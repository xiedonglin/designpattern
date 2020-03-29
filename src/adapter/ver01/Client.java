package adapter.ver01;

public class Client {

	public static void main(String[] args) {
		Computer computer = new ThinkpadComputer();
		SDCard sdCard = new SDCardImpl();
		System.out.println(computer.readSD(sdCard));
	}
}
