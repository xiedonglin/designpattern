package simplefactory;

import simplefactory.common.I硬盘通用接口Api;
import simplefactory.ver01.IBM硬盘Impl;
import simplefactory.ver01.Intel硬盘Impl;
import simplefactory.ver01.NEC硬盘Impl;
import simplefactory.ver02.Factory;

public class client {
	public static void main(String[] args) {
		// // ver01的调用----------------------
		// I硬盘通用接口Api ibm = new IBM硬盘Impl();
		// // 客户知道了接口的实现的方法名 test（）
		// ibm.硬盘插入();
		//
		// I硬盘通用接口Api inter = new Intel硬盘Impl();
		// // 客户知道了接口的实现的方法名 test（）
		// inter.硬盘插入();
		//
		// I硬盘通用接口Api nec = new NEC硬盘Impl();
		// // 客户知道了接口的实现的方法名 test（）
		// nec.硬盘插入();
		// // ver01的调用----------------------

		// ver02的调用----------------------
		I硬盘通用接口Api a = Factory.createApi("ibm", new Object[] { "1", true, "2" });
		a.硬盘插入();
		a = Factory.createApi("nec", new Object[] { "1", "2" });
		a.硬盘插入();
		a = Factory.createApi("intel", new Object[] { "1" });
		a.硬盘插入();
		// ver02的调用----------------------
	}
}
