public class SingleTailSentinel <E> extends SingleSentinel <E> {

    public NiceSingleLink<E> getNext () {
	throw new IndexOutOfBoundsException("Cannot get next of tail");
    }

    public void setNext (NiceSingleLink<E> next) {
	throw new IndexOutOfBoundsException("Cannot set next of tail");
    }

}
