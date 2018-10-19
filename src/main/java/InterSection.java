import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterSection {
	class User{
		private Long id;
		private String name;
		public User() {
		}
		
		public User(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}
		/**
		 * @param id the id to set
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
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		
	}
	public static void main(String[] k) {
		List<Long> list1 = new ArrayList<>();
		list1.add(1l);
		list1.add(5l);
		List<Long> list2 = new ArrayList<>();
		list2.add(1l);
		list2.add(2l);
		list2.add(3l);
		List<Long> intersect = list2.stream()
                .filter(list1::contains)
                .collect(Collectors.toList());
		System.out.println(intersect);
		
		System.out.println(list1.stream().flatMap(x -> list2 .stream().filter(y -> !x.equals(y)))
	        .collect(Collectors.toList()));
	}

}
