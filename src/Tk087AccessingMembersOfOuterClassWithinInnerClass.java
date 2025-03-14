

class Bus 
{
    String busName;
    String busType;

    public Bus(String busName, String busType) 
    {
        this.busName = busName;
        this.busType = busType;
    }

    private String gettingBusname()
    {
    	//System.out.println(this.busName);
    	return this.busName;
    }
    
    class Engine
    {
    	String engine;
    	void setEngine()
    	{
    		//System.out.println(Bus.this.busType);
    		if(Bus.this.busType.equals("rtc"))
    		{
    			//System.out.println(Bus.this.gettingBusname());  //red
    			if(Bus.this.gettingBusname().equals("red"))
    			{
    				this.engine = "smallengine";
    			}
    			else            //suppose think it is green bus
    			{
    				this.engine = "big engine";
    			}
    		}
    		else
    		{
    			this.engine = "i dont know";
    		}
    	}
    	String gettingEngine()
    	{
    		return engine;
    	}
    }

}
public class Tk087AccessingMembersOfOuterClassWithinInnerClass {

	public static void main(String[] args) {
		Bus obj = new Bus("green","rtc");
        Bus.Engine obj1 = obj.new Engine();
        obj1.setEngine();
        System.out.println(obj1.gettingEngine());

	}

}
