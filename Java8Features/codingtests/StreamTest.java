import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.*;
public class StreamTest {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String s = "Nageswara";
        s.chars()
        	.forEach(c->System.out.print((char)c));
        Method  m = Employee.class.getDeclaredMethod("method1");
        m.setAccessible(true);
        m.invoke(new Employee(), args);

	}
	
}
