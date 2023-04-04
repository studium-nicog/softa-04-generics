package ohm.softa.a04;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Function;

public interface SimpleList<T> extends Iterable<T> {
	/**
	 * Add a given object to the back of the list.
	 */
	void add(T item);

	default void addDefault(Class<T> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		add(clazz.getDeclaredConstructor().newInstance());
	}

	/**
	 * @return current size of the list
	 */
	int size();

	/**
	 * Generate a new list using the given filter instance.
	 * @return a new, filtered list
	 */
	default SimpleList<T> filter(SimpleFilter<T> filter) {
		SimpleList<T> result = new SimpleListImpl<>();
		for(T item : this){
			if(filter.include(item)){
				result.add(item);
			}
		}
		return result;
	}

	default <R> SimpleList<R> map(Function<T,R> transform) {
		SimpleList<R> result = new SimpleListImpl<>();

		for (T element : this) {
			var convertedElement = transform.apply(element);
			result.add(convertedElement);
		}

		return result;
	}
}
