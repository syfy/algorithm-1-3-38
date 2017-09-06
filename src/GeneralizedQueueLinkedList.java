
public class GeneralizedQueueLinkedList<Item> {
	Node headNode;
	Node tailNode;

	public boolean isEmpty() {
		if (headNode == null && tailNode == null) {
			return true;
		} else {
			return false;
		}

	}

	public void insert(Item x) {
		Node newNode = new Node();
		newNode.setItem(x);
		
		if (headNode == null) {
			headNode = newNode;
		}

		if (tailNode == null) {

			tailNode = newNode;
		}

		if (tailNode != null) {
			// insert at back
			Node oldTailNode = tailNode;
			
			tailNode.next = newNode;
		
			tailNode = newNode;
			tailNode.prev = oldTailNode;
		}

	}

	
	Item delete(int k) {
		Item returnValue;
		Node currentNode = headNode;
		int currentCounter =0;
		while (true) {
			System.out.println(currentNode.prev.getItem().toString());
			if(currentCounter==k){
		
				currentNode.prev.next = currentNode.next;
				currentNode.next.prev = currentNode.prev;
				
				//remove from middle
				/*
				if(currentNode.next !=null){
					
					returnValue = currentNode.getItem();
					currentNode.next = currentNode.next.next;
					
					return returnValue;
				}
				else{
				//	returnValue = currentNode.getItem();
				//	return returnValue;
				}
				*/
					return (Item) currentNode;
			}
			
			
			currentNode = currentNode.next;
			currentCounter++;
			
		}
	
	}
	void print() {
		Node currentNode = headNode;
		while (true) {
			System.out.print(" " + currentNode.getItem());
			if (currentNode == tailNode) {
				break;

			}
			currentNode = currentNode.next;

		}

	}
	
	void printTail() {
		Node currentNode = tailNode;
		while (true) {
			System.out.print(" " + currentNode.getItem());
			if (currentNode == headNode) {
				break;

			}
			currentNode = currentNode.prev;

		}

	}

	public class Node {
		Item item;

		public Item getItem() {
			return item;
		}

		public void setItem(Item item) {
			this.item = item;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		Node next;
		Node prev;

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}
	}

}
