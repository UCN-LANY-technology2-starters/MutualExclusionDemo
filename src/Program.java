
public class Program {

	public static void main(String[] args) {

		Bufferable sharedStorage = (Bufferable) new UnsynchronizedBuffer();
		
		Producer producer = new Producer(sharedStorage);
		Consumer consumer = new Consumer(sharedStorage);
		
		producer.start();
		consumer.start();
	}

}
