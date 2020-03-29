/**
 * MIT License
 * <p>
 * Copyright (c) 2017 James
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package singleton.ver02;

/**
 * Singleton
 */
public class Client {

	public static void main(String[] args) {

//		// “饿汉式” 单例模式
//		饿汉本田CRV director1 = 饿汉本田CRV.getInstance();
//		饿汉本田CRV director2 = 饿汉本田CRV.getInstance();
//		System.out.println(director1);
//		System.out.println(director2);

		
		
		// “懒汉式” 单例模式
		懒汉本田CRV lazyDirector1 = 懒汉本田CRV.getInstance();
		懒汉本田CRV lazyDirector2 = 懒汉本田CRV.getInstance();
		System.out.println(lazyDirector1);
		System.out.println(lazyDirector2);
//
//		// 双检锁
//		ThreadSafeDoubleCheckLocking doubleCheckLocking1 = ThreadSafeDoubleCheckLocking.getInstance();
//		System.out.println(doubleCheckLocking1);
//		ThreadSafeDoubleCheckLocking doubleCheckLocking2 = ThreadSafeDoubleCheckLocking.getInstance();
//		System.out.println(doubleCheckLocking2);
//
//		// 线程安全的“懒汉式” 单例模式
//		ThreadSafeLazyLoadDirector lazyLoadDirector1 = ThreadSafeLazyLoadDirector.getInstance();
//		System.out.println(lazyLoadDirector1.toString());
//		ThreadSafeLazyLoadDirector lazyLoadDirector2 = ThreadSafeLazyLoadDirector.getInstance();
//		System.out.println(lazyLoadDirector2.toString());
//
//		// 枚举型的单例模式
//		EnumDirector enumDirector1 = EnumDirector.INSTANCE;
//		System.out.println(enumDirector1);
//		EnumDirector enumDirector2 = EnumDirector.INSTANCE;
//		System.out.println(enumDirector2);
//
//		Throwable ex = new Throwable();
//		StackTraceElement[] stackElements = ex.getStackTrace();
//		if (stackElements != null) {
//			for (int i = 0; i < stackElements.length; i++) {
//				System.out.print(stackElements[i].getClassName() + "/t");
//				System.out.print(stackElements[i].getFileName() + "/t");
//				System.out.print(stackElements[i].getLineNumber() + "/t");
//				System.out.println(stackElements[i].getMethodName());
//				System.out.println("-----------------------------------");
//			}
//		}
	}
}
