package ru.fadeev.geometry.Point;

import java.util.Objects;

public class Point {

	private double x;
	private double y;

	public Point(double x, double y) {
		setX(x);
		setY(y);
	}

	public Point() {
		setX(0);
		setY(0);
	}

	public Point(Point point) {
		setX(point.x);
		setY(point.y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "{" + x + ";" + y + "}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Point point = (Point) o;
		return Double.compare(x, point.x) == 0 && // Double.compare - для точно сравнения чисел с плавающей запятой, возвращает 0 когда числа равны
				   Double.compare(y, point.y) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x,y);
	}
}
