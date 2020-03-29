package facade.ver01;

public class Business {
	public void generate(){
		ConfigModel cm = ConfigManager.getInstance().getConfigDate();
		if (cm.isNeedGenBusiness() == false){
			System.out.println();
		}
		
		if (cm.isNeedGenBusiness()){
			System.out.println("逻辑层代码文件生成");
		}
	}
}
