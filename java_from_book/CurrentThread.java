//multithreading using Runnable Interface
class Durga implements Runnable{
	public void run(){
		
	}
	public static void main(String[] args) {
		Durga obj = new Durga();
		Thread th = new Thread(obj);
		th.start();
		Thread.currentThread();  //by default main method have one thread.
		System.out.println(th);
	}
}