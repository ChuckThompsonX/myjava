package myjava.test;

public class LabelTest {

	public static void main(String[] args) {
		spinOuter: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + " :: " + j);
				if (i == j) {
					continue spinOuter;
				}
			}
		}		
	}
}
/*
0 :: 0
1 :: 0
1 :: 1
2 :: 0
2 :: 1
2 :: 2
*/
