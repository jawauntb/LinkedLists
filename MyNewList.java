public class MyNewList <E> extends NiceSingleLinkedList <E> {
    public static void main (String [] args){
	NiceSingleLinkedList listy = new NiceSingleLinkedList();
	for(int i=0; i<4; i+=1){
	    listy.insert(i,i+2);
	}
	for(int i=0; i<listy.length(); i+=1){
	    System.out.print(listy.get(i));
	}			      
	System.out.println(listy);
	listy.remove(2);
	System.out.println(listy);
	listy.set(1, 4);
	System.out.println(listy);
	listy.get(3);
	int f = listy.length();
	System.out.println(f);
    }
}
