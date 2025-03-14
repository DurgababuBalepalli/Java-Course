//till now we have talked about jsp.are you going to work entirely on jsp?.No. the problemm is jsp should converted into servlets so time consuming.
//second problem is it is recomended that never write your business logic inside the jsp.so we are using jsp only for view. view means what ever you see in faceboook
//google etc. we have already html and why again jsp? Using html we can only create static pages.but using jsp we can create dynamic pages.
//jsp page has some static content and some dynamic page.for example in facebook settings options,profile options not change for person to person
//that means static content.simply layout is static content.but newfeed of facebook will changed to person to person.that is dynamic page

//see the diagram in notes

//as a client we expect view.simply layout of page from the server.but jsp file should take data. there is cotroller in between client and 
//server.controller will generate data in the format of model object. jsp fills all blank entries with model object's data.
//in java technology controller created by servlets.simply controller is Servlet. view is Jsp.Model is POJO(plain old java object)
//till now this is MVC archtecture.

N-tier Architecture.
here servlet calls service class(it is a general class which performs all operations methods,logics).service class takes help of DAO class(Data Access object)
the best way to interact with database is by using DAO class