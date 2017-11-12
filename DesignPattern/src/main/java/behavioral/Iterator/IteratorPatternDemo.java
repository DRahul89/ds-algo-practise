package src.main.java.behavioral.Iterator;

/**
 * 
 * A demo class for iterator pattern
 * 
 */
public class IteratorPatternDemo {

	private static final String NAME_CONS = "Name : ";

	public static void main(String[] args) {
		final NameRepository namesRepository = new NameRepository();
		for (final Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			final String name = (String) iter.next();
			System.out.println(new StringBuilder(NAME_CONS + name));
		}

	}
}
