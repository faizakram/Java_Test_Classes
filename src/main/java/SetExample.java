import java.util.HashSet;
import java.util.Set;

public class SetExample {

	class User {
		private Long id;
		private String name;
		private Long age;

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the age
		 */
		public Long getAge() {
			return age;
		}

		/**
		 * @param age
		 *            the age to set
		 */
		public void setAge(Long age) {
			this.age = age;
		}

	}


	public void test() {
		Set<User> userlist = new HashSet<>();
		for (Long i = 0l; i <= 10l; i++) {
			User user = new User();
			user.setAge(i);
			user.setId(i);
			user.setName("" + i);
			userlist.add(user);
		}
		userlist.forEach(e -> System.out.println(e));
		
	}

	public static void main(String[] k) {
		SetExample setExample = new SetExample();
		setExample.test();
	}

}
