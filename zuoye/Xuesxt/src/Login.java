


import java.util.Scanner;

/**

* @ClassName: Login

* @Description: ��¼  �ж��û����������Ƿ���ȷ

* @author songwei

* @date 2019��8��11�� 

*


*/
public class Login {
	// ��¼����
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------��ӭ ��¼ѧ����Ϣ����ϵͳ------------");
		System.out.println("1����¼          2���˳�");
		System.out.println("----------------------------------------------");
		System.out.print("��ѡ��");
		byte num = scanner.nextByte();
		if(num==1) {
			System.out.println("��ӭ��½��");
		}else {
			System.out.println("�ټ���");
			return;
		}
		userNameAndPassword();
		
	}
	// �ж�������û����������Ƿ���ȷ
	public static void userNameAndPassword() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������û�����");
		String userName = scanner.next();
		System.out.print("���������룺");
		String password = scanner.next();
		if(userName.equals("wei") && password.equals("1111")) {
			System.out.println("��½�ɹ���");
			System.out.println("��ӭ����"+userName);
			Client.welcome();
		}else {
			System.out.println("��������û��������벻��ȷ������������");
			userNameAndPassword();
		}
		
	}
}