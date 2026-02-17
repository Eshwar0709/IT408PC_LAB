import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Bullet{
	String str();
	double dbl();
}

class AnnotationMain{
	@Bullet(str="Camlin",dbl=12.3333)
	public static void anyMethod() throws NoSuchMethodException {
		Method mtd=AnnotationMain.class.getMethod("anyMethod");
		
		Bullet b=mtd.getAnnotation(Bullet.class);
		System.out.println("String: "+b.str());
		System.out.println("Double: "+b.dbl());
	}
	public static void main(String[] args) throws NoSuchMethodException {
		anyMethod();
	}
}
