/**
 *
 * @author Andreas Pichler
 * @version 12.3.18
 * This is my own stack class with the methods push, pop and peek/top
 *
 */
public class MyStack<a>{

	/**
	 * the list of the elements
	 */
	StackElement<a>[] stackList;
	/**
	 * top element of the stack
	 */
	StackElement<a> top;
	/**
	 * index of the list
	 */
	int index = 0;
	/**
	 * Create a stacklist of the elements
	 * @param size
	 */
	public MyStack(int size){

		stackList =  new StackElement[size];

		this.top = null;
	}

	/**
	 * Add a new element in the list if the list is full return null
	 * @param item
	 * @return StackElement<a> last element was added
	 */
	public StackElement<a> push(a item){
		StackElement<a> el = new StackElement<>(item);
		if(index < stackList.length){
			this.top = el;
			stackList[index] = el;
			index++;
		}
		else{
			return null;
		}
		return el;
	}
	/**
	 * Remove the top element and return it if the list is empty return null
	 * @return top element
	 */
	public StackElement<a> pop(){
		StackElement<a> el = top;
		if(el !=null){
			stackList[index-1] = null;
			index--;
			this.top = stackList[index-1];
		}
		else{
			return null;
		}
		return el;
	}
	/**
	 * return the the top element of the list if the list is empty return null
	 * @return top StackElement<a>
	 */
	public StackElement<a> peek(){
		if(this.top !=null){
			return top;
		}
		return null;
	}

	class StackElement<a>{
		/**
		 * value of the element
		 */
		a value;

		public StackElement(a value){

			this.value=value;
		}

		public a getValue() {
			return value;
		}

		public void setValue(a value) {
			this.value = value;
		}
		/**
		 * @return String
		 */
		public String toString(){
			String string = new String();
			string=String.valueOf(this.value);
			return string;
		}
	}
	/**
	 *
	 * this main tests all methods of the stacklist
	 */
	public static void main(String[] args) {
		MyStack<Integer> newStack = new MyStack<>(5);

		for(int i =0; i<newStack.stackList.length; i++){
			newStack.push(i);
		}
		System.out.println(newStack.peek().toString());

		newStack.pop();



		System.out.println(newStack.peek().toString());

	}

}
