
class StatInst {
	

	static void StatMethod() {			// Created Static Method
	
		System.out.println("In Static Method");
	}

	void InstMethod() {				// Created Instance Method
	
		System.out.println("In Instance Method");
		StatMethod();
	}

	public static void main(String[] args) {	// By-Default a Static Method
	
		StatMethod();				//Direct Call is allowed

		StatInst obj = new StatInst();		// Object creation for calling Instance Method
		obj.InstMethod();			// Call on Object is must

	} 
}
