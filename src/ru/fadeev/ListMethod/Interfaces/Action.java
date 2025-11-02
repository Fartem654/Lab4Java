package ru.fadeev.ListMethod.Interfaces;

public interface Action<T,P> {
	P apply(T t);
}
