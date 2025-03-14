class String_class
{
	public static void main(String[] args) {
		String st = "Durgababu";
		System.out.println(st.charAt(1));
		System.out.println(st.length());
		System.out.println(st.endsWith("bu"));
		System.out.println(st.replace('D','d'));   //iam replacing D with d

		System.out.println("----------------------------------------");
		String s1 = "helloeveryone";        //variable type string
		String s2 = new String("HelloEveryone");  //object type string or you can say string obeject.
		String s21 = new String("hello");  //another string obect
		System.out.println(s1.compareToIgnoreCase(s2));    //while comparing s2 we are ignoring capital H,E.thats why i have written Ignorecase
		System.out.println(s1.compareTo(s2));             //if arument value is grater than comparision value then it gives +ve number(any positive random nuber)
		System.out.println(s2.compareTo(s21));            //if argument value is lessthan comparision value then it gives -ve number(any random -ve number )

		System.out.println("-------------------------------------------");  
		String s3 = "Durga";
		String s4 = "Durga";
		System.out.println(s3.contentEquals(s4));

		System.out.println("--------------------------------------------");  //string concatination
		String s5 = "hi";
		System.out.println(s5.concat("Hero"));

		System.out.println("----------------------------------------------"); //copying array character elements to string
		char[] array = {'r','g','u','k','t'};
		String s6 = "";
		System.out.println(s6.copyValueOf(array));
		System.out.println(s6.copyValueOf(array,1,3));   //it print letters indexed from 1 to 3 letters.beacuse string is sequence of characters

		System.out.println("-----------------------------------------------"); //to know substring index in main string
		String str = new String("welcome java world");
		String substr = new String("java");
		System.out.println(str.indexOf(substr));

		System.out.println("----------------------------------------------"); //string has own println that is format.this will helpful and you can get better conrol over string
		float f = 10.23f;
		int i = 20;
		String name = "dare";
		String ss = String.format("float value : %f,int value is : %d,string value : %s",f,i,name);
		System.out.println(ss);
	}
}