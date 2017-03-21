
public class StackWithExceptions {
	private int[] stack = new int[20];
	private int top = -1;

	public boolean push(int value) throws Exception  {
		if (isFull()) {
				throw new Exception("The stack is Full");
	
		} else {
			top++;
			stack[top] = value;

			return true;
		}
	}

	public int pop() throws Exception{
		if(isEmpty()){
			throw new Exception("The stack is empty");
		} else {
			int temp = stack[top];
			top--;
			return temp;
			
		}
	}
	
	public int peek() throws Exception{
		if(isEmpty()){
			throw new Exception("The stack is empty");
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
