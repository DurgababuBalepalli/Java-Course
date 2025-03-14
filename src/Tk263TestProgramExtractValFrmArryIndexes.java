
public class Tk263TestProgramExtractValFrmArryIndexes {

	public static void main(String[] args) {
		int[] myarray = {1,2,3,4,5,6};
		int j = myarray.length-1;  //6
		
		
		for(int i=0;i<myarray.length/2;i++)
		{
			System.out.println(myarray[i]+" ");
			System.out.println(myarray[j--]);
		}
		
	}

}
