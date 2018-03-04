/**
* @author Andreas Pichler
*
*	Dies ist eine Klasse einer Liste mit Index
*/
public class MyListMain {

	public static void main(String[] args) {
		MyList<String> mList = new MyList<>();
		//Bsp
		mList.printAll();

		mList.add("Sepp");
		mList.printAll();
		mList.add("Anton");
		mList.printAll();
		mList.add("Josef");
		mList.printAll();
		mList.add("Andi");
		mList.printAll();

		mList.remove(3);
		mList.printAll();
		mList.add("Kevin");
		System.out.println(mList);
		System.out.println("----------------------");
		Element<String> get = mList.get(1);
		System.out.println(get.toString(get));

	}

}
/**
* Listen Klasse mit Mehoden
* @param Elemet<a> first
* @param Elemet<a> last
*
*
*/
class MyList<a>{

	Element<a> first;
	Element<a> last;

	public MyList() {
		super();
		this.first = null;
		this.last = null;
	}

	public void add(a val){
		Element<a> el = new Element<>(val);
		if(this.first == null){
			this.first = el;
			this.last = el;
		}
		else{
			el.setPrev(this.last);			//setzte das prev auf this.last --> wird in Zeile 40 dann neu auf das letzte gesetzt
			this.last.setNext(el);    		//das letzte last zeigt auf das next mit der neuen Variable
			this.last = el;
		}
	}
	/**
	*	Listet alle Elemente der Liste
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
	*	Gibt die Gsamte Liste in einem String aus.
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
	*	Löscht Element mit dem gegebenen Parameter a
	* @param int a
	*
	*/
	public void remove(int a) {
		int remove=0;
		Element<a> el = this.first;
		while(remove < a) {
			el=el.getNext();
			remove++;
		}
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
*
*	Element der Liste <a> beliebiger Datentype
*
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
	public String toString(Element<a> el){
		String string = new String();
		string=String.valueOf(el.value);
		return string;
	}
}
