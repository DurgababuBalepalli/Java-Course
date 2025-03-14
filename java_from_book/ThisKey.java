//using this keyword
class Durga{                    
	int apple;                      // these are global variables
	int orange;
	Durga(int apple,int orange){    //these are local variables.
       this.apple = apple;
       this.orange = orange; 
	}
}
class Th{
	public static void main(String[] args) {
		Durga dd = new Durga(5,6);
		System.out.println(dd.apple);
		System.out.println(dd.orange);
	}
}
