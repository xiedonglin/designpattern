package facade;

import facade.ver01.Business;
import facade.ver01.DAO;
import facade.ver01.Presentation;
import facade.ver02.Facade;

public class client {
	public static void main(String[] args){
		System.out.println("版本一的调用-----------------");
		// ver01的调用----------------------
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
		// ver01的调用----------------------
		

		System.out.println("版本二的调用-------------------");
		// ver02的调用----------------------
		new Facade().generate();
		// ver02的调用----------------------
	}
}
