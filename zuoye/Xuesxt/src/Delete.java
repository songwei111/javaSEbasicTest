

import java.util.Arrays;
import java.util.Scanner;

public class Delete {

	public static void deleteStudentInfo() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������ɾ����ѧ����Ϣ��id��");
		byte id = scanner.nextByte();
		for(int i=0;i<Add.students.length;i++) {
			if(Add.students[i].id == id) {
				Add.students[i] = Add.students[Add.students.length-1];
				Add.students = Arrays.copyOf(Add.students, Add.students.length-1);
			}
		}
		System.out.println("ɾ���ɹ���");
		Client.welcome();
	}
}

