package factoryMethod.ver00;

public class Client02 implements ExportFileApi {

	public static void main(String[] args){
		new Client02().export("test2");
	}
	
	@Override
	public boolean export(String data) {
		System.out.println("Client02 out " + data);
		return false;
	}

}
