package by.htp.hometask.looping;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HomeworkLooping {

	public static void main(String[] args) {
		
		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
		task21();
		task22();
		task23();
		task24();
		task25();
		task26();
		task27();
		task28();
		task29();
		task30();
		task31();
		task32();
		task33();
		task34();
		task35();
		task36();
		task37();
		task38();
		task39();
		task40();

	}
	
	public static int scannerInt() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int number;
		
		System.out.println("������� �����: \r");
		
		while(!in.hasNextInt()) {
			
			in.next();
			
			System.out.println("������������ ����!\r ");
			System.out.println("������� �����: \r");
		}
		number = in.nextInt();
	
		return number;
		
	}

	public static double scannerDouble() {
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		double number;
	
		System.out.println("������� �����: \r");
	
		while(!in.hasNextDouble()) {
		
			in.next();
		
			System.out.println("������������ ����! \r");
			System.out.println("������� �����: \r");
		}
	
		number = in.nextDouble();
	
		return number;
	
	}

	public static String scannerString() {
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		String symbol;
	
		System.out.println("������� ������: \r");
	
		while(!in.hasNextLine()) {
		
			in.next();
		
			System.out.println("������������ ����! \r");
			System.out.println("������� ������ (+, -, /, *) : \\r");
		}
		symbol = in.nextLine();
	
		return symbol;
	}
	
	public static void task01() {
		
		System.out.println("1. ���������� ������� �� ����� ����� �� 1 �� 5.");
		
		int i;
		
		for(i = 1; i <= 5; i++) {
			
			System.out.print(i);
			
		}
		System.out.println();
	}
	
	public static void task02() {
		
		System.out.println("2. ���������� ������� �� ����� ����� �� 5 �� 1. ");
		
		int i;
		
		for(i = 5; i >= 1; i--) {
			
			System.out.print(i);
		}
		
		System.out.println();
	}
	
	public static void task03() {
		
		System.out.println("3. ���������� ������� �� ����� ������� ��������� �� 3: ");
		
		int i;
		int x;
		
		i = 1;
		
		while(i <= 9) {
			
			x = i * 3;
			
			System.out.println("3 �������� �� " + i + " ����� " + x);
			
			i++;
		}
		
		System.out.println();
	}
	
	public static void task04() {
		
		System.out.println("4. � ������� ��������� while �������� ��������� ������ ���� ������ ����� �"
				+ " ��������� �� 2 �� 100 ������������.");
		
		int i = 2;
		
		while(i <= 100) {
			
			if(i % 2 == 0) {
			
				System.out.print(i + " ");
			}
			
			i++;
		}
		
		System.out.println();
	}
	
	public static void task05() {
		
		System.out.println("5.  �  �������  ���������  while  ��������  ���������  �����������  �����  "
				+ "����  ��������  �����  � ��������� �� 1 �� 99 ������������. ");
		
		int i = 1;
		int x = 0;
		
		while(i <= 99) {
			
			if(i % 2 != 0) {
				
				x = x + i;		
				
			}
			
			i++;
		}
		
		System.out.println("����� �������� ������ �� 1 �� 99 ����� " + x);
		
		System.out.println();
	}
	
	public static void task06() {
		
		System.out.println("6.  ��������  ���������,  ���  ������������  ������ �����  �����  "
				+ "�������������  �����. �  ��������� ��������� ��� ����� �� 1 �� ���������� "
				+ "������������� �����.");
		
		int a = scannerInt();
		int x = 0;
		int i = 1;
		
		while(i <= a) {
			
			x = x + i;
			
			i++;
		}
		
		System.out.println("����� ����� �� 1 �� " + a + " ����� " + x);
		
		System.out.println();
	}
	
	public static void task07() {
		
		System.out.println("7. ��������� �������� ������� �� ������� [�,b] c ����� h: y = x , ��� x > 2 � y = -x, ��� x <= 2 ");
		
		double a;//��������� ����� �������
		double b;//�������� ����� �������
		double h;// ���
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
		
		System.out.println("������ ������� [ " + a + " , " + b +  " ] � ����� " + h);
		
		double i = a;
		
		while(i <= b) {
			
			if(i <= 2) {
			
				y = -i;
				
				System.out.println("�������� ������� y � ����� " + i + " ����� " + y);
			}
			
			if(i > 2) {
			
				y = i;
				
				System.out.println("�������� ������� y � ����� " + i + " ����� " + y);
			}
		i = i + h;
			
		}
		
		System.out.println();
	}
	
	public static void task08() {
		
		System.out.println("8. ��������� �������� ������� �� ������� [�,b] c ����� h: "
				+ "y = (x + c) * 2, ���� x = 15 � y = (x - c) + 6, ���� x �� ����� 15.");
		
		double a;//��������� ����� �������
		double b;//�������� ����� �������
		double h;// ���
		double c;
		double y;
		
		a = -25;
		b = 25;
		c = 2;
		h = 5;
		
		System.out.println("������ ������� [ " + a + " , " + b +  " ] � ����� " + h);
		
		double i = a;
		
		while(i <= b) {
			
			if(i != 15) {
			
				y = (i - c) + 6;
				
				System.out.println("�������� ������� y � ����� " + i + " ����� " + y);
			}
			
			else {
				
				y = (i + c) * 2;
				
				System.out.println("�������� ������� y � ����� " + i + " ����� " + y);
				
			}
			
		i = i + h;
			
		}
		
		System.out.println();
	}
	
	public static void task09() {
		
		System.out.println(" ����� ����� ��������� ������ ��� �����.");
		
		double x;
		double y;
		int i;
		
		y = 0;
		i = 1;
		
		while(i <= 100) {
			
			x = Math.pow(i, 2);
			
			y = x + y;
			
			i++;
		}
		System.out.println("����� ��������� ������ ��� ����� ����� " + y);
		
		System.out.println();
		
	}
	
	public static void task10() {
		
		System.out.println("10. ��������� ��������� ���������� ������������ ��������� ������ ������� �����. ");
		
		double x;
		double y;
		int i;
		
		y = 1;
		i = 1;
		
		while(i <= 200) {
			
			x = Math.pow(i, 2);
			
			y = x * y;
			
			i++;
		}
		System.out.println("������������ ��������� ������ ������� ����� ����� " + y);
		
		System.out.println();
	}
	
	public static void task11() {
		
		System.out.println("11. ��������� ��������� ���������� �������� ����� ������ ������� ����� ");
		
		double x;
		double y;
		int i;
		
		y = 1;
		i = 1;
		
		while(i <= 200) {
			
			x = Math.pow(i, 3);
			
			y = x - y;
			
			i++;
		}
		System.out.println("�������� ����� ������ ������� ����� ����� " + y);
		
		System.out.println();
		
	}
	
	public static void task12() {
		
		System.out.println("12.  ������������������  An ��������  ���:  A1 =  1,  An = 6 + An-1 ,  "
				+ "���  �������  n  > 1  ���������  ��������� ���������� ������������ ������ 10 ������"
				+ " ���� ������������������.\n");
		
		double x;
		double y;
		int i;
		
		x = 1.0;
		y = 1.0;
		i = 2;
		
		while(i <= 10) {
			
			x = 6 + x;
			
			y = x * y;
			
			i++;
			
		}
		
		System.out.println("������������ ������ 10 ������ ����� " + y);
		
		System.out.println();
	}
	
	public static void task13() {
		
		System.out.println("13. ��������� ������� �������� ������� y = 5 - (x^2/2) �� ������� [-5; 5] "
				+ "� ����� 0.5.");
		
		double a;//��������� ����� �������
		double b;//�������� ����� �������
		double h;// ���
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
				
		double i = a;
		
		while(i <= b) {
			
			
				y = 5 - (Math.pow(i, 2) / 2);
				
				System.out.println("�������� ������� y � ����� " + i + " ����� " + y);
			
				i = i + h;
			
		}
		
		System.out.println();
		
	}
	
	public static void task14() {
		
		System.out.println("14. ���� ����������� n. ���������: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n. ");
		
		int n;
		double x;
		double i;
		
		x = 1.0;
		n = 10;
		i = 2.0;
		
		while(i <= n) {
			
			x = x + (1 / i);
			
			i++;
		}
		
		System.out.println("���� n = " + n + " ��������� ����� " + x);
		
		System.out.println();
	}
	
	public static void task15() {
		
		System.out.println("15. ��������� : 1+2+4+8+...+ 32 � 10 �������.");
		double y;
		int i = 1;
		int x = 0;
		
		while(i <= 32) {
				
				x = x + i;		
			
			i = i * 2;
		}
		
		y = Math.pow(x, 10);
		
		System.out.println("1+2+4+8+...+ 32 � 10 ������� ����� " + y);
		
		System.out.println();
	}
	
	public static void task16() {
		
		System.out.println("16. ���������: (1+2)*(1+2+3)*...*(1+2+...+10).");
		
		int i = 3;
		int x = 3;
		double y = 3;
		
		while(i <= 10) {
			
			x = x + i;
			
			y = y * x;
			
			i++;
		}
		
		
		System.out.println("(1+2)*(1+2+3)*...*(1+2+...+10) ����� " + y);
		
		System.out.println();
	}
	
	public static void task17() {
		
		System.out.println("17. ���� �������������� (�) � ����������� (n). ���������: a(a+1)...(a+n-1)");
		
		int a = 1;//������������ ��������
		int n = 4;//������������ ��������
		int x;
		int y = 1;
		int i = 0;
		while(i <= (n - 1)) {
			
			x = a + i;
			
			y = y * x;
			
			i++;
		}
		
		
		System.out.println(" a(a+1)...(a+n-1) ����� " + y);
		
		System.out.println();
	}
	
	public static void task18() {
		
		System.out.println("18. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, "
				+ "������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:"
				+ " An = ((-1)^n-1) / n");
		
		double x;
		double a;//���� ���� An
		double e = -50;//��������� ����� �
		double y = 0;
		double i = 1;
		
		while(i <= 50) {
			
			a = Math.pow(-1, i-1) / i;
			
			if(Math.abs(a) >= e) {
				
				x = a;
				
				y = y + x;
				
			}
			
			i++;
		}
		
		System.out.println("����� ������ ���� ������ ������� ������ ��� ����� � ���������� " + y);
		
		System.out.println();
		
	}
	
	public static void task19() {
		
		System.out.println("19. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����,"
				+ " ������ ������� ������ ��� ����� ��������� �. "
				+ "����� ���� ���� ����� ���: An = (1 / 2^n) + (1 / 3^n)");
		
		double x;
		double a;//���� ���� An
		double e = -30;//��������� ����� �
		double y = 0;
		double i = 1;
		
		while(i <= 50) {
			
			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
			
			if(Math.abs(a) >= e) {
				
				x = a;
				
				y = y + x;
				
			}
			
			i++;
		}
		
		System.out.println("����� ������ ���� ������ ������� ������ ��� ����� � ���������� " + y);
		
		System.out.println();
	}
	
	public static void task20() {
		
		System.out.println("20. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����,"
				+ " ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:"
				+ " An = 1 / ((3*n - 2) * (3*n + 1)). ");
		
		double x;
		double a;//���� ���� An
		double e = -20;//��������� ����� �
		double y = 0;
		double i = 1;
		
		while(i <= 50) {
			
			a = (1 / ((3 * i - 2) * (3 * i + 1)));
			
			if(Math.abs(a) >= e) {
				
				x = a;
				
				y = y + x;
				
			}
			
			i++;
		}
		
		System.out.println("����� ������ ���� ������ ������� ������ ��� ����� � ���������� " + y);
		
		System.out.println();
	}
	
	public static void task21() {
		
		System.out.println("21. ��������� ��������� ��� ���������� �������� �������  "
				+ "F(x) �� ������� [�, b] � ����� h. ��������� \r\n" + 
				"����������� � ���� �������, ������ ������� ������� � ��������  ���������, "
				+ "������ - ��������������� \r\n" + 
				"�������� �������: F(x) = x - sin(x).");
		
		double a;//��������� ����� �������
		double b;//�������� ����� �������
		double h;// ���
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
		
		System.out.println("������ ������� [ " + a + " , " + b +  " ] � ����� " + h);
		
		double i = a;
		
		System.out.println();
		System.out.println("�������� � ------ �������� F(x)");
		System.out.println();
		
		while(i <= b) {
			
			y = i - Math.sin(i);
				
			System.out.println(" x " + i + "  ------  " + y);
	
			i = i + h;
			
		}
		
		System.out.println();
	}
	
	public static void task22() {
		
		System.out.println("22. ��������� ��������� ��� ���������� �������� �������  F(x) �� ������� [�, b]"
				+ " � ����� h. ��������� ����������� � ���� �������, ������ ������� ������� �"
				+ " ��������  ���������, ������ - ��������������� �������� �������: F(x) = sin^2(x).");
		
		double a;//��������� ����� �������
		double b;//�������� ����� �������
		double h;// ���
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
		
		System.out.println("������ ������� [ " + a + " , " + b +  " ] � ����� " + h);
		
		double i = a;
		
		System.out.println();
		System.out.println("�������� � ------ �������� F(x)");
		System.out.println();
		
		while(i <= b) {
			
			y = Math.pow(Math.sin(i), 2);
				
			System.out.println(" x " + i + "  ------  " + y);
	
			i = i + h;
			
		}
		
		System.out.println();
	}
	
	public static void task23() {
		
		System.out.println("23. ��������� ��������� ��� ���������� �������� �������  F(x) �� ������� [�, b]"
				+ " � ����� h. ��������� ����������� � ���� �������, ������ ������� ������� � "
				+ "��������  ���������, ������ - ��������������� �������� �������: F(x) = ctg(x/3) + 1/2sin(x).");
		
		double a;//��������� ����� �������
		double b;//�������� ����� �������
		double h;// ���
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
		
		System.out.println("������ ������� [ " + a + " , " + b +  " ] � ����� " + h);
		
		double i = a;
		
		System.out.println();
		System.out.println("�������� � ------ �������� F(x)");
		System.out.println();
		
		while(i <= b) {
			
			y = (1 / Math.tan(i / 3)) + (1 /(2 * Math.sin(a)));
				
			System.out.println(" x " + i + "  ------  " + y);
	
			i = i + h;
			
		}
		
		System.out.println();
	}
	
	public static void task24() {
		
		System.out.println("24. �������� ����������� �����. ����� ����� ������ ����, �������� � ��� ������."
				+ " ������������� ��� � ������ �����, ����� �������� ����� ��������� � �������� ������� ��"
				+ " ��������� � ��������� ������. ");
		
		int n = scannerInt();
		double x;
		int z = n;
		double y = 0;
		
		System.out.println("�� ����� : " + n);
		
		while (n != 0) {
			
			x = n % 10;
			
			if(x % 2 == 0) {
				
				y = y + x;
			}
			
			n = n / 10;
				
		}
		
		String s = String.valueOf(z);
		
		String reverse = new StringBuffer(s).reverse().toString();
		
		int a = Integer.parseInt(reverse);
		
		System.out.println("\n����� ������ ���� ���������� �����  ����� " + y);
		
		System.out.println("����� � �������� ������� ����� " + a);
		
		System.out.println();
	}
	
	public static void task25() {
		
		System.out.println("25. ��������� ���������� ��������� �����, ������� ���� ������������.");
		
		double a = scannerInt();
		int i = 1;
		double x = 1;
		
		while(i <= a) {
			
			x = x * i;
			
			i++;
		}
		
		System.out.println("��������� ����� " + a + " ����� " + x);
		
		System.out.println();
	}
	
	public static void task26() {
		
		System.out.println("26. �������  ��  �����  ������������  �����  ���������  �  ��  ����������"
				+ "  �������������  �  ������ ���������� (������� ASCII).");
		
		double i = 0;
		
		char ch;
		
		while(i <= 255) {
			
			ch = (char) i;
			
			System.out.println("������--- " + ch + " ������������� ��������� ���� " + i);
			
			i++;
		}
		
		System.out.println();
		
	}
	
	public static void task27() {
		
		System.out.println("27. ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������,"
				+ " ����� ������� � ������ �����. m � n �������� � ����������. ");
		
		double m = scannerInt();
		double n = scannerInt();
		int x = 0;
		
		while(m <= n) {
			
			System.out.println("�������� ����� " + m);
			System.out.println("1 � " + m);
			
			int i = 2;
			while( i <= (m - 1)) {
				
				if(m % i == 0 ) {
					
					 x = i;
					System.out.print(" " + x + " \n");
				}
				
				i++;	
			}
			
			m++;
							
		}
		
		System.out.println();
	}
	
	public static void task28() {
		
		System.out.println("28. �������� ���������, � ������� �������� ��� �������� � � Y � ���� �������� (+, �, /, *). ��������� \r\n" + 
				"��������� Z � ����������� �� �����. ������������� ������� �� ��������� �������� ���� ��������, � \r\n" + 
				"�����  ��  ����  Y=0  ���  �������.  ������������  �����������  ������������  ����������  ��� \r\n" + 
				"������������ ��������� (�.�. ��������� ����). � �������� ������� ����������� ���������� ������� \r\n" + 
				"�0�. ");
		
		for(;;) {
			
			System.out.println("������� �������� �: ");
			
			double x = scannerDouble();
			
			System.out.println("������� �������� Y: ");
			
			double y = scannerDouble();
		
			System.out.println("������� ������ �������� (+, -, /, *) :");
		
			String str = scannerString();
			
			System.out.println("�� ����� " + x + " " + str + " " + y);
		
			double z = 0;
		
			switch(str) {
				case "+":
					
					z = x + y;
				
					break;
				
				case "-":
					
					z = x - y;
				
					break;
				
				case "/":
					if(y == 0) {
						System.out.println("�� ���� ������ ������!");
						z = 0;
					}
					else {
						
						z = x / y;
					}
					
					break;
				
				case "*":
					z = x * y;
					
					break;	
					
				default:
					
					System.out.println("�� ����� �� ������������ ��������. ���������� ��� ���!");
			}
			
			System.out.println("�������� ��������� ����� \n " + z);
			
			System.out.println("���������� ���������� ��������� ? ��---1 / ���---0 : ");
			
			String str1 = scannerString();
			
			if( str1.equals("0")) {
				
				break;
			}
			
		}
		
		System.out.println();
	}
	
	public static void task29() {
		
		System.out.println("29. ���� ��� �����. ���������� �����, �������� � ������ ��� ������� "
				+ "��� � ������� �����.");
		
		int a;
		int b;
		int x;
	
		a = 23654;//������������ ��������
		b = 12345;//������������ ��������
		
		String str1 = String.valueOf(b);
		
		System.out.println("� ������ ������� � ������� ����� ������ ����� ");
		
		while (a != 0) {
			
			x = a % 10;
			
			String str2 = String.valueOf(x);
			
			
			
			if(str1.indexOf(str2) != -1) {
				
				System.out.print(x + " ");
			}
				
			a = a / 10;
		}
		
		System.out.println();
	}
	
	public static void task30() {
		
		System.out.println("30. �������� ���������, ����������� ������� ����� � ��������. ");
		
		int i = 0;
		String roman[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	
		while(i <= roman.length-1) {
			
			System.out.println("�������� ����� " + i + " ������������� ������� " + roman[i]);
			
			i++;
		}
		
		System.out.println();
	}
	
	public static void task31() {
		
		System.out.println("31.  ���������  ����������  ����  �����  �  ���������  ��  1  ��  15  "
				+ "������������.  �������  ��������  �� �������.  "
				+ "���������  ������  ��������  ���������  �  �����������  �����  ��  ���,  ��� "
				+ " ������������� ���������, � ����� ��������� ����� ������������. ");
		
	
			int a = 1 + (int)(Math.random() * 15);
			int b = 1 + (int)(Math.random() * 15);
			int c = 1 + (int)(Math.random() * 15);
			int d = 1 + (int)(Math.random() * 15);
			int e = 1 + (int)(Math.random() * 15);
			
			int user [] = new int[5];
			
			int i = 0;
			
			while(i <= 4) {
				
				int x = scannerInt();
					
				if(x == a) {
					
					System.out.println("���!�� ������� ����� " + a);
				}
				
				if(x == b) {
					
					System.out.println("���!�� ������� ����� " + b);
				}
				
				if(x == c) {
					
					System.out.println("���!�� ������� ����� " + c);
				}
				
				if(x == d) {
					
					System.out.println("���!�� ������� ����� " + d);
				}
				
				if(x == e) {
					
					System.out.println("���!�� ������� ����� " + e);
				}
				
				user [i] = x;
				
				i++;
				
			}
				System.out.println("����� ������������ ������� " );
			
				for(i = 0; i < 5; i++) {
				
					System.out.print(user[i] + " \\ ");
				}
				
			System.out.println("\n����� ���������� ����������� \n" + a + " \\ " + b + " \\ " + c + " \\ " + d + " \\ " + e + " \\ ");
			System.out.println();
	}
	
	public static void task32() {
		
		System.out.println("32.  ���������  ���������  �������������  ������  ��  �������  ������������"
				+ "  ��������.  �  �������� �������  �������  ���������  ������  �����  �  ����  "
				+ "�������������.  ���������  �������  �����  ���� �������, ������� � ������ �������������.");
		
		String str = scannerString();
		
		Pattern pattern = Pattern.compile("([a-zA-Z_])\\w*");
		
        Matcher matcher = pattern.matcher(str);
        
		boolean result1 = matcher.matches();
		
		if(result1 == true) {
			
			System.out.println("�� ��������� ����� ������");
		}
		else {
			
			System.out.println("�� ���������� ����. � �������� ������� ������� ��������� ������ "
					+ "����� � ���� �������������. ���������  �������  �����  ���� �������, ������� "
					+ "� ������ �������������.");
		}
		
		System.out.println();
		
		System.out.println(str);
	}
	
	public static void task33() {
		
		System.out.println("33. ������� ���������� ����� ������� ������������ �����.");
		
		int n = scannerInt();
		
		System.out.println("�� ����� " + n);
		
		int num = n;
		
		int x;
		
		int count = (num == 0) ? 1 : 0;
		
        while (num != 0) {
        	
            count++;
            
            num = num / 10;
        }
        
        System.out.println("���������� ���� " + count);
        
        int number[] = new int [count];
        
        int i = 0;
        
		while(i < count) {
			
			x = n % 10;
			
			number[i] = x;
			
			n = n / 10;
			
			i++;
		}
		
		int max = 0;
		
		for (i = 0; i <= count-1; i++) {
			
            if (number[i] > max) {
            	
                max = number[i];
            }
        }
		
        System.out.println("���������� ����� � �����  ����� " + max);
        
        System.out.println();
    }
	
	public static void task34() {
		
		System.out.println("34. ������� ��� �������������� �����, ����� ���� ������� �� ������� ����� 15. ");
		
		int x;
	
		
		for(int i = 1000; i <= 9999; i++) {
			
			int n = i;
			
			int a = 0;
			
			while(n != 0) {
				
				x = n % 10;
				
				a = a + x;
				
				n = n / 10;
			}
			
			if(a == 15) {
				
				System.out.print(i + " \\ ");
			}
		}
		
		System.out.println();
	}
	
	public static void task35() {
		
		System.out.println("35. ������� ���������� ������ ���� ������� ������������ �����.");
		
		int n = scannerInt();
		
		int x;
		
		System.out.println("��������� ��������� " + n);
		
		int count = (n == 0) ? 1 : 0;
		
		while(n != 0) {
			
			x = n % 10;
			
			if(x % 2 == 0) {
				
				count++;
			}
			
			n = n / 10;
		}
		
		System.out.println("���������� ������ ����� " + count);
		
		System.out.println();
	}
	
	public static void task36() {
		
		System.out.println("36.  ���  ����������  �����,  ����������  ����  ��  ������  ,  ��������  "
				+ "�������������  �����,  ������� ������� �� �� ������������. ����� ��� �����. ");
		
		int a;
		int b;
		int ab;
		
		for(a = 10; a <= 99; a++) {
			
			for(b = 10; b <= 99; b++) {
				
				ab = a * 100 + b;
				
				if(ab % (a * b) == 0) {
					
					System.out.println("����� " + a + " � " + b);
				}
			}
		}
		
		System.out.println();
	}
	
	
	public static void task37() {
		
		System.out.println("37. ���� ��� ���������� ����� � � �. �� ���� ����� ��������� 2 "
				+ "�������������� �����: ������ ����� �������� ����� ��������� ������� ����� �, ����� �."
				+ " ��� ��������� ������� ����� ������� �������� ����� �, ����� �. ����� ����� � � � "
				+ "���� �������� , ��� ������ �������������� ����� ������ ������� �� 99, � ������ �� 49. ");
		
		int a;
		int b;
		int ab;
		int ba;
		
		for(a = 10; a <= 99; a++) {
			
			for(b = 10; b <= 99; b++) {
				
				ab = a * 100 + b;
				ba = b * 100 + a;
				
				if((ab % 99 == 0) && (ba % 49 == 0)) {
					
					System.out.println("����� " + a + " � " + b);
				}
			}
		}
		
		System.out.println();
	}
	
	public static void task38() {
		
		System.out.println("38.  ���  ���������  ������������  �����  ����������,  ��������  �� "
				+ " ���  �����  �������������� ����������. ��������������, ��� � ����� �� ����� ��� ����."
				+ " ��������: 1357, 963.");
		
		int n = 1357;
		
		int num = n;
		
		int x;
		
		int count = 0;
		
		while(num != 0) { // ������� ���������� ���� � �����
			
			x = num % 10;
			
			count++;
			
			num = num / 10;
		}
		
		int [] element = new int [count]; // ������� ������ �������� ������ ���������� ���� �����
		
		int i = 0;
		
		while(i < count) { // ��������� ������ ������� �����
			
			x = n % 10;
			
			element[i] = x;
			
			n = n / 10;
			
			i++;
		}
		
		int sum = 0;
		
		for(int j = 0; j < count; j++) { //������� ����� ���� �����
			
	        sum = sum + element[j];
	    }
		
		int sum1 = ((element[0] + element[count - 1]) / 2) * count; // ����� n ������ �������������� ���������� 
		
		if(sum == sum1) {
			
			System.out.println("����� ������ ����� ���������� �������������� ���������� !");
		}
		else {
			
			System.out.println("����� ������ ����� �� ���������� �������������� ���������� !");
		}
		
		System.out.println();
	}
	
	public static void task39() {
		
		System.out.println("39.  �  �����������  �����  ����������  �������  �����.  �����  ����������  "
				+ "�����  ��������  ��  7,  �� �������� �������� �����. ����� ��� �����. ");
		
		int n;
		
		for(n = 100; n <= 999; n++) {
			
			if(n == 7 * (n % 100)) {
				
				System.out.println("��� ����� " + n);
			}
		}
		
		System.out.println();
	}
	
	public static void task40() {
		
		System.out.println("40. �������� ��� �����, �� ����������� ��������� ����� N, ������� �������"
				+ " ��� ������� �� ��� ���� �����.");
		
		int n = 123;//������������ �����
		int a;
		int i;
		int x;
		int y;
		
		for(i = 1; i <= n; i++) {
			
			x = i;
			a = i;
			
			int b;
			int c = 1;
			
			int count = 0;
			
			while(a != 0) {
				
				count++; //������� ���������� ���� � �����
				
				b = a % 10;
				
				c = c * b; // ������� ������������ ��� ����
				
				a = a / 10;
			}
			
			if (c != 0) { //���� ������������ ����� 0 �� � ����� ���� ����� 0, �� ���� ������ ������
				
				int count1 = 0;
				
				while(x != 0) {
					
					y = x % 10;
					
					
					if(x % y == 0) {
						
						count1 ++;
						
					}
					
					x = x / 10;
				}
				
				if(count == count1) { // ���������� ���������� ���� � ����� � ���������� ���������
					
					System.out.println("��� ����� :" + i);
				}
			}
			else {
				
				System.out.println("� ����� ����� ���� ����� 0, �� 0 ������ ������: " + i);
			}
			
		}
		
		System.out.println();
	}
}
