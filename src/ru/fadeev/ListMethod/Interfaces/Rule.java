package ru.fadeev.ListMethod.Interfaces;

import java.util.List;

public interface Rule<T> {
	T rule(List<T> list);
}
