package facade.ver01;

public class Presentation {
	public void generate(){
		ConfigModel cm = ConfigManager.getInstance().getConfigDate();
		if (cm.isNeedGenPresentation()){
			System.out.println("表示层代码文件生成");
		}
	}
}
