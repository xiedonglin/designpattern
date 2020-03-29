package facade.ver02;

import facade.ver02.Business;
import facade.ver02.DAO;
import facade.ver02.Presentation;

public class Facade {

	public void generate(){
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}
}
