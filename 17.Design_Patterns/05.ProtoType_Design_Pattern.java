package stringsPractice;

import java.util.ArrayList;
import java.util.List;


//first explore some basic stuff. how to use getters and setters with ListInterface.
class A
{
	List<Integer> mylist = new ArrayList<>();

	public List<Integer> getMylist() {
		return mylist;
	}

	public void setMylist(List<Integer> mylist) {
		this.mylist = mylist;
	}
	
	public void meth()
	{
		System.out.println(mylist);
	}
}
class Hello {
	public static void main(String[] args)
	{
		
		A obj = new A();
		//obj.meth();  [] -empty list
		
		obj.getMylist().add(22);  //if you want to add elements individually,you need to use getter method.because setter method taking entire list once.
		obj.meth();
		//obj.setMylist(78);  //check,this is asking for pass entire list once.
	}
	
}

--------------------------------------------------------PROTOTYPE DESIGN PATTERN-------------------------------------------------
==========Shallow copy/Shallow cloning==========

//Books.java
package com.durga;

//you have to specify list of books.
public class Books 
{
	private int bookId;
	private String bookName;
	
	//to pass books iam using constructor
	public int getBookId() {     
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	//to print books iam using toString method
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	
}

//BooksShop.java
package com.durga;

import java.util.ArrayList;
import java.util.List;

//this is for my new BookShop
public class BookShop implements Cloneable 
{
	private String bookShopName;
	List<Books> ourbookslist = new ArrayList<>();
	
	//iam using getters and setters for books setting also
	public String getBookShopName() {
		return bookShopName;
	}
	public void setBookShopName(String bookShopName) {
		this.bookShopName = bookShopName;
	}
	public List<Books> getOurbookslist() {
		return ourbookslist;
	}
	public void setOurbookslist(List<Books> ourbookslist) {
		this.ourbookslist = ourbookslist;
	}
	
	public void addData()   //assume this method fetching data from DB and adding to the bookshop
	{
		for(int i=0;i<10;i++)  //lets say we have to add 10 books
		{
			Books booksObj = new Books();   
			booksObj.setBookId(i);			//we are setting "i" as bookId
			booksObj.setBookName("Book"+i);  //we are saying BookNames as Book1,Book2..Book9
			
			//ourbookslist.add(booksObj);  //without getters and setters to List you can use
			
			getOurbookslist().add(booksObj);  //you are adding all books using getters.see basic.
			
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [bookShopName=" + bookShopName + ", ourbookslist=" + ourbookslist + "]";
	}
	
	//i have define a clone method to override clone method(which is present at main)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}

//PrototypeMain.java
package com.durga;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		BookShop mybookshop = new BookShop();
		//System.out.println(mybookshop);        //BookShop [bookShopName=null, ourbookslist=[]]
		mybookshop.setBookShopName("Durga");
		mybookshop.addData();
		
		//mybookshop.getOurbookslist().remove(3);  //iam removing indexed 3 book
		System.out.println(mybookshop); 
		
		//by overriding with clone method.it will only do shallow cloning.means both mybookshop,mybookshop1 refering same object.so if you remove something from durga bookshop same refleced to babu bookshop
		BookShop mybookshop1 =(BookShop) mybookshop.clone();   //iam cloning(or coying) first bookshop to second bookshop.clone() is protective in object class.so you can't use.in order to use clone, our book shop should implement clonable interface
		mybookshop1.setBookShopName("Babu");		 //clonable interface is a marker interface.because it is not containing any methods.and you have to write a method to override clone method.clone method returns an object.so iam converting to bookshop object
													 //and clone throws a checked exception
		System.out.println(mybookshop1); 
		
		//whenever you remove 3 book see output
		//BookShop [bookShopName=Durga, ourbookslist=[Books [bookId=0, bookName=Book0], Books [bookId=1, bookName=Book1], Books [bookId=2, bookName=Book2], Books [bookId=4, bookName=Book4], Books [bookId=5, bookName=Book5], Books [bookId=6, bookName=Book6], Books [bookId=7, bookName=Book7], Books [bookId=8, bookName=Book8], Books [bookId=9, bookName=Book9]]]
		//BookShop [bookShopName=Babu, ourbookslist=[Books [bookId=0, bookName=Book0], Books [bookId=1, bookName=Book1], Books [bookId=2, bookName=Book2], Books [bookId=4, bookName=Book4], Books [bookId=5, bookName=Book5], Books [bookId=6, bookName=Book6], Books [bookId=7, bookName=Book7], Books [bookId=8, bookName=Book8], Books [bookId=9, bookName=Book9]]]

	}

}

======Deep copy/ Deep cloning==========

//just change BookShop

//i have define a clone method to override clone method(which is present at main)
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		//you don't call super class of clone.you have to create one more object of BookShop.because you are returning bookshop object
		BookShop mybs = new BookShop(); //we have to create a new object..this goes BookShop [bookShopName=Babu, ourbookslist=[]]
		//now i need to fetch values from durga bookshop and send by using this object
		
		for(Books booksObj : this.getOurbookslist())  //this.getOurbookslist() means list of books.iam taking books obj reference and sending to new objct
		{
			mybs.getOurbookslist().add(booksObj);
		}
		return mybs;
	}


//change PrototypeMain

package com.durga;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		BookShop mybookshop = new BookShop();
		mybookshop.setBookShopName("Durga");
		mybookshop.addData();
		
		
		
		BookShop mybookshop1 = mybookshop.clone();   
		mybookshop1.setBookShopName("Babu");		
		
		mybookshop.getOurbookslist().remove(3);  //iam removing indexed 3 book
		System.out.println(mybookshop);
		System.out.println(mybookshop1); 
		
		

	}

}

-------------------------------------------------------------------------------------------------------
//without using getters and setters in BooksShop

//BooksShop

package com.durga;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable
{
	List<Books> ourbooks = new ArrayList<>();
	
	@Override
	public String toString() {
		return "BookShop [ourbooks=" + ourbooks + "]";
	}
	
	public void addData()  //this is database method
	{
		for(int i=0;i<5;i++)
		{
			Books bookObj = new Books();
			bookObj.setBookId(i);   //0 1 2 3 4 
			bookObj.setBookname("book"+i);  //book 0 book1 book2 book3 book4
			
			ourbooks.add(bookObj);
		}
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop ourshop = new BookShop();   //new Object
		for(Books book : ourbooks)
		{
			ourshop.ourbooks.add(book);
		}
		
		return ourshop;
		
	}
	
}

//Main
public class Main 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		BookShop mybookshop = new BookShop();
		mybookshop.addData();
		
	
		
		BookShop mybookshop1 = mybookshop.clone();
		
		mybookshop.ourbooks.remove(2);
		
		System.out.println(mybookshop);
		System.out.println(mybookshop1);
		
		
	}
	
}
