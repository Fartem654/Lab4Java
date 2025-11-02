package ru.fadeev.UserPanel;


import static ru.fadeev.UserPanel.CheckInput.createListIntArray;
import static ru.fadeev.UserPanel.CheckInput.createListListInt;
import static ru.fadeev.UserPanel.CheckInput.inputDouble;
import static ru.fadeev.UserPanel.CheckInput.inputInt;
import static ru.fadeev.UserPanel.CheckInput.inputIntRange;
import static ru.fadeev.UserPanel.CheckInput.inputListInt;
import static ru.fadeev.UserPanel.CheckInput.inputListString;
import static ru.fadeev.UserPanel.CheckInput.inputString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ru.fadeev.ListMethod.ListMethod;
import ru.fadeev.Storage.Storage;
import ru.fadeev.geometry.Line;
import ru.fadeev.geometry.Point.Point;
import ru.fadeev.geometry.Point.Point3D;

public class UserPanel {

	//1.2
	static void intStorage(Storage<Integer> storage, int alternative) {
		System.out.println("Передача хранилища в метод для извлечения значения...");
		int result = storage.getValue(alternative);
		System.out.println("Вывод значения хранилища: " + result);
	}

	static void stringStorage(Storage<String> storage, String alternative) {
		System.out.println("Передача хранилища в метод для извлечения значения...");
		String result = storage.getValue(alternative);
		System.out.println("Вывод значения хранилища: " + result);
	}

	// Задача 1.2
	private void t12() {
		System.out.println("Задание 1.2");

		Integer intValue1 = null;
		System.out.println("Создание хранилища чисел со значением null...");
		Storage<Integer> intStorage1 = new Storage<>(intValue1);
		intStorage(intStorage1, inputInt("Введите альтернативу - целое число: "));

		System.out.println();

		Integer intValue2 = inputInt("Введите любое целое число: ");
		System.out.println("Создание хранилища числа со значением " + intValue2 + " ...");
		Storage<Integer> intStorage2 = new Storage<>(intValue2);
		intStorage(intStorage2, inputInt("Введите альтернативу - целое число: "));

		System.out.println();

		String stringValue1 = null;
		System.out.println("Создание хранилища чисел со значением null...");
		Storage<String> stringStorage1 = new Storage<>(stringValue1);
		stringStorage(stringStorage1, inputString("Введите альтернативу - строка: ", true));

		System.out.println();

		String stringValue2 = inputString("Введите строку: ", false);
		System.out.println("Создание хранилища строки со значением " + stringValue2 + " ...");
		Storage<String> stringStorage2 = new Storage<>(stringValue2);
		stringStorage(stringStorage2, inputString("Введите альтернативу - строка: ", false));
	}

	// Задача 1.5
	private void t15() {
		System.out.println("Задание 1.5");

		System.out.println("Введите точку начала линии в 3-ех мерном пространстве: ");
		Point3D pointStart = new Point3D(inputDouble("Введите x: "), inputDouble("Введите y: "),
				inputDouble("Введите z: "));
		System.out.println("Введите точку конца линии в 3-ех мерном пространстве: ");
		Point3D pointEnd = new Point3D(inputDouble("Введите x: "), inputDouble("Введите y: "),
				inputDouble("Введите z: "));

		Line<Point3D> line3D = new Line<>(pointStart, pointEnd);

		System.out.println(line3D);
	}

	// Задача 2.1
	private void t21() {
		System.out.println("Задание 2.1");

		System.out.println("Введите точку начала линии в 2-ух мерном пространстве: ");
		Point pointStart = new Point(inputDouble("Введите x: "), inputDouble("Введите y: "));
		System.out.println("Введите точку конца линии в 2-ух мерном пространстве: ");
		Point pointEnd = new Point(inputDouble("Введите x: "), inputDouble("Введите y: "));

		Line<Point> line2D = new Line<>(pointStart, pointEnd);

		System.out.println("Исходная " + line2D);
		Line.Sdvg(line2D);
		System.out.println("Та же линия после сдвига на 10 по OX:");
		System.out.println(line2D);
	}

