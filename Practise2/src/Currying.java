import java.util.function.Function;

public class Currying 
{
	public static void main(String[] args) {
		
		Function<Integer,
		Function<Integer,
		Function<Integer,Integer>>> curryAdd=u->v->w->u+v*w;
		
		System.out.println(curryAdd.apply(2).apply(3).apply(4));
	}

}
