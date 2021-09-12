class StateCapital {

	String state;
	String capital;

	StateCapital(String state,String capital) {

		this.state = state;
		this.capital = capital;
	}
}

class UserObjectArray {

	public static void main(String[] args) {

		StateCapital obj1 = new StateCapital("Maharashtra","Mumbai");
		StateCapital obj2 = new StateCapital("Goa","Panji");
		StateCapital obj3 = new StateCapital("Bihar","Patna");
		StateCapital obj4 = new StateCapital("Jharkhand","Ranchi");
		StateCapital obj5 = new StateCapital("Karnatak","Bangalore");

		StateCapital sc[] = new StateCapital[] {obj1,obj2,obj3,obj4,obj5};

		for(int i = 0; i < sc.length; i++) {

			System.out.print(sc[i].state);
			System.out.println(" : " + sc[i].capital);
		}		
	}
}