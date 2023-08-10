package app;

public class User {
           private int stdId ;
           private String stName;
           private String stAddress;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getStdId() {
			return stdId;
		}
		public void setStdId(int stdId) {
			this.stdId = stdId;
		}
		public String getStName() {
			return stName;
		}
		public void setStName(String stName) {
			this.stName = stName;
		}
		public String getStAddress() {
			return stAddress;
		}
		public void setStAddress(String stAddress) {
			this.stAddress = stAddress;
		}
		@Override
		public String toString() {
			return "User [stdId=" + stdId + ", stName=" + stName + ", stAddress=" + stAddress + "]";
		}
	
		
           
}
