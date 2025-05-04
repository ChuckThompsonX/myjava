package myjava.generics.wildcardvstype;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TestGen {

	public static void main(String... args) {

		// this example should clarify the differences between wild card ? and type T

		List<Animal> animalList = List.of(new Animal("Cat", "Basil"));
		Collection<Animal> animals = createNewList(animalList);
		animals.stream().forEach((a) -> System.out.println(a.getType()));

		List<Integer> ints = List.of(3);
		List<Double> doubles = List.of(3.14);
		List<String> strings = List.of("hi");

		printAnyList(ints);
		printAnyList(doubles);
		printAnyList(strings);
		printTheList(ints);
		printTheList(doubles);
		printTheList(strings);

		printNumbers(ints);
		printNumbers(doubles);
	}

	private static <T extends Animal> Collection<T> createNewList(List<T> toAdd) {
		List<T> list = new LinkedList<>();
		list.add(toAdd.getFirst());
		return list;
	}

	// use ? when you don't know what that generic type is going to be
	private static void printAnyList(List<?> list) {
		Object obj = list.getFirst();
		System.out.println(obj.getClass().getTypeName());
	}

	// use type T when you are actively working with the type or when you have a return of the type
	private static <T> void printTheList(List<T> list) {
		T t = list.getFirst();
		System.out.println(t.getClass().getTypeName());
	}

	private static void printNumbers(List<? extends Number> list) {
		for (Number num : list) {
			System.out.println(num.doubleValue());
		}
	}
}
