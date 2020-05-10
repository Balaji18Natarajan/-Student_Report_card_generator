
public class StudentReportCard extends Student {
	int total_subjects,points_earned;
	float gpa,cgpa;
	/**
	 * @return the total_subjects
	 */
	public int getTotal_subjects() {
		return total_subjects;
	}
	/**
	 * @param total_subjects the total_subjects to set
	 */
	public void setTotal_subjects(int total_subjects) {
		this.total_subjects = total_subjects;
	}
	/**
	 * @return the points_earned
	 */
	public int getPoints_earned() {
		return points_earned;
	}
	/**
	 * @param points_earned the points_earned to set
	 */
	public void setPoints_earned(int points_earned) {
		this.points_earned = points_earned;
	}
	public StudentReportCard(int SID, String Sname, String DepName, int sem, int sub, int pts) {
		super(SID, Sname, DepName, sem);
		Student st = new Student(SID, Sname, DepName, sem);
		st.display();
		//total_subjects = sub;
		setTotal_subjects(sub);
		//points_earned = pts;
		setPoints_earned(pts);
	}
	public void gpaCalculator() {
		gpa =(float) (getTotal_subjects()*getPoints_earned())/7;
	}
	public void cgpaCalculator(float gpa) {
		cgpa = (gpa/semesterNo);
	}
	void display() {
		gpaCalculator();
		cgpaCalculator(gpa);
		System.out.println("\nTotal No. of Subjects: "+getTotal_subjects()+"\nGPA Computed: "+gpa+"\nCGPA Computed: "+cgpa);
	}
}
