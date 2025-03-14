//pioletPen

public class PilotPen 
{
	public void thickPen(String str)
	{
		System.out.println(str);
	}
}

//PenAdapter

public class PenAdapter implements Pen 
{
	PilotPen mypp = new PilotPen();  //PenAdapter taking implementation of Piolate pen.and overrides with pen method

	@Override
	public void writing(String str) {
		mypp.thickPen(str);
		
	}
}

//School

public class School {

	public static void main(String[] args) {
		Pen obj = new PenAdapter();
		
		Assignment assobj = new Assignment();
		assobj.setmypen(obj);
		assobj.writingAssignment("i can't write assignment now");
		
		//flow - piolatepen -> penadapter -> school -> Assignment -> pen
	}
}

//Assignment

public class Assignment
{
	
	private Pen mypen;  //you will get object of mypen (i.e penadaapter simply Pen obj = new PenAdapter();)

	public void setmypen(Pen mypen) {
		this.mypen = mypen;
	}
	
	public void writingAssignment(String str)  //to write assignment i require pen.so iam creating pen Interface
	{
		mypen.writing(str);  
	}

}

//Pen

public interface Pen 
{
	public void writing(String str);
}