

import java.util.Scanner;

/**

* @ClassName: Client

* @Description: ��¼��ѡ����Ҫ���Ĳ���

* @author songwei
* @date 2019��8��11��

*


*/
public class Client {

	public static void main(String[] args) {
		welcome();
	}
	// ������
	public static void welcome() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("*********************** ��ѡ��Ҫ��������Ϣ��Ӧ���� *********************");
		System.out.println("*1���鿴ѧ����Ϣ   2�����ѧ����Ϣ   3��ɾ��ѧ����Ϣ   4���޸�ѧ����Ϣ   5���˳� *");
		System.out.println("*********************************************************************");
		System.out.println("��ѡ��");
		byte num = scanner.nextByte();
		switch (num) {
		case 1:// ���ò�ѯ����
			Inquiry.inquiryStudentInfo();
			break;
		case 2:// ������ӷ���
			System.out.println("*************************���ѧ����Ϣ*************************");
			Add.addStudentInfo();
			break;
		case 3:// ����ɾ������
			Delete.deleteStudentInfo();	
			break;
		case 4:// �����޸ķ���
			Modify.modifyStudentInfo();		
			break;
		case 5:// �˳�
			System.out.println("�ټ���");
			System.exit(0);			
			break;
		default:// �����˲����ڵ�ָ��
			System.out.println("�����������������룡");
			welcome();
			break;
		}
	}
	
}