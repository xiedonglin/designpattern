package simplefactory.ver02;

import simplefactory.common.I硬盘通用接口Api;
import simplefactory.ver01.IBM硬盘Impl;
import simplefactory.ver01.Intel硬盘Impl;
import simplefactory.ver01.NEC硬盘Impl;

public class Factory {
	public static I硬盘通用接口Api createApi(String condition, Object[] arg) {
		System.out.print(condition + "-----");
		for (Object s : arg) {
			System.out.print(String.valueOf(s) + "\t");
		}

		I硬盘通用接口Api api = null;
		System.out.println(condition + " 认证");
		if ("ibm".equals(condition)) {
			api = new IBM硬盘Impl();
		} else if ("intel".equals(condition)) {
			api = new Intel硬盘Impl();
		} else if ("nec".equals(condition)) {
			api = new NEC硬盘Impl();
		}
		return api;
	}
}
