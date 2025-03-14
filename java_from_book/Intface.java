interface Bank{
	public int all();
}
class Sbi implements Bank{
    public int all(){
    	return 20;
    }
}
class Yoyo implements Bank{
	public int all(){
		return 30;
	}
}
class Intf {
	public static void main(String[] args) {
		Bank obj = new Sbi();
		System.out.println(obj.all());
	}
}
