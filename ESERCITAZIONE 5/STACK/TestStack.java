public class TestStack{
	public static void main(String args[]){
		Stack s1 = new Stack();
		Stack s2 = new Stack();

		s1.push("uno");
		s1.push("due");
		s1.push("tre");
		s1.push("quattro");

		System.out.println(s1);

		System.out.println("Estraggo " + s1.pop());
		System.out.println(s1);

	}
}
