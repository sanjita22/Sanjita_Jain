interface Executable{
	void Execute();
}
class runner {
	public static void run(Executable e){
		System.out.println("Exceuting Codes...");
	}
}

public class AppLambda {

	public static void main(String[] args) {
		
		runner.run(() -> System.out.println("Helo there"));

	}

}
