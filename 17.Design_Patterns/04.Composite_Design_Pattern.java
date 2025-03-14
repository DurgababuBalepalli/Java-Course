
//all computer parts devided here as leaf nodes and composites.
package com.durga;

import java.util.ArrayList;
import java.util.List;

//if i ask price of mouse(the leaf node),we could be able to give that.and the same price should given by even if i ask composite note(i.e pheripheral devices)
//so leaf node and composite node should share some common data

interface Components  //this is for common things writing
{
	public void showPrice();
}
class Leaf implements Components     //leafnode
{
	int price;
	String name;
	
	public Leaf(int price, String name) {   //iam taking constructor to pass values
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(name+" : "+price);
	}
	
}
class CompositeNode implements Components   //composite node
{
	String name;
	
	public CompositeNode(String name) {    //iam taking constructor to pass values
		super();
		this.name = name;
	}

	//we know composite node has list of composites or leaf nodes(so composite has leafnodes or composites as components).so composite node could be able to give leafnode or list of components
	List<Components> ourcomponents = new ArrayList<>();
	
	public void addingComponent(Components mycom)  //iam writing a method 
	{
		ourcomponents.add(mycom);
	}
	
	@Override
	public void showPrice() {
		System.out.println("-------"+name+"--------"); //iam printing composite node also
		
		for(Components mycom : ourcomponents)
		{
			mycom.showPrice();   //iam again asking show price.because if we have composite-composite-leaf,it works
		}
	}
	
}

//compositesMain class.from here you can pass values

package com.durga;

public class CompositeMain {
	public static void main(String[] args)
	{
		Components myhd = new Leaf(4000, "HD");
		Components mymouse = new Leaf(500, "Mouse");
		Components mykeyboard = new Leaf(700, "Keyboard");
		Components myram = new Leaf(3000, "RAM");
		
		CompositeNode mycabinet = new CompositeNode("Cabinet");     //iam taking directly compositeNode class.because other methods won't work if i take superclass reference
		CompositeNode mypheripherals = new CompositeNode("Pheripherals");
		CompositeNode mycomputer = new CompositeNode("Computer");
		
		//till now we have taken composites and leaf nodes.now we have to add those things
		mycabinet.addingComponent(myhd);   //iam adding components to Cabinet composite
		mycabinet.addingComponent(myram);
		
		mypheripherals.addingComponent(mymouse);  //iam adding components to Pheripherals composite
		mypheripherals.addingComponent(mykeyboard);
		
		//iam adding pheripherals,cabinet composites to computer
		mycomputer.addingComponent(mycabinet);
		mycomputer.addingComponent(mypheripherals);
		
		//if you want ram price
		myram.showPrice();
		
		//if you want pheripheral composite values
		mypheripherals.showPrice();
		
		//you can print entire structure
		mycomputer.showPrice();
	}
}
