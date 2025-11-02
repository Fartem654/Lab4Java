package ru.fadeev.geometry.Point;

import java.util.Objects;

public class Point3D extends Point {

	private double z;

	public Point3D() {
		super();
		setZ(0);
	}

	public Point3D(double x, double y, double z) {
		super(x, y);
		setZ(z);
	}

	public Point3D(Point3D point) {
		super(point);
		setZ(point.getZ());
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return '{' + Double.toString(super.getX()) + ';' + Double.toString(super.getY()) + ';' + z
				+ '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if(!super.equals(o)){// Вызываем equals из родительского класса Point, где проверяем o на null и что объекты одинаковых классов и что x y одинаковы
			return false;
		}
		Point3D point = (Point3D) o;
		return Double.compare(z, point.z) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), z);
	}
}
