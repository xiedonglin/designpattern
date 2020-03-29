package abstractFactory.ver02;

public class CPUFactory {

	public static CPUApi createCPUApi(int type){
		CPUApi cpu = null;
		if(1== type){
			cpu = new IntelCPU(1156);
		}else if(type == 2) {
			cpu = new AMDCPU(939);
		}
		return cpu;
	}
	
}
