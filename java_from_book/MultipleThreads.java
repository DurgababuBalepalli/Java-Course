class Durga implements Runnable{
	String name;
	Durga(String name1){
       name = name1;
	}

	public void run(){
		for (int i=0;i<=10 ;i++ ) {
			System.out.println(name + ":" +i);
		}
	}
	public static void main(String[] args) {
		Durga obj = new Durga("TH1");
		Durga obj1 = new Durga("TH2");
		Thread tk = new Thread(obj);
		Thread tt = new Thread(obj1);
		tk.start();
		tt.start();             
        /*for (int i=0;i<=10 ;i++ ) {
			System.out.println(i); 
		} */
	}
}