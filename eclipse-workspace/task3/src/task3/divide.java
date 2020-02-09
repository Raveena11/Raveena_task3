package task3;

public class divide implements inter {
	public int op(int x, int y){
		int div = 0;
		if(y == 0)
			System.out .println("Division cannot be performed ");
		else
        div = x/y;
        return div;
    }
}