	// Задача 3.1
	private void t31() {
		System.out.println("Задание 3.1");

		List<String> strings = inputListString("Создание списка слов: ");
		List<Integer> integers = inputListInt("Создание списка чисел: ");
		List<int[]> listOfArrOfInt = createListIntArray("Создание списка с массивами целых чисел: ");

		System.out.println();

		System.out.println("1-Формирование списка с числами длин каждого слова:");
		System.out.println("Исходный список: " + strings);
		List<Integer> lenStr = ListMethod.listAction(strings, String::length);
		System.out.println("Список с длиной каждого слова " + lenStr);
		System.out.println();

		System.out.println("2 Формирование списка с абсолютными значениями:");
		System.out.println("Исходный список: " + integers);
		List<Integer> absIntegers = ListMethod.listAction(integers, Math::abs);
		System.out.println("Список абсолютных значений " + absIntegers);
		System.out.println();

		System.out.println(
				"3 Нахождение максимального числа в каждом массиве и составление списка из этих чисел:");
		System.out.print("Исходный список: ");
		for (int[] arr : listOfArrOfInt) {
			System.out.print(Arrays.toString(arr) + " ");
		}
		System.out.println();
		List<Integer> maxOfArr = ListMethod.listAction(listOfArrOfInt, arr -> {
			int max = arr[0];
			for (int i : arr) {
				if (i > max) {
					max = i;
				}
			}
			return max;
		});
		System.out.println("Список максимальных значений: " + maxOfArr);

		System.out.println();
	}

	// Задача 3.2
	private void t32() {
		System.out.println("Задание 3.2");

		List<String> strings = inputListString("Создание списка слов: ");
		List<Integer> integers = inputListInt("Создание списка чисел: ");
		List<int[]> listOfArrOfInt = createListIntArray("Создание списка с массивами целых чисел: ");

		System.out.println();

		System.out.println("1-Отбрасывание строк с числом символов меньше 3:");
		System.out.println("Исходный список: " + strings);
		List<String> filtered = ListMethod.filter(strings, str -> str.length() >= 3);
		System.out.println("Отфильтрованный список " + filtered);
		System.out.println();

		System.out.println("2 Отбрасывание всех отрицательных чисел:");
		System.out.println("Исходный список: " + integers);
		List<Integer> positiveNumbers = ListMethod.filter(integers, value -> value >= 0);
		System.out.println("Отфильтрованный список " + positiveNumbers);
		System.out.println();

		System.out.println("3 Отбрасывание массивов с положительными элементами:");
		System.out.print("Исходный список: ");
		for (int[] arr : listOfArrOfInt) {
			System.out.print(Arrays.toString(arr) + " ");
		}
		System.out.println();

		List<int[]> negativeNumbers = ListMethod.filter(listOfArrOfInt, arr -> {
			for (int value : arr) {
				if (value >= 0) {
					return false;
				}
			}
			return true;
		});
		System.out.print("Список 'отрицательных' массивов: ");
		if (!negativeNumbers.isEmpty()) {
			for (int[] arr : negativeNumbers) {
				System.out.print(Arrays.toString(arr) + " ");
			}
		} else {
			System.out.print("[]");
		}
		System.out.println("\n");
	}

