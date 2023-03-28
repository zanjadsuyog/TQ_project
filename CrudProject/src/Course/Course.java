package Course;

public class Course {

	private int cid;
	private String cname;
	private float fees;

	public Course() {

	}

	public Course(int id, String cname, float fees) {

		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "cid=  " + cid + " cname=" + cname + "  cfees=" + fees;

	}
}
