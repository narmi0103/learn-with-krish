package ApplyLeave;

public class Application {

	public static void main(String args[]) {
		TeamLead teamlead = new TeamLead();
		ProjectLead projectlead = new ProjectLead();
		ReportingManager reportingmanager = new ReportingManager();
		HR hr = new HR();
		
		teamlead.setSuccessor(projectlead);
		projectlead.setSuccessor(reportingmanager);
		reportingmanager.setSuccessor(hr);
		
		
		Leave leave1 = new Leave ("HalfDay", 1, 4, "Medical Leave");
		System.out.println(teamlead.applyLeave(leave1));
		
		Leave leave2 = new Leave ("Fulltime", 9 , 3, "Personal Reason");
		System.out.println(teamlead.applyLeave(leave2));
		
		
		Leave leave3 = new Leave ("Fulltime", 12, 2, "Travel");
		System.out.println(teamlead.applyLeave(leave3));
		
		
		Leave leave4 = new Leave ("Fulltime", 18, 2, "Personal Reason");
		System.out.println(teamlead.applyLeave(leave4));
		
		
		Leave leave5 = new Leave ("Fulltime", 3, 5, "Sick Leave");
		System.out.println(teamlead.applyLeave(leave5));
		
		Leave leave6 = new Leave ("Fulltime", 2, 5, "Sick Leave");
		System.out.println(teamlead.applyLeave(leave6));
		
	}
	
}
