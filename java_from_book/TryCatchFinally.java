//program using try,catch,finally
class Durga{
	public static void main(String[] args) {
		try{

		try{
			int a[] = new int[5];
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bb");
		} 
	    }
		catch(Exception e){
			System.out.println("no any Exception");
			System.out.println(e);
		}
		finally{
			System.out.println("normallyexecuted");
		}

		
	}
}