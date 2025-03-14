//JDBC - java databse connectivity.conncting java with database is simply called as jdbc
//RDBMS - Relational Databse Management System.mysql,oracle,ibm all these are come under RDBMS
//in order to uuse jdbc you have to use 7steps
1.import the package (java.sql.*)
2.load and register driver (every database has a driver.in order to load the driver you have to use forName method. this method is present in reflection API.forName belongs to a class class.so class.forName("com.mysql.jdbc.Driver"))
3.Establish the connection - in order to establish connection you have to instanciate connection interface.
4.create the statement - statements are 3 types. 1.normal statement 2.prepared statement 3. callable statement
5.Execute the query 
6.process result
7.close 
//think in realtime example.you have called to your friend to know whether results are out or not.first you take mobile(step1).you load your simcard intomobile(step2)
//you will establish connection.you  will prepare your statement like mawa results out or not. then you will ask(step5).your friend will tells you
//whether results came or not.finally you will close

import java.sql.*
main()
{
	class.forName("com.mysql.jdbc.Driver");
	connection mycon = DriverManager.getconnection("url","username","password")     //connection is an interface.so we can't create object of it directly.so DriverManager class implenting that connection inteface.getconnection is a static method in drivermanger
	statement myst =  con.createStatement()   //again staement is also an interface
	resultSet myrs = myst.executeQuery("select *from student")     //you have to execute query.inside you have to specify database query.whenever you execute query you will get table.inorder to hold the table you have an interface Resultset
	myrs.next();  //it moves our pointer to next line.assume you have student id and studentname.whenever you say myrs.next your pointer will moves to first record of student table 
	myrs.getInt(1) + "  " + myrs.getString(2)    //2 means 2 column data.

	myst.close();
	mycon.close();
}