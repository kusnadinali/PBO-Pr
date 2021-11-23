package sampah.com;

public class Main {
	public static void main(String[] args) throws InterruptedException {

	    // mendapatkan thread yang sedang aktif
	    Thread tUtama = Thread.currentThread();
	    Thread t = Thread.currentThread();

	    // menampilkan informasi tentang thread
	    System.out.print("Informasi thread: ");
	    System.out.println(tUtama.toString());

	    for (int i=0; i<5; i++) {
	     System.out.println("Detik ke-" + (i+1));
	     Thread.sleep(100);  // membuat delay selama 1 detik
	     System.out.println(tUtama.getId());
	     System.out.println(t.getName());
	    }
	  }
}
