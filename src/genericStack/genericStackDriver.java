package genericStack;

public class genericStackDriver {

	public static void main(String[] args) {
		
		GenericArrayStack<String> arrayStack = new GenericArrayStack<String>(10);
		
		System.out.println("***Array Stack example:***");
		
		arrayStack.push("One");
		arrayStack.push("Two");
		arrayStack.push("Three");
		arrayStack.pop();
		arrayStack.push("Four");
		arrayStack.push("Five");
		
		System.out.print("\nAfter pushing 5 elements onto the stack and removing 1, is the stack empty: ");
		System.out.println(arrayStack.isEmpty());
		
		System.out.println("\nList of elements in the stack: ");
		// While the stack is not empty, pop elements
		while (!arrayStack.isEmpty()) {
			System.out.println(arrayStack.pop());
		}
		System.out.print("\nAfter popping all elements in the stack, is the stack empty: ");
		System.out.println(arrayStack.isEmpty());
		
		System.out.println(); //SPACE
		
		GenericLinkStack<String> linkedStack = new GenericLinkStack<String>();
		
		System.out.println("***Linked List Stack example:***");
		
		linkedStack.push("Hello");
		linkedStack.push("Bobby");
		linkedStack.push("Twinkle");
		linkedStack.pop();
		linkedStack.push("Flower");
		
		System.out.print("\nAfter pushing 4 elements onto the stack and removing 1, is the stack empty: ");
		System.out.println(linkedStack.isEmpty());
		
		System.out.println("\nList of elements in the stack: ");
		while (!linkedStack.isEmpty() && linkedStack.peek() != null) {
			System.out.println(linkedStack.pop());
		}
		
		System.out.print("\nAfter popping all elements in the stack, is the stack empty: ");
		System.out.println(linkedStack.isEmpty());
		
	}

}
