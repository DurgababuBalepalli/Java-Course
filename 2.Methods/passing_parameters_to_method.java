class Box
{
	int meth(int height,int width,int breadth)
	{
		return height*width*breadth;
	}
}

class Final
{
	public static void main(String[] args) {

	Box bb = new Box();
	int result = bb.meth(5,3,4);
	System.out.print(result);

	}
}