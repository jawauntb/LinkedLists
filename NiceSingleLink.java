public class NiceSingleLink <E> {

    private NiceSingleLink<E> _next;
    private E _value;

    public NiceSingleLink () {
	_next = null;
	_value = null;
    }

    public NiceSingleLink<E> getNext () {
	return _next;
    }

    public void setNext (NiceSingleLink<E> next) {
	_next = next;
    }

    public E getValue () {
	return _value;
    }

    public void setValue (E value) {
	_value = value;
    }

}
