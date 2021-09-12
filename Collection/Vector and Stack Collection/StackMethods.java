import java.util.*;

class StackMethods {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.add("Amazon");		//List Method
		s.addElement("Microsoft");	//Vector Method
		s.push("Tesla");		//Stack Method

		System.out.println(s);

		s.pop();			//removes element and returns

		System.out.println(s);

		System.out.println(s.peek());	//returns element(doesnt remove)

		System.out.println(s);

		System.out.println(s.search("Microsoft"));
		System.out.println(s.search("Amazon"));

		System.out.println(s.indexOf("Microsoft"));
		System.out.println(s.indexOf("Amazon"));
	}
}
