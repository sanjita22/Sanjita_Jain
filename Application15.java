
public class Application15 {

	public static void main(String[] args) {
		Teacher teach1= new Teacher();
		Student student1 = new Student();
		
		Teacher teach2= student1;
		teach2.Study();
		student1.Subject();
		mathsSub(student1);

	}
	public static void mathsSub(Teacher teach){
		System.out.println("u are studing maths");
	}

}
