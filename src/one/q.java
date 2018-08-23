package one;

public class q {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		Thread t = new Thread(my);
		t.start();
		System.out.println("2");
	}
}

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}
	
}
