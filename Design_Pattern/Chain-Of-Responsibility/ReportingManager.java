package ApplyLeave;

public class ReportingManager extends LeaveHandler {

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getNumOfDays() <= 14 ) {
			
			if (leave.getTier() <= 2) {
				return "Leave APPROVED By Reporting Manager";
			}
			else {
				return "Leave DENIED By Reporting Manage because Your Tier level 3 ,You can apply only 8 days leave";
			}
			
		}
		
		else {
			return successor.applyLeave(leave);
		}
		

	}
	
}
