package factoryMethod.ver02;

public class Client {

	public static void main(String[] args){
		ExportOperate operatetxt = new ExportTxtOperate();
		operatetxt.export("hello world");

		ExportOperate operatedb = new ExportDBOperate();
		operatedb.export("hello world");
	}
	
}
