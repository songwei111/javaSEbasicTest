

import java.util.Scanner;

/**

* @ClassName: Inquiry

* @Description:��ѯ��ӹ���ѧ����Ϣ

* @author songwei

* @date 2019��8��11��

*


*/
public class Inquiry {
	// 1����ѯѧ����Ϣ
	public static void inquiryStudentInfo() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+ 1���鿴����ѧ����Ϣ   2������id��ѯѧ����Ϣ   3������id��ѯѧ������   4��������һ��   +");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("��ѡ��˵���");
		byte num = scanner.nextByte();
		switch (num) {
		case 1:// �鿴����ѧ����Ϣ
			for(int i=0;i<Add.students.length;i++) {
				System.out.println(Add.students[i]);
			}
			inquiryStudentInfo();
			break;
		case 2:// ����id��ѯѧ����Ϣ
			System.out.println("������Ҫ��ѯ��id��");
			byte id = scanner.nextByte();
			for(int i=0;i<Add.students.length;i++) {
				if(Add.students[i].id == id) {
					System.out.println("-----------------------------ѧ����Ϣ------------------------------");
					System.out.println("|ѧ��|����|����|�Ա�|�꼶|�绰                |EMALL           |��ַ                 ");
					System.out.println("------------------------------------------------------------------");
					System.out.println("|"+Add.students[i].id+"|"+Add.students[i].name+"|"+Add.students[i].age+"|"+Add.students[i].sex+"|"+Add.students[i].grade+"|"+Add.students[i].telNum+"|"+Add.students[i].address);
					System.out.println("------------------------------------------------------------------");
				}
			}
			inquiryStudentInfo();
			break;
		case 3:// ����id��ѯѧ������
			System.out.println("������Ҫ��ѯ��id��");
			byte id2 = scanner.nextByte();
			for(int i=0;i<Add.students.length;i++) {
				if(Add.students[i].id == id2) {
					System.out.println("��ѧ������Ϊ��"+Add.students[i].name);
				}
			}
			inquiryStudentInfo();
			break;
		case 4:// ������һ��
			Client.welcome();
			break;
		default:// ��������������
			System.out.println("�������ָ����ڣ�");
			break;
		}
	}
}
