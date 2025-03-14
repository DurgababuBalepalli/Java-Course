//think,if object is returning then every value in it will be returned. 
class ThisExample {
    
    int x;
    int y;
    
    ThisExample(int x,int y)
    {
    	this.x = x;
    	this.y = y;
    	
    	durga(this); //this will send object to durga
    	
    	System.out.println("x is : "+this.x);
    }
    
    void durga(ThisExample obj)       //you will get current class object here. you can this generally we create in main method,but this keyword is argument.so refered to obj of class
    {
    	obj.x = x+2;
    }
   
}

public class Tk044ThisKeywordAsAnArgugument {

	public static void main(String[] args) {
		new ThisExample(3,7);
	}

}
