package ch15;

import java.util.ArrayList;
import java.util.List;

import ch08.sec10.exam01.E;

public class VectorExample {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("apple");
		list.add("바나나");
		list.remove("apple");
		System.out.println(list.get(1));
		list.remove(0);
	}
}