	// Задача 3.3
	private void t33() {
		System.out.println("Задание 3.3");

		List<String> strings = inputListString("Создание списка слов: ");
		System.out.println();
		List<Integer> integers = inputListInt("Создание списка чисел: ");
		System.out.println();
		List<List<Integer>> ListOfListOfInt = createListListInt(
				"Создание списка со списком целых чисел: ");

		System.out.println();

		System.out.println("1 Формирование строки из списка строк: ");
		System.out.println("Исходный список: " + strings);
		String resultStr = ListMethod.reduc(strings, "Ошибка - пусто", list -> {
			String result = "";
			for (String str : list) {
				result += str;
			}
			return result;
		});
		System.out.println("Итоговая строка: " + resultStr);
		System.out.println();

		System.out.println("2 Сложение всех элементов списка: ");
		System.out.println("Исходный список: " + integers);
		int sum = ListMethod.reduc(integers, 0, list -> {
			int result = 0;
			for (int i : list) {
				result += i;
			}
			return result;
		});
		System.out.println("Сумма чисел: " + sum);
		System.out.println();

		System.out.println("3 Подсчет всех элементов в каждом подсписке: ");
		System.out.print("Исходный список: ");
		for (List<Integer> arr : ListOfListOfInt) {
			System.out.print(arr + " ");
		}
		List<Integer> sizeLists = ListMethod.listAction(ListOfListOfInt, arr -> {
			return arr.size();
		});
		System.out.println();
		int sumLists = ListMethod.reduc(sizeLists, -1, arr -> {
			int result = 0;
			for (int i : arr) {
				result += i;
			}
			return result;
		});
		System.out.println("Количество всех элементов в каждом подсписке: " + sumLists);
		System.out.println();
	}

	// Задача 3.4
	private void t34() {
		System.out.println("Задание 3.4");

		List<Integer> integers = inputListInt("Создание списка чисел: ");
		List<String> strings2 = inputListString("Создание списка слов 1: ");
		System.out.println();
		List<String> strings3 = inputListString("Создание списка слов 2: ");

		System.out.println();

		System.out.println("1 Разбиение на подсписки с положительными и отрицательными значениями: ");
		System.out.println("Исходный список: " + integers);
		List<List<Integer>> PosNegLists = ListMethod.collect(integers,
				() -> {
					List<List<Integer>> groups = new ArrayList<>();
					groups.add(new ArrayList<>()); // положительные
					groups.add(new ArrayList<>()); // отрицательные
					return groups;
				},
				(groups, num) -> {
					if (num >= 0) {
						groups.getFirst().add(num);
					} else {
						groups.get(1).add(num);
					}
				}
		);
		System.out.println("Итоговое разбиение: " + PosNegLists);
		System.out.println();

		System.out.println("2 Разбиение на подсписки со строками одинаковой длины: ");
		System.out.println("Исходный список: " + strings2);
		List<List<String>> SortLen = ListMethod.collect(strings2,
				() -> new ArrayList<List<String>>(), // пустой список групп
				(groups, str) -> {
					// ищем существующую группу с такой же длиной
					for (List<String> group : groups) {
						if (!group.isEmpty() && group.getFirst().length() == str.length()) {
							group.add(str);
							return;
						}
					}
					// не нашли — создаём новую группу
					List<String> newGroup = new ArrayList<>();
					newGroup.add(str);
					groups.add(newGroup);
				}
		);
		System.out.println("Разбиение строк на группы по длине: " + SortLen);
		System.out.println();

		System.out.println("3 Вернуть список с неповторяющимися значениями: ");
		System.out.println("Исходный список " + strings3);
		Set<String> setList = ListMethod.collect(strings3, () -> new HashSet<String>(), Set::add);
		System.out.println("Список без повторений: " + setList);

	}


	public void choiceTask() throws CloneNotSupportedException {
		int task = 0;
		System.out.println("Выберите задание: ");
		System.out.println(
				"1 - Задание 1.2\n2 - Задание 1.5\n3 - Задание 2.1\n4 - Задание 3.1\n5 - Задание 3.2\n6 - Задание 3.3\n7 - Задание 3.4");
		task = inputIntRange("Введите номер задачи от 1 до 7: ", 0, 8);

		switch (task) {
			case 1:
				t12();
				break;
			case 2:
				t15();
				break;
			case 3:
				t21();
				break;
			case 4:
				t31();
				break;
			case 5:
				t32();
				break;
			case 6:
				t33();
				break;
			case 7:
				t34();
				break;
		}
	}
}
