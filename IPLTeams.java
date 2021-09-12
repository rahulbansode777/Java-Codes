class CSK {

	static int noOfPlayers = 15;
	int noOfFans = 1000000;

	void fanCount() {

		System.out.println("CSK Fancount =" +noOfFans);	
	}	

	static void playerCount() {

		System.out.println("CSK Total players =" +noOfPlayers);
	}

}

class MI {

	static int noOfPlayers = 16;
	int noOfFans = 1050000;

	void fanCount() {

		System.out.println("MI Fancount = " +noOfFans);	
	}	

	static void playerCount() {

		System.out.println("MI Total players =" +noOfPlayers);
	}

}

class IPLTeams {

	public static void main(String[] args) {

		CSK chennai = new CSK();
		chennai.noOfFans = 500000;
		chennai.fanCount();		
		chennai.playerCount();		

		CSK kolkata = new CSK();
		kolkata.noOfFans = 500000 ;
		kolkata.fanCount();		
		kolkata.playerCount();		

		MI mumbai = new MI();
		mumbai.noOfFans = 600000;
		mumbai.fanCount();		
		mumbai.playerCount();		

		MI pune = new MI();
		pune.noOfFans = 450000;
		pune.fanCount();		
		pune.playerCount();		
	}

}