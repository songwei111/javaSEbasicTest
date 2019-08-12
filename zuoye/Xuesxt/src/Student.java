


/**

* @ClassName: Student

* @Description: 定义学生属性

* @author songwei

* @date 2019年8月11日 

*


*/
public class Student {

	// 定义学生属性
	byte id;// 学号
	String name;// 姓名
	char sex;// 性别
	byte age;// 年龄
	String grade;// 年级
	String address;// 住址
	long telNum;// 手机号
	String mailbox;// 邮箱
	
	
	public String toString() {
		return "学生 [学号：" + id + ",姓名：" + name + ", 年龄：" + age + ", 性别：" + sex + ", 年级：" + grade
				+ ", 电话：" + telNum + ", 邮箱：" + mailbox + ", 住址：" + address + "]";
	}
}

