package main;

public class Main {
	public static void main(String[] args) {
		Session sess = new Session();
		sess.run(150);
		Utils.saveResultsToFile(sess);
	}
}
