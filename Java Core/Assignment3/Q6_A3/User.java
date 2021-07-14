package Capg;
import java.util.Objects;
	public class User {
		private String Username;
		private String pass;
		public 	User(String name, String pass) {
			super();
			this.Username = name;
			this.pass = pass;
		}
		@Override
		public int hashCode() {
			return Objects.hash(Username);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(Username, other.Username);
		}
		@Override
		public String toString() {
			return "" + Username;
		}


}
