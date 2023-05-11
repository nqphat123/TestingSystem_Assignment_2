import java.time.LocalDate;

public class FlowControl {
	public static void main(String[] args) {
		// logic
		// create department
		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.departmentName = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.departmentName = "IT";

		// create position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.TEST;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.SCRUM_MASTER;

		// create Group
		Group group1 = new Group();
		group1.id = 1;
		group1.groupName = "Java Fresher";

		Group group2 = new Group();
		group2.id = 2;
		group2.groupName = "C# Fresher";

		Group group3 = new Group();
		group3.id = 3;
		group3.groupName = "PHP Fresher";

		// create account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "1@gmail.com";
		account1.userName = "nvA";
		account1.fullName = "Nguyen Van A";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		account1.groups = groupAcc1;

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "2@gmail.com";
		account2.userName = "nvB";
		account2.fullName = "Nguyen Van B";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = LocalDate.now();
		account2.groups = new Group[] { group3, group2 };

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "3@gmail.com";
		account3.userName = "nvC";
		account3.fullName = "Nguyen Van C";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = LocalDate.now();
		
		//add Group Account
		group1.accounts = new Account[] {account1};
		group2.accounts = new Account[] {account1, account2};
		group3.accounts = new Account[] {account2};

		// Question1:
		System.out.println("Question 1:");
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban!");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + account2.department.departmentName);
		}

		// Question2:
		System.out.println("-------------");
		System.out.println("Question 2:");
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group.");
		} else {
			int countGroup = account2.groups.length;
			if (countGroup == 1 || countGroup == 2) {
				System.out.println("Group của nhân viên này là Java Fresher và C# Fresher.");
			}

			if (countGroup == 3) {
				System.out.println("Nhân viên là người quan trong, tham gia nhiều group.");
			}

			if (countGroup == 4) {
				System.out.println("Nhân viên là người hóng chuyện, tham gia tất cả group.");
			 
			}
		}

		// Question 3:
		System.out.println("-------------");
		System.out.println("Question 3:");
		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban."
				: "Phòng ban của nhân viên này là: " + account2.department.departmentName);

		// Question 4:
		System.out.println("-------------");
		System.out.println("Question 4:");
		System.out.println(account1.position.name.toString() == "DEV" ? "Đây là Developer" : "Người này k phải là Developer" );
		
		//Question 5:
		System.out.println("-------------");
		System.out.println("Question 5:");
		if (group1.accounts == null) {
			System.out.println("Group chưa có thành viên nào.");
		}else {
			int countAccInGroup = group1.accounts.length;
			switch(countAccInGroup) {
			case 1:
				System.out.println("Nhóm có 1 thành viên");
				break;
			case 2:
				System.out.println("Nhóm có 2 thành viên");
				break;
			case 3:
				System.out.println("Nhóm có 3 thành viên");
				break;
				
			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
		}
		
		//Question 6:
		System.out.println("-------------");
		System.out.println("Question 6:");
		if (account2.groups == null) {
			System.out.println("Nhân viên chưa có group nào.");
		}else {
			switch(account2.groups.length) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher và C# Fresher.");
			break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher và C# Fresher.");
			break;
			case 3:
				System.out.println("Nhân viên là người quan trong, tham gia nhiều group.");
			break;
			default:
				System.out.println("Nhân viên là người hóng chuyện, tham gia tất cả group.");
			break;
			}
		}
		
		//Question 7:
		System.out.println("-------------");
		System.out.println("Question 7:");
		String positionName = account1.position.name.toString();
		switch (positionName) {
		case "DEV":
			System.out.println("Đây là Developer");	
			break;
		default:
			System.out.println("Đây không phải là Developer");	
			break;
		}
		
		
	}
}
