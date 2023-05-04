package arrayList;

import java.util.Arrays;

public class CustomArrayList<Student> {

	private static final int INITIAL_CAPACITY = 10;
	 int size = 0;
	private Object data[] = {};

	public CustomArrayList() {
		data = new Object[INITIAL_CAPACITY];
	}

	public void add(Student rollNo) {
		if (size == INITIAL_CAPACITY) {
			increaseCapacity();
		}
		data[size++] = rollNo;
	}

	private void increaseCapacity() {
		int newCapacity = data.length * 2;
		data = Arrays.copyOf(data, newCapacity);
	}

	public Student get(int index) {
		if (index < 0 || index+1> size) {
			throw new IndexOutOfBoundsException("no such index found");
		}
		return (Student) data[index];
	}
	
	public void display() {
		
		System.out.print("[ ");
		for (int i = 0; i < size; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println("]");
	}
	
}
