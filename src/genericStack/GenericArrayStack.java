package genericStack;

public class GenericArrayStack<E>{
	
	private Object[] data;
	private int top;
	
	public GenericArrayStack(int size) {
		data = new Object[size];
	}
	
	public void push(E elementToAdd) {
		//Check to see if the top is NOT equal to array length (size), there IS room to add
		if (top !=  data.length) { 
			data[top] = elementToAdd;
			top++;
		}
	}
	
	public E pop() {
		//if top (total number of items) equals 0, if there's no data return 'null'
		if (top == 0)
			return null;
		//There is data to pop
		else
			return (E) data[--top];
	}
	
	public E peek() {
		if (top != 0)
			return (E) data[top];
		else
			return null;
	}	
	
	public boolean isEmpty() {
		if (top > 0) {
			return false;
		}
		else
			return true;
	}
}
