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
		
		//Question 8:
		System.out.println("-------------");
		System.out.println("Question 8:");
		Account[] acc = {account1, account2, account3};
		for(Account account: acc) {
			System.out.println("Account ID: " + account.id + " Email: " + account.email + " Name: " + account.fullName);
		}
		
		//Question 9:
		System.out.println("-------------");
		System.out.println("Question 9:");
		Department[] depArray = {department1, department2, department3};
		for (Department department : depArray) {
			System.out.println("Department ID: " + department.id + " Name: " + department.departmentName);
		}
		
		//Question 10:
		System.out.println("-------------");
		System.out.println("Question 10:");
		Account[] accArray = {account1, account2, account3};
		for (int i = 0; i < accArray.length; i++) {
			System.out.println("Thông tin account thứ "+ (i + 1) + " là: " + " Email: "+ accArray[i].email + " Fullname: " + accArray[i].fullName + " Phòng ban: " + accArray[i].department.departmentName);
		}
		
		//Question 11:
		System.out.println("-------------");
		System.out.println("Question 11:");
		Department[] depArray1 = {department1, department2, department3};
		for (int i = 0; i < depArray1.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: " + "ID: " + depArray1[i].id + " Name: " + depArray1[i].departmentName);
		}
		
		//Question 12:
		System.out.println("-------------");
		System.out.println("Question 12:");
		Department[] depArray2 = {department1, department2, department3};
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:" + "ID: " + depArray2[i].id + " Name: " + depArray2[i].departmentName);
		}
		
		//Question 13:
		System.out.println("-------------");
		System.out.println("Question 13:");
		Account[] accArray1 = {account1, account2, account3};
		for (int i = 0; i < accArray1.length; i++) {
			if (i != 1) {
				System.out.println("Thông tin account thứ "+ (i + 1) + " là: " + " Email: "+ accArray1[i].email + " Fullname: " + accArray1[i].fullName + " Phòng ban: " + accArray1[i].department.departmentName);
			}
		}
		
		//Question 14:
		System.out.println("-------------");
		System.out.println("Question 14:");
		Account[] accArray2 = {account1, account2, account3};
		for (int i = 0; i < accArray2.length; i++) {
			if (accArray2[i].id < 4) {
				System.out.println("Thông tin account thứ "+ (i + 1) + " là: " + " Email: "+ accArray2[i].email + " Fullname: " + accArray2[i].fullName + " Phòng ban: " + accArray2[i].department.departmentName);
			}
		}
		
		//Question 15:
		System.out.println("-------------");
		System.out.println("Question 15:");
		for (int i = 1 ; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.printf(i + " ");
			}
		}
		
		//Question 16:
		//Question 16-1:
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println("Question 16:");
		System.out.println("Question 16-1:");
		Account[] accArray161 = {account1, account2, account3};
		int i = 0;
		while (i < accArray161.length) {
			System.out.println("Thông tin account thứ "+ (i + 1) + " là: " + " Email: "+ accArray161[i].email + " Fullname: " + accArray161[i].fullName + " Phòng ban: " + accArray161[i].department.departmentName);
			i++;
		}
		
		//Question 16-2:
		System.out.println("-------------");
		System.out.println("Question 16-2:");
		Department[] depArray162 = {department1, department2, department3};
		int i162 = 0;
		while(i162 < depArray162.length) {
			System.out.println("Thông tin department thứ " + (i162 + 1) + " là: " + "ID: " + depArray162[i162].id + " Name: " + depArray162[i162].departmentName);
			i162++;
		}
		
		//Question 16-3:
		System.out.println("-------------");
		System.out.println("Question 16-3:");
		Department[] depArray163 = {department1, department2, department3};
		int i163 = 0;
		while(i163 < 2) {
			System.out.println("Thông tin department thứ " + (i163 + 1) + " là:" + "ID: " + depArray163[i163].id + " Name: " + depArray163[i163].departmentName);
			i163++;
		}
		
		//Question 16-4:
		System.out.println("-------------");
		System.out.println("Question 16-4:");
		Account[] accArray164 = {account1, account2, account3};
		int i164 = 0;
		while (i164 < accArray164.length) {
			if (i164 != 1) {
				System.out.println("Thông tin account thứ "+ (i164 + 1) + " là: " + " Email: "+ accArray164[i164].email + " Fullname: " + accArray164[i164].fullName + " Phòng ban: " + accArray164[i164].department.departmentName);			
			}
			i164++;	
		}
		
		//Question 16-5:
		System.out.println("-------------");
		System.out.println("Question 16-5:");
		Account[] accArray165 = {account1, account2, account3};
		int i165 = 0;
		while (i165 < accArray165.length) {
			if (i165 < 4) {
				System.out.println("Thông tin account thứ "+ (i165 + 1) + " là: " + " Email: "+ accArray165[i165].email + " Fullname: " + accArray165[i165].fullName + " Phòng ban: " + accArray165[i165].department.departmentName);		
			}
			i165++;
		}
		
		//Question 16-6:
		System.out.println("-------------");
		System.out.println("Question 16-6:");
		int i166 = 1;
		while(i166 <= 20) {
			if (i166 % 2 == 0) {
			System.out.println(i166 + " ");
		}
			i166++;
		}
		
		
		//Question 17:
		//Question 17-1:
		System.out.println("-------------");
		System.out.println("Question 17:");
		System.out.println("Question 17-1:");
		Account[] accArray171 = {account1, account2, account3};
		int i171 = 0;
		do {
			System.out.println("Thông tin account thứ "+ (i171 + 1) + " là: " + " Email: "+ accArray171[i171].email + " Fullname: " + accArray171[i171].fullName + " Phòng ban: " + accArray171[i171].department.departmentName);	
			i171++;
		} while (i171 < accArray171.length);
		
		//Question 17-2:
		System.out.println("-------------");
		System.out.println("Question 17-2:");
		Department[] depArray172 = {department1, department2, department3};
		int i172 = 0;
		do {
			System.out.println("Thông tin department thứ " + (i172 + 1) + " là: " + "ID: " + depArray172[i172].id + " Name: " + depArray172[i172].departmentName);
			i172++;
		} while (i172 < depArray172.length);
		
		//Question 17-3:
		System.out.println("-------------");
		System.out.println("Question 17-3:");
		Department[] depArray173 = {department1, department2, department3};
		int i173 = 0;
		do {
			System.out.println("Thông tin department thứ " + (i173 + 1) + " là: " + "ID: " + depArray173[i173].id + " Name: " + depArray173[i173].departmentName);
			i173++;
		}while(i173 < 2);
		
		//Question 17-4:
		System.out.println("-------------");
		System.out.println("Question 17-4:");
		Account[] accArray174 = {account1, account2, account3};
		int i174 = 0;
		do {
			if(i174 != 1) {
			System.out.println("Thông tin account thứ "+ (i174 + 1) + " là: " + " Email: "+ accArray174[i174].email + " Fullname: " + accArray174[i174].fullName + " Phòng ban: " + accArray174[i174].department.departmentName);	
			}
			i174++;
		} while(i174 < accArray174.length);
		
		//Question 17-5:
		System.out.println("-------------");
		System.out.println("Question 17-5:");
		Account[] accArray175 = {account1, account2, account3};
		int i175 = 0;
		do {
			if(accArray175[i175].id < 4) {
			System.out.println("Thông tin account thứ "+ (i175 + 1) + " là: " + " Email: "+ accArray175[i175].email + " Fullname: " + accArray175[i175].fullName + " Phòng ban: " + accArray175[i175].department.departmentName);	
			}
			i175++;
		} while(i175 < accArray175.length);
		
		//Question 17-6:
		System.out.println("-------------");
		System.out.println("Question 17-6:");
		int i176 = 1;
		do {
			if(i176 % 2 == 0) {
				System.out.println(i176 + " ");
			}
			i176++;
		} while (i176 <= 20);
		
		//Exercise 2:
		//Question 1:
		System.out.println("-------------");
		System.out.println("Exercise 2:");
		System.out.println("Question 1:");
		int q1 = 5;
		System.out.printf("%d %n", q1);
		
		//Question 2:
		System.out.println("-------------");
		System.out.println("Question 2:");
		int q2 = 100000000;
		System.out.printf(Locale.US, "%,d %n", q2);

		//Question 3:
		System.out.println("-------------");
		System.out.println("Question 3:");
		double q3 = 5.567098;
		System.out.printf("%.4f", q3);
		
		//Question 4:
		System.out.print("\n");
		System.out.println("-------------");
		System.out.println("Question 4:");
		String q4 = "Nguyễn Văn A";
		System.out.printf("Tên tôi là \"" + q4 + "\" và tôi đang độc thân\n");
		
		//Question 5:
		System.out.println("-------------");
		System.out.println("Question 5:");
		String pattern ="dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		//Question 6:
		System.out.println("-------------");
		System.out.println("Question 6:");
		Account[] accArray6 = {account1, account2, account3};
		System.out.println("Email           | Full Name        | Department");
        System.out.println("----------------|------------------|--------------");
		for (int j = 0; j < accArray6.length; j++) {
			System.out.printf("%-15s | %-16s | %-15s%n", accArray6[j].email, accArray6[j].fullName, accArray6[j].department.departmentName);
		}
		
		// Exercise 4:
		// Question 1:
		System.out.println("-------------");
		System.out.println("Exercise 4:");
		System.out.println("Question 1:");
		Random random = new Random();
		int n = random.nextInt();
		System.out.println("Số ngẫu nhiên: " + n);

		// Question 2:
		System.out.println("-------------");
		System.out.println("Question 2:");
		float f = random.nextFloat();
		System.out.println("Số thực ngẫu nhiên: " + f);

		// Question 3:
		System.out.println("-------------");
		System.out.println("Question 3:");
		String[] nameArr = { "Loan", "Phát", "Âu", "Nga", "Lợi", "Ny" };
		int i3 = random.nextInt(nameArr.length);
		System.out.println("Tên ngẫu nhiên 1 bạn: " + nameArr[i3] + ".");

		// Question 4:
		System.out.println("-------------");
		System.out.println("Question 4:");
