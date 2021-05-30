import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	Vector<String>vrole = new Vector<>();
	Vector<String>vname = new Vector<>();
	Vector<String>vSkill = new Vector<>();
	Vector<Integer>vHP = new Vector<>();
	Vector<Integer>vPower = new Vector<>();
	Random rd =new Random();
	
	public Main() {
		// TODO Auto-generated constructor stub
		menu();
	}
	
	private void cls() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	private void menu() {
		// TODO Auto-generated method stub
		int choose = 0;
		do {
			System.out.println("1. view heroes");
			System.out.println("2. add heroes");
			System.out.println("3. exit");
			try {
				choose = sc.nextInt();sc.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			switch (choose) {
			case 1:
				cls();
				view();
				break;

			case 2:
				cls();
				add();
				break;
			}
		} while (choose>1 && choose<2);
	}

	private void view() {
		// TODO Auto-generated method stub
		if (vname.isEmpty()) {
			cls();
			System.out.println("there is no hero added");
			System.out.println("press enter to continue ...");
			sc.nextLine();
			cls();
		}else {
			cls();
			for (int i = 0; i < vname.size(); i++) {
				
				System.out.println("Role :" + vrole.get(i));
				System.out.println("Name :" + vname.get(i));
				System.out.println("Skill :"+ vSkill.get(i));
				System.out.println("HP :"+ vHP.get(i));
				System.out.println("Power:"+ vPower.get(i));
				System.out.println();
				System.out.println();
			}
			System.out.println("press enter to continue");
			sc.nextLine();
		}
	}

	private void add() {
		// TODO Auto-generated method stub
		String role = "";
		do {
			System.out.println(" choose role ( Tank || Range || Magic) ");
			try {
				role = sc.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (roleValid(role)==false);
		
		vrole.add(role);
		cls();
		String name = "";
		do {
			System.out.println("input name minimum 2 words ");
			try {
				name =sc.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (!name.contains(" "));
		
		vname.add(name);
		
		if (role.equals("Tank")) {
			tankStats();
		}else if (role.equals("Range")) {
			rangeStats();
		}else {
			magicStats();
		}
	}
	
	private void magicStats() {
		// TODO Auto-generated method stub
		cls();
		String skill = "";
		do {
			System.out.println("skill list ");
			System.out.println("============");
			System.out.println("1. Cold Snap");
			System.out.println("2. Meteor ");
			System.out.println("3. Tornado");
			try {
				skill = sc.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (!skill.equals("Cold Snap")&&!skill.equals("Meteor")&&!skill.equals("Tornado"));
		
		vSkill.add(skill);

		int initHP = 100;
		int addHP = rd.nextInt((500 - 100) + 1) + 100;
		int finalHP = initHP+addHP;
		
		vHP.add(finalHP);
		
		int power = rd.nextInt((1000 - 500) + 1) + 500;
		vPower.add(power);
		
		System.out.println("press enter to continue");
		sc.nextLine();
		cls();
	}

	private void rangeStats() {
		// TODO Auto-generated method stub
		cls();
		String skill = "";
		do {
			System.out.println("skill list ");
			System.out.println("============");
			System.out.println("1. Lucent Beam");
			System.out.println("2. Powershot ");
			System.out.println("3. MultiShot");
			try {
				skill = sc.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (!skill.equals("Lucent Beam")&&!skill.equals("Powershot")&&!skill.equals("MultiShot"));
		
		vSkill.add(skill);
		
		int initHP = 100;
		int addHP = rd.nextInt((500 - 100) + 1) + 100;
		int finalHP = initHP+addHP;
		
		vHP.add(finalHP);
		
		int power = rd.nextInt((1000 - 500) + 1) + 500;
		vPower.add(power);
		
		System.out.println("press enter to continue");
		sc.nextLine();
		
		cls();
	}

	private void tankStats() {
		// TODO Auto-generated method stub
		cls();
		String skill = "";
		do {
			System.out.println("skill list ");
			System.out.println("============");
			System.out.println("1. Dismember");
			System.out.println("2. Ravage ");
			System.out.println("3. Warpath");
			try {
				skill = sc.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (!skill.equals("Dismember")&&!skill.equals("Ravage")&&!skill.equals("Warpath"));
		
		vSkill.add(skill);
		
		int initHP = 100;
		int addHP = rd.nextInt((1000 - 500) + 1) + 500;
		int finalHP = initHP+addHP;
		
		vHP.add(finalHP);
		
		int power = rd.nextInt((500 - 100) + 1) + 100;
		vPower.add(power);
		
		System.out.println("press enter to continue");
		sc.nextLine();
		cls();
	}

	
	

	private boolean roleValid(String role) {
		if (role.equals("Tank")||role.equals("Range")||role.equals("Magic")) {
			return true;
		}else {
			
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
