
public class OuterClass {//�ⲿ��
	innerClass in=new innerClass();
//
	public void ouf(){
		in.inf();//���ⲿ�෽���е����ڲ��෽��
	}
	class innerClass{//�ڲ���
		innerClass(){//�ڲ��๹�췽��
			
		}
		public void inf(){//�ڲ����Ա����
			
		}
		int y=0;//�����ڲ����Ա����
	}
	public innerClass doit(){//�ⲿ�෽��
		in.y=4;//�ⲿ�಻����ֱ�ӷ����ڲ����Ա����
		//System.out.println(in.y);
		return new innerClass();//�����ڲ�������
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass out=new OuterClass();
		//�ڲ���Ķ���ʵ���������������ⲿ������ⲿ��ķǾ�̬������ʵ��
		OuterClass.innerClass in=out.doit();
		
	}

}
