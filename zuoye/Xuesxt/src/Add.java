

import java.util.Arrays;
import java.util.Scanner;

/**

* @ClassName: Add

* @Description: ����µ�ѧ����Ϣ

* @author songwei

* @date 2019��8��11��

*


*/
public class Add {
	
	static Student[] students = {};
	
	// 2�����ѧ����Ϣ
	public static void addStudentInfo() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ��id��");
		byte id = scanner.nextByte();
		if(students.length != 0) {
			for(int i=0;i<students.length;i++) {
				if(students[i].id == id) {
					System.out.println("��id" + id + "���ڣ����������룡");
					addStudentInfo();
				}
			}
		}
		System.out.println("������ѧ��������");
		String name = scanner.next();
		System.out.println("������ѧ���Ա�");
		char sex = scanner.next().charAt(0);
		System.out.println("������ѧ�����䣺��1~120��");
		byte age = scanner.nextByte();
		System.out.println("������ѧ�������꼶�����������м����߼���");
		String grade = scanner.next();
		System.out.println("������ѧ����ַ��");
		String address = scanner.next();
		System.out.println("������ѧ����ϵ��ʽ��11λ�ֻ����룩��");
		long telNum = scanner.nextLong();
		System.out.println("������ѧ���������䣨����@��.com����");
		String mailbox = scanner.next();
		// ����ѧ��
		Student student = new Student();
		student.id = id;
		student.name = name;
		student.sex = sex;
		student.age = age;
		student.grade = grade;
		student.address = address;
		student.telNum = telNum;
		student.mailbox = mailbox;
		// ѧ�����鳤�ȼ�һ
		students = Arrays.copyOf(students, students.length+1);
		students[students.length-1] = student;
		
		if(students != null) {
			System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϼ�Ŀ¼��");
		}
		Client.welcome();
	}
		
}