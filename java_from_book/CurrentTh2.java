class Durga implements Runnable{
	public void run(){
        Thread tl = Thread.currentThread();     // second t1 executes
        System.out.println(tl);
	}
	public static void main(String[] args) {
		Durga obj = new Durga();
		Thread tk = new Thread(obj);
		tk.start();
		Thread tl = Thread.currentThread();      //first main thread execute
        System.out.println(tl);                  //Thread[main,5,main]
	}
}