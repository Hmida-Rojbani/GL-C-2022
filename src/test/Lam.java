package test;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lam {

	public static void print(List<Integer> list, Cond condition) {
		for (Integer i : list) {
			if (condition.test(i)) {
				System.out.print(i + " | ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		java.util.Date d;
//		String s="f";
//		System.out.println(s.getClass().getSimpleName());
	List<Integer> list = java.util.Arrays.asList(2, 3, 1, 4, 2, 5, 4, 7, 5, 8, 9, 6);
//		print(list, new EvenCond());
//		print(list, new Cond() {
//
//			@Override
//			public boolean test(Integer i) {
//				return i % 2 != 0;
//			}
//		});
//
//		print(list, (Integer i) -> {
//				return i % 2 != 0;
//			}
//		);
//		
//		Cond c =  i ->  i % 2 != 0;
//	
//		print(list, i ->  i % 2 != 0);
//		
//		Function<String, Integer> fun = (String ss)-> {return ss.length();};
//		Function<String, Integer> fun1 =  ss->  ss.length();
//		Function<String, Integer> fun2 =  String::length;
//		
//		Consumer<String> con = ss -> System.out.println(ss);
//		
//		Supplier<Integer> supp = () -> new Random().nextInt();
//		
//		System.out.println(supp.get());
//		
//		Predicate<Integer> pre = i -> i > 0;
//		
//		System.out.println(pre.test(-4));
//		
//		UnaryOperator<String> ua = ss -> ss.toUpperCase();
//		
//		System.out.println(fun.apply("hello"));
		
		Map<Integer, Long> map =list.stream()
		.filter(i-> i% 2 == 0)
		.collect(Collectors.groupingBy(i-> i,Collectors.counting()));
		
		System.out.println(map);
		
	}

}
@FunctionalInterface
interface Cond {
	boolean test(Integer i);
}

class EvenCond implements Cond {

	@Override
	public boolean test(Integer i) {
		return i % 2 == 0;
	}

}

class EvenOdd implements Cond {

	@Override
	public boolean test(Integer i) {
		return i % 2 != 0;
	}

}
