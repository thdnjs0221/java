package chap11.sec02;

public class TempVO {
	private String empNo;
	private String ename;
	private String job;
	private String deptNo;
	//getter setter-> private

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	
	@Override
	public String toString() {
		return empNo+" "+ename+"  "+job+"  "+deptNo;
	}
}
