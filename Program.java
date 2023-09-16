import java.lang.Thread;

class Program {
  public static void main(String[] args) {
	int i = 0;
	System.out.println("Starting!");
	try {
		while (i < 100) {
			System.out.println("Hello " + i);
			i++;
			Thread.sleep(1000);
		}
	} catch (InterruptedException e) { System.out.println(e); }
	System.out.println("Done!");
   }
}
