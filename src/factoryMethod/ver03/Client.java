package factoryMethod.ver03;

public class Client {

	public static void main(String[] args){
		ExportOperate operate = new ExportOperate();
		operate.export(1,"hello world");
		operate.export(2,"hello world");

		
	}
	
}
