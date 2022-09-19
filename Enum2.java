package project1;
enum Cost{
	silver,gold,platinum,diomond
}
public class Enum2 {

	public static void main(String[] args) {
  Cost s=Cost.diomond;
  switch(s) {
  case silver:System.out.println("silver");
  break;
  case gold:System.out.println("gold");
  break;
  case platinum:System.out.println("platinum");
  break;
  case diomond:System.out.println("diomond");
  default:System.out.println("too much cost");
  }
	}

}
