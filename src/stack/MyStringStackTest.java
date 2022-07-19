package stack;

public class MyStringStackTest {
	public static void main(String[] args){
		MyStringStack stack = new MyStringStack();
		stack.push ("s1");
		assertTrue (stack.isEmpty());
	}
}