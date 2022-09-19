package project1;
enum Ordinal{
	sunday,monday,tuesday,wednesday,friday,saturday;
}
public class Enum4 {

	public static void main(String[] args) {
		Ordinal[] s=Ordinal.values();
		for(Ordinal a:s) {
 			System.out.println(a+"--->"+a.ordinal());
		}
	
	}

}
