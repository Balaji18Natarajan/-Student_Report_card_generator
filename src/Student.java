
public class Student {
		int studentId;
		int semesterNo;
		String studentName;
		String departmentName;
		
		public Student(int SID, String Sname, String DepName, int sem) {
			//studentId = SID;
			setStudentId(SID);
			//studentName = Sname;
			setStudentName(Sname);
			//departmentName = DepName;
			setDepartmentName(DepName);
			//semesterNo = sem;
			setSemesterNo(sem);
		}

		/**
		 * @return the studentId
		 */
		public int getStudentId() {
			return studentId;
		}
		/**
		 * @param studentId the studentId to set
		 */
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		/**
		 * @return the semesterNo
		 */
		public int getSemesterNo() {
			return semesterNo;
		}
		/**
		 * @param semesterNo the semesterNo to set
		 */
		public void setSemesterNo(int semesterNo) {
			this.semesterNo = semesterNo;
		}
		/**
		 * @return the studentName
		 */
		public String getStudentName() {
			return studentName;
		}
		/**
		 * @param studentName the studentName to set
		 */
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		/**
		 * @return the departmentName
		 */
		public String getDepartmentName() {
			return departmentName;
		}
		/**
		 * @param departmentName the departmentName to set
		 */
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		void display() {
			System.out.println("StudentId: " +getStudentId()+"\nName of the student: "+getStudentName()+"\nDepartment Name:"+getDepartmentName()+"\nSemester Number: "+getSemesterNo());
		}
}
