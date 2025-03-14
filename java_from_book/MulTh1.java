//multithreading using Runnable Interface
class Durga implements Runnable{
	public void run(){
		System.out.println("thread using runnable interface");
	}
	public static void main(String[] args) {
		Durga obj = new Durga();
		Thread th = new Thread(obj);
		th.start();
	}
}