package myjava.inner;

public class OuterClass {

	public int x = 0;
	
	class InnerClass {

        public int x = 1;
        public int y = 10;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("OuterClass.this.x = " + OuterClass.this.x);
        }
    }
}
