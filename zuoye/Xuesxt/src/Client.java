

import java.util.Scanner;

/**

* @ClassName: Client

* @Description: 登录后选择你要做的操作

* @author songwei
* @date 2019年8月11日

*


*/
public class Client {

	public static void main(String[] args) {
		welcome();
	}
	// 主界面
	public static void welcome() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("*********************** 请选择要操作的信息对应数字 *********************");
		System.out.println("*1、查看学生信息   2、添加学生信息   3、删除学生信息   4、修改学生信息   5、退出 *");
		System.out.println("*********************************************************************");
		System.out.println("请选择：");
		byte num = scanner.nextByte();
		switch (num) {
		case 1:// 调用查询方法
			Inquiry.inquiryStudentInfo();
			break;
		case 2:// 调用添加方法
			System.out.println("*************************添加学生信息*************************");
			Add.addStudentInfo();
			break;
		case 3:// 调用删除方法
			Delete.deleteStudentInfo();	
			break;
		case 4:// 调用修改方法
			Modify.modifyStudentInfo();		
			break;
		case 5:// 退出
			System.out.println("再见！");
			System.exit(0);			
			break;
		default:// 输入了不存在的指令
			System.out.println("输入有误，请重新输入！");
			welcome();
			break;
		}
	}
	
}