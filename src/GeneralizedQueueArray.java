
public class GeneralizedQueueArray<Item> {

	Item[] items;
	int currentPointer = -1;

	GeneralizedQueueArray() {
		items = (Item[]) new Object[100];
	}

	public boolean isEmpty() {
		if (currentPointer == -1) {
			return true;
		} else {
			return false;
		}

	}

	public void insert(Item x) {
		currentPointer++;
		items[currentPointer] = x;
	}

	Item delete(int k) {
		Item returnValue = items[currentPointer];
		items[currentPointer] = null;
		currentPointer--;
		return returnValue;
	}

}
