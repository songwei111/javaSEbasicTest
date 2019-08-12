

import java.util.Scanner;

/**

* @ClassName: Inquiry

* @Description:查询添加过的学生信息

* @author songwei

* @date 2019年8月11日

*


*/
public class Inquiry {
	// 1、查询学生信息
	public static void inquiryStudentInfo() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+ 1、查看所有学生信息   2、根据id查询学生信息   3、根据id查询学生姓名   4、返回上一层   +");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("请选择菜单：");
		byte num = scanner.nextByte();
		switch (num) {
		case 1:// 查看所有学生信息
			for(int i=0;i<Add.students.length;i++) {
				System.out.println(Add.students[i]);
			}
			inquiryStudentInfo();
			break;
		case 2:// 根据id查询学生信息
			System.out.println("请输入要查询的id：");
			byte id = scanner.nextByte();
			for(int i=0;i<Add.students.length;i++) {
				if(Add.students[i].id == id) {
					System.out.println("-----------------------------学生信息------------------------------");
					System.out.println("|学号|姓名|年龄|性别|年级|电话                |EMALL           |地址                 ");
					System.out.println("------------------------------------------------------------------");
					System.out.println("|"+Add.students[i].id+"|"+Add.students[i].name+"|"+Add.students[i].age+"|"+Add.students[i].sex+"|"+Add.students[i].grade+"|"+Add.students[i].telNum+"|"+Add.students[i].address);
					System.out.println("------------------------------------------------------------------");
				}
			}
			inquiryStudentInfo();
			break;
		case 3:// 根据id查询学生姓名
			System.out.println("请输入要查询的id：");
			byte id2 = scanner.nextByte();
			for(int i=0;i<Add.students.length;i++) {
				if(Add.students[i].id == id2) {
					System.out.println("该学生姓名为："+Add.students[i].name);
				}
			}
			inquiryStudentInfo();
			break;
		case 4:// 返回上一级
			Client.welcome();
			break;
		default:// 输入了其他数字
			System.out.println("你输入的指令不存在！");
			break;
		}
	}
}
