package factoryMethod.ver02;

public class ExportDBOperate extends ExportOperate {

	@Override
	protected ExportFileApi factoryMethod() {
		return new ExportDB();
	}

}
