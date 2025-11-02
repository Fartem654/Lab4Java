package ru.fadeev.geometry;

import java.util.Objects;
import ru.fadeev.geometry.Point.Point;
import ru.fadeev.geometry.Point.Point3D;

public class Line<T extends Point> implements Cloneable {

	private T start;
	private T end;

	//Constructors
	public Line(T start, T end) { //4.2
		if (start == null || end == null) {
			throw new IllegalArgumentException("Линия не может располагаться на null точках.");
		}
		if (start.getClass() != end.getClass()){
			throw new IllegalArgumentException("Точки линий должны определятся в одном пространстве.");
		}
		this.start = clonePoint(start);
		this.end = clonePoint(end);
	}

	//GET SET

	@SuppressWarnings("unchecked")
	public void setStart(T start) {
		if (start == null){
			throw new IllegalArgumentException("Линия не может располагаться на null точках.");
		}
		if(start.getClass() != this.end.getClass()){
			throw new IllegalArgumentException("Точки линий должны определятся в одном пространстве.");
		}
		if (start instanceof Point3D) {
			this.start = (T) new Point3D((Point3D) start);
		} else {
			this.start = (T) new Point(start);
		}
	}

	public T getStart() {
		return start;
	}

	@SuppressWarnings("unchecked")
	public void setEnd(T end) {
		if (end == null){
			throw new IllegalArgumentException("Линия не может располагаться на null точках.");
		}
		if(end.getClass() != this.start.getClass()){
			throw new IllegalArgumentException("Точки линий должны определятся в одном пространстве.");
		}
		if (end instanceof Point3D) {
			this.end = (T) new Point3D((Point3D) end);
		} else {
			this.end = (T) new Point(end);
		}
	}

	public T getEnd() {
		return end;
	}

	//Methods
//	public int lineLength() {
//		double length = 0;
//		double lenX = end.getX() - start.getX();
//		double lenY = end.getY() - start.getY();
//		length = Math.sqrt(lenX * lenX + lenY * lenY);
//		return (int) Math.round(length);
//	}

	//2.1
	static public void Sdvg(Line<?> line){
		double currentX = line.start.getX();
		if(currentX >= 0){
			line.start.setX(currentX+10);
		}else{
			line.start.setX(currentX-10);
		}
	}

	public int getLength() {
		double length = 0;
		double dx = end.getX() - start.getX();
		double dy = end.getY() - start.getY();
		double dz = 0.0;

		if (start instanceof Point3D && end instanceof Point3D) {
			dz = ((Point3D) end).getZ() - ((Point3D) start).getZ();
		}

		length = Math.sqrt(dx * dx + dy * dy + dz * dz);
		return (int) Math.round(length);
	}

	@Override
	public String toString() {
		return "Линия от " + start.toString() + " до " + end.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Line<?> line = (Line<?>) o;
		return this.start.equals(line.start) && this.end.equals(line.end);
	}

	@Override
	public int hashCode() {
		return Objects.hash(start, end);
	}

	//8.5

	@SuppressWarnings("unchecked")
	private T clonePoint(T point) {
		if (point == null) {
			throw new IllegalArgumentException("Линия не может располагаться на null точках.");
		}
		if (point instanceof Point3D) {
			return (T) new Point3D((Point3D) point);
		} else {
			return (T) new Point(point);
		}
	}

	@Override
	public Line<T> clone() {
		T clonedStart = clonePoint(this.start);
		T clonedEnd = clonePoint(this.end);
		return new Line<>(clonedStart, clonedEnd);
	}
}


