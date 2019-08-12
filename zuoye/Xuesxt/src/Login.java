


import java.util.Scanner;

/**

* @ClassName: Login

* @Description: 登录  判断用户名与密码是否正确

* @author songwei

* @date 2019年8月11日 

*


*/
public class Login {
	// 登录界面
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------欢迎 登录学生信息管理系统------------");
		System.out.println("1、登录          2、退出");
		System.out.println("----------------------------------------------");
		System.out.print("请选择：");
		byte num = scanner.nextByte();
		if(num==1) {
			System.out.println("欢迎登陆！");
		}else {
			System.out.println("再见！");
			return;
		}
		userNameAndPassword();
		
	}
	// 判断输入的用户名和密码是否正确
	public static void userNameAndPassword() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String userName = scanner.next();
		System.out.print("请输入密码：");
		String password = scanner.next();
		if(userName.equals("wei") && password.equals("1111")) {
			System.out.println("登陆成功！");
			System.out.println("欢迎您，"+userName);
			Client.welcome();
		}else {
			System.out.println("你输入的用户名或密码不正确！请重新输入");
			userNameAndPassword();
		}
		
	}
}