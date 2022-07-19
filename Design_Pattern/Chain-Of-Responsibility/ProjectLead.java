package ApplyLeave;

public class ProjectLead extends LeaveHandler {

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getNumOfDays() <= 8) {
			
			if (leave.getTier() <= 3) {
				return "Leave APPROVED By Project Lead";
			}
			else {
				return "Leave DENIED By  Project Lead because Your Tier level 4 ,You can apply only 4 days leave";
			}
			
		}
		
		else {
			return successor.applyLeave(leave);
		}
		

	}

}
