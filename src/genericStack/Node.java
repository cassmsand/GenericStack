package genericStack;

public class Node<E> {
	
	//instance variables
	private E data;
	private Node<E> link;
	
	//constructor
	public Node(E elementToAdd, Node<E> objectBehind) {
		data = elementToAdd;
		link = objectBehind;
	}

	//Getters and Setters
	public E getData() {
		return data;
	}

	public Node<E> getLink() {
		return link;
	}

	public void setData(E data) {
		this.data = data;
	}

	public void setLink(Node<E> link) {
		this.link = link;
	}
}
