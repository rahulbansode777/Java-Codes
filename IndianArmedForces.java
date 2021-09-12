class IndianArmy {

	static int noOfSoldiers = 1400000;
	int missionCount = 1000;

	void displayMission() {

		System.out.println("IndianArmy Mission Count = " + missionCount);	
	}	

	static void soldierInfo() {

		System.out.println("IndianArmy Total Count = " + noOfSoldiers);
	}

}

class IndianNavy {

	static int noOfSoldiers = 700000;
	int missionCount = 500;

	void displayMission() {

		System.out.println("IndianNavy Mission Count = " + missionCount);	
	}	

	static void soldierInfo() {

		System.out.println("IndianNavy Total Count = " + noOfSoldiers);
	}

}

class IndianAirForce {

	static int noOfSoldiers = 500000;
	int missionCount = 700;

	void displayMission() {

		System.out.println("IndianAirForce Missioin Count = " + missionCount);	
	}	

	static void soldierInfo() {

		System.out.println("IndianAirForce Total Count = " + noOfSoldiers);
	}

}

class IndianArmedForces {

	public static void main(String[] args) {

		IndianArmy maharashtra = new IndianArmy();
		maharashtra.missionCount = 200;

		maharashtra.soldierInfo();				
		maharashtra.displayMission();			

		IndianArmy punjab = new IndianArmy();
		punjab.missionCount = 100;

		punjab.soldierInfo();			
		punjab.displayMission();		

		IndianNavy kerala = new IndianNavy();
		kerala.missionCount = 150;

		kerala.soldierInfo();			
		kerala.displayMission();		

		IndianNavy gujarat = new IndianNavy();
		gujarat.missionCount = 50;

		gujarat.soldierInfo();			
		gujarat.displayMission();	

		IndianAirForce jharkhand = new IndianAirForce();
		jharkhand.missionCount = 125;

		jharkhand.soldierInfo();				
		jharkhand.displayMission();			

		IndianAirForce rajasthan = new IndianAirForce();
		rajasthan.missionCount = 75;

		rajasthan.soldierInfo();			
		rajasthan.displayMission();		
	
	}

}