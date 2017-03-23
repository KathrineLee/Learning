/**/
class Outer{//Outer外部类
	private int x=1;
	public void print(){//Outer类内的方法,
		Inner inner=new Inner();//创建内部类Inner的对象inner
		inner.display();//调用Inner类中的方法
	}
	class Inner{//Outer类内的 Inner成员类
		private int y=2;
		private void display(){//Inner类内的方法
			System.out.println("Inner:"+x++);
		}
	}
}
public class NestedClasses {
	public static void main(String[] args){
		Outer outer=new Outer();
		outer.print();
	}
}
