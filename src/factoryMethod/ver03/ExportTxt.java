package factoryMethod.ver03;

import factoryMethod.ver03.ExportFileApi;

public class ExportTxt implements ExportFileApi {

	@Override
	public boolean export(String data) {
		System.out.println("导出数据" + data + "到文本文件");
		return true;
	}

}
