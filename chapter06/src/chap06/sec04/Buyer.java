package chap06.sec04;
/*����] ���忡�� �ǸŵǴ� ��ǰ�� computer, audio, notepad�̰� 
	���� ������ 1000��, 300��, 600���̴�
	�̵��� ������ �����ϴ� �޼ҵ�(saleGoods)�� �ۼ��Ͻÿ�.

         Ŭ������ goods               �Ǹ��� Ŭ����, ��ǰ Ŭ����
         ��üȭ 3��
         �׾ȿ� kind,���� 
�ǸŶ�� �޼ҵ� ȣ���Ҷ� ��ǰ�� ��ü�� ������ ������.
*/

public class Buyer {
	
	
	public int saleGoods(Goods goods,int amt) {      //��ǰ, ����
		return goods.getPrice()*amt;
	
	}

}
