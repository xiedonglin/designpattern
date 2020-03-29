package singleton.ver00;

public class 使用者 {

	public static void main(String[] args) {
		本田CRV car1 = new 本田CRV();
		car1.run();
		
		本田CRV car2 = new 本田CRV();
		car2.run();
		System.out.println(car1);
		System.out.println(car2);
		
	}
}
