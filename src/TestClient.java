
public class TestClient {
	public static void main(String[] args) {
		GeneralizedQueueLinkedList gqll = new GeneralizedQueueLinkedList();
		gqll.insert(1);
		gqll.insert(2);
		gqll.insert(3);
		gqll.insert(4);
		gqll.insert(5);
		gqll.insert(6);

		gqll.delete(1);

		gqll.print();
		System.out.println("");
		gqll.printTail();

	}
}
