/**
* @author Andreas Pichler
* @version 5.3.18
*
*/
public class MyListMain {

	public static void main(String[] args) {
		MyList<Integer> mList = new MyList<>();
		//Example
		mList.printAll();

		mList.add(1);
		mList.printAll();
		mList.add(2);
		mList.printAll();
		mList.add(52);
		mList.printAll();
		mList.add(100);
		mList.printAll();

		mList.remove(3);
		mList.printAll();
		mList.add(88);
		System.out.println(mList);
		System.out.println("----------------------");
		Element<Integer> get = mList.get(1);
		System.out.println(get.toString(get));
	}
}
/**
* This is a List like a Linked List
* Class with the methods
*/
class MyList<a>{
	/**
	* Element<a> first is the first Element in the list
	*/
	Element<a> first;
	/**
	* Element<a> last is the last Element in the list
	*/
	Element<a> last;

	public MyList() {
		super();
		this.first = null;
		this.last = null;
	}
	/**
	* add a element to the list with the
	* @param val new element
	*/
	public void add(a val){
		Element<a> el = new Element<>(val);
		if(this.first == null){ //if the list is empty element is first
			this.first = el;
			this.last = el;
		}
		else{
			el.setPrev(this.last);			//set prev to this.last --> is the last element of the list
			this.last.setNext(el);
			this.last = el;
		}
	}
	/**
	*	print all elements from the list
	*
	*/
	public void printAll(){
		Element<a> el = this.first;				//<a> generic
		while(el != null){
			System.out.println(el.value);
			el = el.next;
		}
		System.out.println("------------------");
	}
	/**
	*	list the whole list to String
	*	@return String e
	*/
	public String toString(){
		String e= new String();
		Element<a> el= this.first;
		while(el != null){
			e=e+String.valueOf(el.value) + "; ";
			el=el.next;
		}
		return e;
	}
	/**
	*	Remove a element from the list with the index
	* @param index
	*
	*/
	public void remove(int index) {
		int remove=0;
		Element<a> el = this.first;
		while(remove < index) {
			el=el.getNext();
			remove++;
		}
		//if the it is the first element. set null is removed
		if (this.first == el) {
			this.first = el.getNext();
			this.first.setPrev(null);
		}
		else {
			el.getPrev().setNext(el.getNext());
		}
		if (this.last == el) {

			this.last = el.getPrev();
			this.last.setNext(null);
		}
		else {
			el.getNext().setPrev(el.getPrev());
		}
	}
	/**
	* get a element from the list with the index
	* @param index
	*/
	public Element<a> get(int index){
		int count=0;
		Element<a> el = this.first;
		while(count < index) {
			el=el.getNext();
			count++;
		}
		return el;
	}
}
/**
*	Element der Liste <a> beliebiger Datentype
*/
class Element<a>{
	Element<a> next;
	Element<a> prev;
	a value;

	public Element(a value){
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	public Element<a> getNext() {
		return next;
	}
	public void setNext(Element<a> next) {
		this.next = next;
	}
	public Element<a> getPrev() {
		return prev;
	}
	public void setPrev(Element<a> prev) {
		this.prev = prev;
	}
	/**
	* to String the element
	*/
	public String toString(Element<a> el){
		String string = new String();
		string=String.valueOf(el.value);
		return string;
	}
}
