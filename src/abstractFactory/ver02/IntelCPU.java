package abstractFactory.ver02;

public class IntelCPU implements CPUApi {
	private int pins = 0;
	
	public IntelCPU(int pins){
		this.pins = pins;
		
	}
	
	@Override
	public void calculate() {
		System.out.println("now in intel CPU,pins = " + pins);

	}

}
