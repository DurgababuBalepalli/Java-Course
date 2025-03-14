//we can use replace method to remove characters
public class Tk019RemoveCharsFromStr {

	public static void main(String[] args) {
		String myname = "DurgababuDeep";
		String removed = myname.replace("e", "");
		System.out.println(removed);
		
		//removing substring
		String sub = "Du";
		String remov = myname.replace(sub, "");
		System.out.println(remov);
	}

}
