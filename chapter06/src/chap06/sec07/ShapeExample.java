package chap06.sec07;
/*����1] ��(Circle),�簢��(Rectangle), �ﰢ��(Triangle) Ŭ������ ����Ŭ����(Shape)�� ��ӹ޾�
	�����ȴ�.
	1)����Ŭ������ ������ ���ϴ� �޼ҵ�(calcArea)�� �����Ѵ�.-  System.out.println("������ ���")�� ����
������ 2)��(Circle)- �Ӽ�: ������
		 �޼ҵ�: ������ ���ϴ� �޼ҵ�(calcArea),pi r��2����
			�ѷ��� ���ϴ� �޼ҵ�(calcCircum)2 pi r(������)

	3) �簢��(Rectangle)-�Ӽ�: ����(width), ����(height)
		 �޼ҵ�: ������ ���ϴ� �޼ҵ�(calcArea)

	3) �ﰢ��(Triangle)-�Ӽ�: �غ�(width), ����(height)
		 �޼ҵ�: ������ ���ϴ� �޼ҵ�(calcArea)�̴�.

����: ���������ϴ� �޼ҵ�
*/
public class ShapeExample {

	public static void main(String[] args) {
		Shape s1=new Circle(15);  //�θ��� Ÿ���� ������ �����Ű�°� - ������
		s1.calcArea();
		
		Shape s2=new Rectangle(20,40);
		s1.calcArea();
		
	}
}


