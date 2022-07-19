package ApplyLeave;

public class HR extends LeaveHandler {

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getNumOfDays() <= 21 ) {
			
			if (leave.getTier() <= 1) {
				return "Leave APPROVED By HR";
			}
			else {
				return "Leave DENIED By HR because Your Tier level 2 ,You can apply only 8 days leave";
			}
			
		}
		
		else {
			return successor.applyLeave(leave);
		}
		

	}
}
