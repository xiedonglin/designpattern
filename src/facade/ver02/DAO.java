package facade.ver02;

public class DAO {
	public void generate(){
		ConfigModel cm = ConfigManager.getInstance().getConfigDate();
		if (cm.isNeedGenDAO()){
			System.out.println("数据层代码文件生成");
		}
	}
}
