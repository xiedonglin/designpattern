package factoryMethod.ver00;

public class Client01 implements ExportFileApi {

	public static void main(String[] args){
		new Client01().export("test1");
	}
	
	@Override
	public boolean export(String data) {
		System.out.println("Client01 out " + data);
		return false;
	}

}
