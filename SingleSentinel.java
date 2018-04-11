public class SingleSentinel <E> extends NiceSingleLink <E> {

    public E getValue () {
	throw new IndexOutOfBoundsException("Cannot get value at sentinel");
    }

    public void setValue (E value) {
	throw new IndexOutOfBoundsException("Cannot set value at sentinel");
    }

}
