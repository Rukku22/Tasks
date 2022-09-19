package project1;
 enum Books{
	 civils(150),eng(300),maths(450),phy;
	 int price;
	 Books(int price){
		 this.price=price;
		 System.out.println("ctt");}
		 Books(){
			this.price=130;
		 }
		 public int getPrice() {
			 return price;
		 }
	 }
 
 public class Enum3 {

	public static void main(String[] args) {
		 Books[] b=Books.values();
		 for(Books b1:b) {
			 System.out.println(b1+"-->"+b1.getPrice());
		 }
	}}

	 


