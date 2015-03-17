public enum eStatus {
	Freshman(0),
	Sophmore(1),
	Junior(2),
	Senior(3);
	
	private final int status;
	
	private eStatus(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return this.status;
	}
}