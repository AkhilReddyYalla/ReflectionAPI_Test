package in.ashokit;

import java.lang.reflect.Field;

public class ReflectionTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		try {
			Class<?> cls = Class.forName("in.ashokit.Welcome");
			Field field = cls.getDeclaredField("message");
			field.setAccessible(true);
			Object object = field.get(new Welcome());
			String result = (String)object;
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
