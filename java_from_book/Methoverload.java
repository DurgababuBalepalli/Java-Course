class MethOverload{
		public void at(int a){
        System.out.println(a);
		}
		public void at(float a){
			System.out.println(a);
		}
}
class Overload{
	public static void main(String[] args) {
		MethOverload obj = new MethOverload();
		obj.at(5);
	}
}
