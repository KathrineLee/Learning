/**/
class Outer{//Outer�ⲿ��
	private int x=1;
	public void print(){//Outer���ڵķ���,
		Inner inner=new Inner();//�����ڲ���Inner�Ķ���inner
		inner.display();//����Inner���еķ���
	}
	class Inner{//Outer���ڵ� Inner��Ա��
		private int y=2;
		private void display(){//Inner���ڵķ���
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
