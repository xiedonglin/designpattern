package factoryMethod.ver03;

public class ExportOperate {

	public boolean export(int type,String data){
		ExportFileApi api = factoryMethod(type);
		return api.export(data);
	}
	
	protected ExportFileApi factoryMethod(int type){
		ExportFileApi ret = null;
		if (1== type){
			ret = new ExportTxt();
		}else{
			ret = new ExportDB();
		}
		return ret;
	}
	
}
