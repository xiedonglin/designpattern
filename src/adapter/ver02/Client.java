package adapter.ver02;

import adapter.ver01.Computer;
import adapter.ver01.SDCard;
import adapter.ver01.SDCardImpl;
import adapter.ver01.ThinkpadComputer;

public class Client {

	public static void main(String[] args) {
		Computer computer = new ThinkpadComputer();
		SDCard sdCard = new SDCardImpl();
		System.out.println(computer.readSD(sdCard));
		System.out.println("----------------");
		TFCard tfCard= new TFCardImpl();
		SDCard tfCardAdp = new SDAdapterTF(tfCard);
		System.out.println(computer.readSD(tfCardAdp));
	}
}
