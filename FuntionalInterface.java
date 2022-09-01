package project1;
interface Animal{
	default void eating() {
		System.out.println("animal eating.....");
	}
}  
interface  Funtional extends Animal{
	abstract void Dog(String name);
}
public class FuntionalInterface implements Funtional {
  public void Dog(String name) {
	  System.out.println("dog sleeping....");
  }
	public static void main(String[] args) {
		FuntionalInterface a=new FuntionalInterface();
		a.Dog("kittu");
		a.eating();
	}

}
