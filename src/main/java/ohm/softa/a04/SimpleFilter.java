package ohm.softa.a04;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
@FunctionalInterface
public interface SimpleFilter<T> {
	/**
	 * @param item Object to evaluate
	 * @return true if the referenced object should be included.
	 */
	boolean include(T item);
}
