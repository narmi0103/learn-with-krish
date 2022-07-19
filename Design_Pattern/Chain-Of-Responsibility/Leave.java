package ApplyLeave;

public class Leave {
 private String typeOfLeave;
 private int numOfDays;
 private int tier;
 private String  reason;
 
 public Leave(String typeOfLeave, int numOfDays, int tier, String reason) {
	 this.typeOfLeave = typeOfLeave;
	 this.numOfDays= numOfDays;
	 this.tier=tier;
	 this.reason =reason;
 }


public String getTypeOfLeave() {
	return typeOfLeave;
}

public int getNumOfDays() {
	return numOfDays;
}


public int getTier() {
	return tier;
}

public String getReason() {
	return reason;
}

  
}
