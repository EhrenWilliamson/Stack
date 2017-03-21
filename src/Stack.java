
public class Stack {
	private Integer[] stack = new Integer[20];
	private int top = -1;

	public boolean push(Integer value) {
		if (isFull()) {
			return false;
		} else {
			top++;
			stack[top] = value;

			return true;
		}
	}

	public Integer pop(){
		if(isEmpty()){
			return null;
		} else {
			Integer temp = stack[top];
			top--;
			return temp;
			
		}
	}
	
	public Integer peek(){
		if(isEmpty()){
		return null;
		} else {
	
		return stack[top];
		}
	}
	
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}

		return false;
	}

	public boolean isFull() {
		if (top == (stack.length - 1)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Stack myStack = new Stack();
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.isFull());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		myStack.push(19);
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.isFull());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.isFull());
		System.out.println(myStack.peek());
		
	}

}
