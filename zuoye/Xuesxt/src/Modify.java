

import java.util.Scanner;

/**

* @ClassName: Modify

* @Description: �޸��Ѿ���ӹ���ѧ����Ϣ

* @author songwei

* @date 2019��8��11��

*


*/
public class Modify {

	// 4���޸�ѧ����Ϣ
	public static void modifyStudentInfo() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("1������ID�޸�ѧ��ȫ����Ϣ     2������ID�޸�ѧ��������Ϣ    3�������ϼ�Ŀ¼    4��ϵͳ�˳�");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("��ѡ��");
		byte num = scanner.nextByte();
		switch (num) {
		case 1:// ����ID�޸�ѧ��ȫ����Ϣ
			System.out.println("������Ҫ�޸ĵ�id��");
			byte id1 = scanner.nextByte();
			for(int i=0;i<Add.students.length;i++) {
				if(Add.students[i].id == id1) {
					System.out.println("�������޸ĺ��������");
					String name = scanner.next();
					System.out.println("�������޸ĺ�����䣺");
					byte age = scanner.nextByte();
					System.out.println("�������޸ĺ���Ա�");
					char sex = scanner.next().charAt(0);
					System.out.println("�������޸ĺ���꼶��");
					String grade = scanner.next();
					System.out.println("�������޸ĺ�ĵ绰��");
					long telNum = scanner.nextLong();
					System.out.println("�������޸ĺ�����䣺");
					String mailbox = scanner.next();
					System.out.println("�������޸ĺ��סַ��");
					String address = scanner.next();
					
					Add.students[i].name = name;
					Add.students[i].age = age;
					Add.students[i].sex = sex;
					Add.students[i].grade = grade;
					Add.students[i].telNum = telNum;
					Add.students[i].mailbox = mailbox;
					Add.students[i].address = address;
				}
				else {
					System.out.println("�������id�����ڣ�");
				}
			}
			modifyStudentInfo();
			break;
		case 2:// ����ID�޸�ѧ��������Ϣ  *******����*******
			System.out.println("������Ҫ�޸ĵ�id��");
			byte id = scanner.nextByte();
			for(int j=0;j<Add.students.length;j++) {
				if(Add.students[j].id == id) {
					System.out.println("������Ҫ�޸ĵ����ԣ�");
					String attribute = scanner.next();
					System.out.println("�������޸ĺ�����ݣ�");
					String info = scanner.next();
					
					for(int i=0;i<Add.students.length;i++) {
						if(Add.students[i].id == id) {
							if(attribute.equals("name")) {
								Add.students[i].name = info;
							}
							if(attribute.equals("sex")) {
								Add.students[i].sex = info.charAt(0);
							}
							if(attribute.equals("age")) {
								Add.students[i].age = info.getBytes()[0];
							}
							if(attribute.equals("grade")) {
								Add.students[i].grade = info;
							}
							if(attribute.equals("address")) {
								Add.students[i].address = info;
							}
							if(attribute.equals("telNum")) {
								Add.students[i].telNum = Long.parseLong(info);
							}
							if(attribute.equals("mailbox")) {
								Add.students[i].mailbox = info;
							}
						}
					}
					System.out.println("�޸ĳɹ���");
					modifyStudentInfo();
				}else {
					System.out.println("�������id�����ڣ�");
					modifyStudentInfo();
				}
			}
			break;
		case 3:// ������һ��
			Client.welcome();
			break;
		case 4:// �˳�
			System.out.println("�ټ���");
			System.exit(0);
			break;
		default:// ���벻���ڵ�����
			System.out.println("�������ָ����ڣ�");
			break;
		}	
	}
}