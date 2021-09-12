
class Parent {

	Parent() {

		System.out.println("Parent Constructor");
	}
}

class Child extends Parent {

	Child() {

		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {

		//Parent p = new Parent();
		//Child c = new Child();

			//OR

		Parent p1 = new Child();	//Parent is reference and Child is Object
		//Trip t = new Trip() {   };	//Similarly left Trip is reference & right Trip is Object in previous Program
	}	
}