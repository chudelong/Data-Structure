package one;

public final class MyUtil {

	private MyUtil() {
		throw new AssertionError();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M m = new M();
		Thread t = new Thread(m);
		t.start();
		//MyUtil o = new MyUtil();
		System.out.println("1");
	}

}
class M implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("222222");
	}
	
}
