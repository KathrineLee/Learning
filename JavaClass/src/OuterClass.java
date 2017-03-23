
public class OuterClass {//外部类
	innerClass in=new innerClass();
//
	public void ouf(){
		in.inf();//在外部类方法中调用内部类方法
	}
	class innerClass{//内部类
		innerClass(){//内部类构造方法
			
		}
		public void inf(){//内部类成员方法
			
		}
		int y=0;//定义内部类成员变量
	}
	public innerClass doit(){//外部类方法
		in.y=4;//外部类不可以直接访问内部类成员变量
		//System.out.println(in.y);
		return new innerClass();//返回内部类引用
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass out=new OuterClass();
		//内部类的对象实例化操作必须在外部类或在外部类的非静态方法中实现
		OuterClass.innerClass in=out.doit();
		
	}

}
