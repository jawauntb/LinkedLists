// =============================================================================
public class NiceSingleLinkedList <E> implements NiceList <E> {
// =============================================================================



    // =========================================================================
    // DATA MEMBERS

    /**
     * Pointer to the head sentinel link.
     **/
    private SingleHeadSentinel<E> _head;
    private SingleTailSentinel<E> _tail;
    /**
     * The current number of elements in the list.  To be maintained
     * at all times.
     **/
    private int _length;
    // =========================================================================

    // =========================================================================
    public NiceSingleLinkedList () {

	_head = new SingleHeadSentinel<E>();
	_tail = new SingleTailSentinel<E>();
	_head.setNext(_tail);
	_length = 0;
                                          
    }
    // =========================================================================
    /**@throws IndexOutOfBoundsException if <code>index</code> does not refer to
     *                                   a valid position.
     **/
    public NiceSingleLink <E> walkTo (int index){
	try{
	    while (index > _length){
	    } 
	}catch (IndexOutOfBoundsException e){
	    System.out.println("choose a number less than" + _length);
	}
	if (index >= 0){
	    NiceSingleLink <E> curr = this._head;
	    
	    for(int i=0; i<(index-1); i+=1){
		curr = curr.getNext(); 
	    }
	    System.out.println("next link is" + index);
	    return curr;
	} else {
	    throw new IndexOutOfBoundsException();
	}

    }
    // =========================================================================
    /**
     * Reduce the length of the list by one, removing the value at the given
     * index, decreasing the index of all subsequent values by one position.
     *
     * @param index The position from which to remove.
     * @return The value at the given position.
     * @throws IndexOutOfBoundsException if <code>index</code> does not refer to
     *                                   a valid position.
     **/

    // =========================================================================
    public E remove (int index){
	try{
	    while (index < 0 || index > this._length){
	    } 
	}catch (IndexOutOfBoundsException e){
	    System.out.println("choose a number between" + _length + "and 0");
	}
	NiceSingleLink <E> curr = walkTo(index);
	NiceSingleLink <E> moving = curr.getNext();
	NiceSingleLink <E> newNext = moving.getNext();
	curr.setNext(newNext);
	this._length -= 1;
	System.out.println("you removed a value");
	return moving.getValue();
    }


    // =========================================================================
    /**
     * Set an existing position to hold a new value.
     *
     * @param index The position at which to assign a new value.
     * @param value The new value to assign.
     * @throws IndexOutOfBoundsException if <code>index</code> does not refer to
     *                                   a valid position.
     **/
    public void set (int index, E value){
    	try{
	    while (index < 0 || index > this._length){
	    } 
	}catch (IndexOutOfBoundsException e){
	    System.out.println("choose a number between" + _length + "and 0");
	}
	NiceSingleLink <E> nextIsIt = this.walkTo(index);
	NiceSingleLink <E> setThis = nextIsIt.getNext();
	setThis.setValue(value);
    }

    // =========================================================================
    /**
     * Get the value at an existing position.
     *
     * @param index The position from which to retrieve a value.
     * @returns the value at the given position.
     * @throws IndexOutOfBoundsException if <code>index</code> does not refer to
     *                                   a valid position.
     **/
    public E get (int index){
	try{
	    while (index < 0){
	    } 
	}catch (IndexOutOfBoundsException e){
	    System.out.println("choose a number between" + _length + "and 0");
	}
	NiceSingleLink <E> prev = this.walkTo(index);
	NiceSingleLink <E> curr = prev.getNext();
	E theVal = curr.getValue();
	return theVal;
    }
    // =========================================================================
    /** @throws IndexOutOfBoundsException if <code>index</code> does not refer to
     *                                   a valid position.
     **/

    public void insert (int index, E value){
	NiceSingleLink<E> newLink = new NiceSingleLink<E>();
	newLink.setValue(value);
	NiceSingleLink<E> curr = _head;
	try{
	    while (index < 0){
	    } 
	}catch (IndexOutOfBoundsException e){
	    System.out.println("choose a number between" + _length + "and 0");
	}
	if(index == 0){
	    NiceSingleLink<E> temp = curr.getNext();
	    curr.setNext(newLink);
	    newLink.setNext(temp);
	   this._length +=1;
	} else {
	    NiceSingleLink <E> temp = (this.walkTo(index)).getNext();
	    curr = this.walkTo(index);
	    curr.setNext(newLink);
	    newLink.setNext(temp);
	    this._length += 1;
	}
    }

    // =========================================================================
    /**
     * Reverse the order of all elements in the list.
     **/
    public void reverse (){
	NiceSingleLink <E> prev = new SingleTailSentinel<E>();
	NiceSingleLink <E> curr = this._head.getNext();
	while(curr != this._tail){
	    NiceSingleLink <E> next = curr.getNext();
	    curr.setNext(prev);
	    prev = curr;
	    curr = next;
	}
	_head.setNext(prev);
    }
    // =========================================================================
    /**
     * Provide the current length of the list.
     *
     * @returns The current length of the list.
     **/
    public int length (){
	return _length;
    }


    // =============================================================================
} // NiceSingleLinkedList <E>
// =============================================================================
