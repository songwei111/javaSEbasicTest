

import java.util.Scanner;

/**

* @ClassName: Modify

* @Description: 修改已经添加过的学生信息

* @author songwei

* @date 2019年8月11日

*


*/
public class Modify {

	// 4、修改学生信息
	public static void modifyStudentInfo() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("1、根据ID修改学生全部信息     2、根据ID修改学生部分信息    3、返回上级目录    4、系统退出");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("请选择：");
		byte num = scanner.nextByte();
		switch (num) {
		case 1:// 根据ID修改学生全部信息
			System.out.println("请输入要修改的id：");
			byte id1 = scanner.nextByte();
			for(int i=0;i<Add.students.length;i++) {
				if(Add.students[i].id == id1) {
					System.out.println("请输入修改后的姓名：");
					String name = scanner.next();
					System.out.println("请输入修改后的年龄：");
					byte age = scanner.nextByte();
					System.out.println("请输入修改后的性别：");
					char sex = scanner.next().charAt(0);
					System.out.println("请输入修改后的年级：");
					String grade = scanner.next();
					System.out.println("请输入修改后的电话：");
					long telNum = scanner.nextLong();
					System.out.println("请输入修改后的邮箱：");
					String mailbox = scanner.next();
					System.out.println("请输入修改后的住址：");
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
					System.out.println("你输入的id不存在！");
				}
			}
			modifyStudentInfo();
			break;
		case 2:// 根据ID修改学生部分信息  *******错误*******
			System.out.println("请输入要修改的id：");
			byte id = scanner.nextByte();
			for(int j=0;j<Add.students.length;j++) {
				if(Add.students[j].id == id) {
					System.out.println("请输入要修改的属性：");
					String attribute = scanner.next();
					System.out.println("请输入修改后的数据：");
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
					System.out.println("修改成功！");
					modifyStudentInfo();
				}else {
					System.out.println("你输入的id不存在！");
					modifyStudentInfo();
				}
			}
			break;
		case 3:// 返回上一级
			Client.welcome();
			break;
		case 4:// 退出
			System.out.println("再见！");
			System.exit(0);
			break;
		default:// 输入不存在的命令
			System.out.println("你输入的指令不存在！");
			break;
		}	
	}
}