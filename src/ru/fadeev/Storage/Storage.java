package ru.fadeev.Storage;

//1.2
public class Storage<T> {

	private final T value;

	public T getValue(T alternative) {
		if (value != null) {
			return value;
		}
		return alternative;
	}

	public Storage(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		if (value != null) {
			return value.getClass() + ": " + value.toString();
		}else{
			return null;
		}
	}
}
