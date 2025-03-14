//multi threading using thread class (extending)
class Durga extends Thread{
	public void run(){
		System.out.println("executed by jvm");
	}
	public static void main(String[] args) {
		Durga obj = new Durga();
		Thread th = new Thread(obj);
		th.start();

	}
}