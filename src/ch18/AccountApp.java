package ch18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) throws FileNotFoundException {

		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);

		String time = year + "-" + month + "-" + date;
		boolean run = true, run2 = true;
		int money = 0; 		// 잔고
		int inMoney = 0; 	// 입금액
		int outMoney = 0; 	// 출금액
		File dir = new File("C:/Users/Student/git/thisisjava/src/ch18/Account");
		
		if (!dir.exists())
			dir.mkdir();

		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		while (run) {
			try {
				int i = 0;
				Account[] ac = new Account[100];
				Scanner sc = new Scanner(System.in);
				String line = "", str = "";
				String[] spl = null, spl2 = null, str2 = null;
				System.out.print("계좌번호를 입력하세요 : ");
				String accNum = sc.nextLine();
				run2 = true;
				File f = new File("C:/Users/Student/git/thisisjava/src/ch18/" + accNum + ".txt");
				if (!f.exists()) {
					System.out.print("이름을 입력하세요 : ");
					String name = sc.nextLine();
					System.out.print("연락처를 입력하세요 : ");
					String pNum = sc.nextLine();
					fw = new FileWriter(f);
					fr = new FileReader(f);
					br = new BufferedReader(fr);
					fw.append("계좌 : " + accNum + " 성명 : " + name + " 연락처 : " + pNum + "\r\n");
					fw.append("=======================================\r\n");
					while (run2) {
						System.out.println("원하는 서비스를 입력하세요.");
						System.out.println("1.입금  | 2.출금  | 3.잔고  | 4.거래내역 조회  | 5.종료 ");
						int service = sc.nextInt();
						if (service == 1) { // 입금
							// 잔고 + 예금
							System.out.print("금액>");
							inMoney = sc.nextInt();
							if (inMoney <= 0) {
								System.out.println("잘못된 금액을 입력하였습니다.");
							} else {
								outMoney = 0;
								money += inMoney;
								System.out.println(inMoney + "원 입금");
								System.out.println("잔고 : " + money);
								ac[i++] = new Account(time, inMoney, outMoney, money);
								fw.append(time + "," + inMoney + "," + outMoney + "," + money + "\r\n");
							}
						} else if (service == 2) {
							// 잔고 - 출금
							System.out.print("금액>");
							outMoney = sc.nextInt();
							if (outMoney == 0 || outMoney < 0) {
								System.out.println("잘못된 금액을 입력하였습니다.");
							} else if (outMoney > money) {
								System.out.println("잔액이 부족합니다");
							} else {
								inMoney = 0;
								money -= outMoney;
								System.out.println(outMoney + "원 출금");
								System.out.println("잔고 : " + money);
								ac[i++] = new Account(time, inMoney, outMoney, money);
								fw.append(time + "," + inMoney + "," + outMoney + "," + money + "\r\n");
							}
						} else if (service == 3) {
							// 잔고 출력
							inMoney = 0;
							outMoney = 0;
							System.out.println("현재 잔고 :" + money);
							fw.append(time + "," + inMoney + "," + outMoney + "," + money + "\r\n");
						} else if (service == 4) { // 거래 내역 조회
							fw.flush();
							System.out.print("조회 원하는 월>");
							String searchMonth = sc.next(); // 월 입력 받음
							System.out.println(searchMonth + "월 거래 내역");
							try {
								int j = 0;
								while (ac[j] != null) {
									spl2 = ac[j].getDate().split("-");
									if (searchMonth.equals(spl2[1]))
										System.out.println(ac[j].getDate() + ", " + ac[j].getInMoney() + ","
												+ ac[j].getOutMoney() + "," + ac[j].getMoney());
									j++;
									if (ac[j] == null)
										break;
								}
							} catch (NullPointerException e) {
								e.printStackTrace();
							}

						} else {
							System.out.println("종료");
							fw.append(time + "," + inMoney + "," + outMoney + "," + money + "\r\n");
							fw.flush();
							run2 = false;
							run = false;
							br.close();
							fw.close();
							fr.close();
							sc.close();
						}
					}
				} else { // 파일이 존재 하면
					fw = new FileWriter(f, true);
					fr = new FileReader(f);
					br = new BufferedReader(fr);
					while (run2) {
						System.out.println("원하는 서비스를 입력하세요.");
						System.out.println("1.입금  | 2.출금  | 3.잔고  | 4. 거래내역 조회  | 5.종료 ");
						int service = sc.nextInt();
						if (service == 1) {
							// 잔고 + 예금
							System.out.print("금액>");
							inMoney = sc.nextInt();
							if (inMoney <= 0) {
								System.out.println("잘못된 금액을 입력하였습니다.");
							} else {
								fw.flush();
								outMoney = 0;
								while ((line = br.readLine()) != null) {
									spl = line.split(",");
								}
								money = Integer.parseInt(spl[3]);
								money += inMoney;
								System.out.println(inMoney + "원 입금");
								System.out.println("잔고 : " + money);
								fw.append(time + "," + inMoney + "," + outMoney + "," + money + "\r\n");
							}
						} else if (service == 2) {
							// 잔고 - 출금
							fw.flush();
							inMoney = 0;
							while ((line = br.readLine()) != null) {
								spl = line.split(",");
							}
							money = Integer.parseInt(spl[3]);
							System.out.print("금액>");
							outMoney = sc.nextInt();
							if (outMoney == 0 || outMoney < 0) {
								System.out.println("잘못된 금액을 입력하였습니다.");
							} else if (outMoney > money) {
								System.out.println("잔액이 부족합니다");
							} else {
								money -= outMoney;
								System.out.println(outMoney + "원 출금");
								System.out.println("잔고 : " + money);
								fw.append(time + "," + inMoney + "," + outMoney + "," + money + "\r\n");
							}
						} else if (service == 3) {
							// 잔고 출력
							fw.flush();
							inMoney = 0;
							outMoney = 0;
							while ((line = br.readLine()) != null) {
								spl = line.split(",");
							}
							money = Integer.parseInt(spl[3]);
							System.out.println("잔고 조회 :" + money);
							fw.append(time + "," + inMoney + "," + outMoney + "," + money + "\r\n");

						} else if (service == 4) {
							fw.flush();
							int j = 0;

							System.out.print("조회 원하는 월>");
							String searchMonth = sc.next(); // 월 입력 받음
							System.out.println(searchMonth + "월 거래 내역");

							Account[] ac2 = new Account[100];
							while ((line = br.readLine()) != null) {
								if (line.contains(",")) {
									spl = line.split(",");
									ac2[j] = new Account(spl[0], Integer.parseInt(spl[1]), Integer.parseInt(spl[2]),
											Integer.parseInt(spl[3]));
									j++;
								}
							}
							money = Integer.parseInt(spl[3]);
							j = 0;
							while (ac2[j] != null) {
								str = ac2[j].getDate();
								str2 = str.split("-");
								if (searchMonth.equals(str2[1])) {
									ac2[j].showMoney();
								}
								j++;
							}
							if (!searchMonth.equals(str2[1]))
								System.out.println("거래내역이 없습니다.");
							fw.append(time + "," + inMoney + "," + outMoney + "," + money + "\r\n");
							fw.flush();
						} else {
							while ((line = br.readLine()) != null) {
								spl = line.split(",");
							}
							money = Integer.parseInt(spl[3]);
							System.out.println("종료");
							fw.append(time + "," + inMoney + "," + outMoney + "," + money + "\r\n");
							fw.flush();
							run2 = false;
							run = false;
							br.close();
							fw.close();
							fr.close();
							sc.close();
						}
					}

				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
