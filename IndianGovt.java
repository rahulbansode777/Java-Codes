class IndianGovt {

	static String indianApps = "InShorts,LudoKing,Roposo,Mitron,Chingari,AJIO,Utter,.....";
	int chineseApps = 59;

	static void displayIndianApps() {

		System.out.println("List of Indian Apps :" +indianApps);

	}

	void bannedApps() {

		System.out.println("Number Of Banned Apps :" +chineseApps);

	}
}

class Decision {

	public static void main(String[] args) {

		IndianGovt boycott = new IndianGovt();
		boycott.displayIndianApps();
		boycott.bannedApps();

	}

}

