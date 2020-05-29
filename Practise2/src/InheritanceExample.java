import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class InheritanceExample extends Persian implements AlienLanguage{
	
	public static void main(String[] args) {
		PhantomReference<T>
		InheritanceExample in = new InheritanceExample();
		in.whatsup();
		
		
	}
	
}
 class Persian {
 
//    protected  void whatsup() {
//        System.out.println("che khabar?");
//    }
}
 
 interface AlienLanguage {
 
    default void whatsup(){
        System.out.println("yada yadda, more yadda yaddda");
    }
}
//public class Bilingual extends Persian implements AlienLanguage {
// 
//    public void converse() {
//        whatsUp();
//    }
// 
//}
