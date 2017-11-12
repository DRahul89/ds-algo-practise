package src.main.java.behavioral.Iterator;

/**
 * 
 * A class for which we will implement the iterator interface
 * 
 */
public class NameRepository implements Container {
	/**
	 * Contains the names array
	 */
	public String names[] = { "Robert", "John", "Julie", "Lora" };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	/**
	 * 
	 * An inner class for implementing the iterator interface for this
	 * NameRepository class
	 * 
	 */
	private class NameIterator implements Iterator {
		/**
		 * Contains the index of next element in name array
		 */
		int index;

		@Override
		public boolean hasNext() {
			Boolean hasNext = Boolean.FALSE;
			if (index < names.length) {
				hasNext = Boolean.TRUE;
			}
			return hasNext;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}
