package ApplyLeave;

public class TeamLead  extends LeaveHandler{

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getNumOfDays() <= 4) {
			
			if (leave.getTier() <= 4) {
				return "Leave APPROVED By TeamLead";
			}
			else {
				
				if(leave.getNumOfDays() <= 2) {
					return "Leave APPROVED By TeamLead";
				}
				else {
				return "Leave DENIED By TeamLead because Your Tier level is too low ,You can apply only 2 day leave";
			   }
			}
			
		}
		
		else {
			return successor.applyLeave(leave);
		}
		

	}
	
	

}
