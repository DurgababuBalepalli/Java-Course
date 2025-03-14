class Hello{
	int a = 10;
	public void meth(){
		Hai hii = new Hai();
		hii.methb(); 
	}

	class Hai{
	void methb(){	
    System.out.println(a);
	}
  }
}

class Fin{
	public static void main(String[] args) {
		Hello helloo = new Hello();
		helloo.meth();
}
}
