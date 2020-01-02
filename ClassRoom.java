package room;

public final class ClassRoom {
	private String name;
	private int classId;
	private int noOfSystem;
	private boolean projector;
	private boolean ac;
	private String faculty;
	private boolean availabilty;
	private static int count;
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	static {
		
		count=0;
		System.out.println("Count variable initialised");
	}
	
	public ClassRoom() {
		super();
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getNoOfSystem() {
		return noOfSystem;
	}
	public void setNoOfSystem(int noOfSystem) {
		this.noOfSystem = noOfSystem;
	}
	public boolean isProjector() {
		return projector;
	}
	public void setProjector(boolean projector) {
		this.projector = projector;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public boolean isAvailabilty() {
		return availabilty;
	}
	public void setAvailabilty(boolean availabilty) {
		this.availabilty = availabilty;
	}
	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", classId=" + classId + ", noOfSystem=" + noOfSystem + ", projector="
				+ projector + ", ac=" + ac + ", faculty=" + faculty + ", availabilty=" + availabilty + "]";
	} 

	
	
}
