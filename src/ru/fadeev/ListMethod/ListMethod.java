package ru.fadeev.ListMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import ru.fadeev.ListMethod.Interfaces.Action;
import ru.fadeev.ListMethod.Interfaces.Rule;
import ru.fadeev.ListMethod.Interfaces.Test;

public class ListMethod {

	static public <T, P> List<P> listAction(List<T> list, Action<T, P> action) { //Function<T, P>
		List<P> result = new ArrayList<>();
		for (T t : list) {
			result.add(action.apply(t));
		}
		return result;
	}

	static public <T> List<T> filter(List<T> list, Test<T> condition) { //Predicate<T>
		List<T> result = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (condition.test(list.get(i))) {
				result.add(list.get(i));
			}
		}
		return result;
	}

	static public <T> T reduc(List<T> list, T alternative, Rule<T> rule) { //BinaryOperator<T>
		if (list.isEmpty()) {
			return alternative;
		}
		T result = rule.rule(list);
		if (result == null) {
			return alternative;
		}
		return result;
	}

	static public <T, P> P collect(List<T> list, Supplier<P> creatingMethod,
			BiConsumer<P, T> addMethod) {
		P result = creatingMethod.get();
		for (T item : list) {
			addMethod.accept(result, item);
		}
		return result;
	}

}
