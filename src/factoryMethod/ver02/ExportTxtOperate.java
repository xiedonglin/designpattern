package factoryMethod.ver02;

public class ExportTxtOperate extends ExportOperate {
	@Override
	protected ExportFileApi factoryMethod() {
		return new ExportTxt();
	}
}
