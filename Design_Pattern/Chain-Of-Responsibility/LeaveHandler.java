package ApplyLeave;

public abstract class LeaveHandler {

	protected LeaveHandler successor;
	
	public void setSuccessor(LeaveHandler successor) {
		this.successor= successor;
	}
	
	public abstract String applyLeave(Leave leave);
}
