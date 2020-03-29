package abstractFactory.ver01;

public class MainboardFactory {
	public static MainboardApi createMainboardApi(int type){
		MainboardApi board = null;
		if(1== type){
			board = new GAMainboard(1156);
		}else if(type == 2) {
			board = new MSIMainboard(939);
		}
		return board;
	}
}
