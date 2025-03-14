import java.util.*;
import java.awt.*;
class first 
{
	first()
	{
		Frame f= new Frame();
		Button b=new Button("click me");
		b.setBounds(100,120,100,120);
		f.add(b);
		f.setSize(100,200);
		f.setVisible(true);

	}
	public static void main(String args[])
	{
		first f=new first();
	}
}