//		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
//		int maxDay = (int) LocalDate.of(1992, 12, 20).toEpochDay();
//		System.out.println("Minday: " + minDay);
//		System.out.println("Maxday: " + maxDay);
//		long randomInt = minDay + random.nextInt(maxDay - minDay);
//		localDate randomDay = LocalDate.ofEpochDay(randomInt);
//		System.out.println(randomDay);

		LocalDate startDate = LocalDate.of(1995, 7, 24);
		LocalDate endDate = LocalDate.of(1995, 12, 20);
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		long randomDays = ThreadLocalRandom.current().nextLong(daysBetween + 1);
		LocalDate randomDate = startDate.plusDays(randomDays);
		System.out.println("Ngày ngẫu nhiên trong khoảng thời gian từ 24-07-1995 đến 20-12-1995:");
		System.out.println(randomDate);

		// Question 5:
		System.out.println("-------------");
		System.out.println("Question 5:");
		int now = (int) LocalDate.now().toEpochDay();
		int randomDate5 = now - random.nextInt(365);
		LocalDate reusultDate = LocalDate.ofEpochDay(randomDate5);
		System.out.println("Ngày ngẫu nhiên là: " + reusultDate);

		// Question 6:
		System.out.println("-------------");
		System.out.println("Question 6:");
		int maxDay6 = (int) LocalDate.now().toEpochDay();
		long randomDay6 = random.nextInt(maxDay6);
		LocalDate resultDate6 = LocalDate.ofEpochDay(randomDay6);
		System.out.println("1 ngày ngẫu nhiên trong quá khứ: " + resultDate6);

		// Question 7:
		System.out.println("-------------");
		System.out.println("Question 7:");
		int q7 = random.nextInt(999 - 100 + 1) + 100;
		System.out.println(q7);

	}
}
