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
		
		System.out.println("Введите число: \r");
		
		while(!in.hasNextInt()) {
			
			in.next();
			
			System.out.println("Некорректный ввод!\r ");
			System.out.println("Введите число: \r");
		}
		number = in.nextInt();
	
		return number;
		
	}

	public static double scannerDouble() {
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		double number;
	
		System.out.println("Введите число: \r");
	
		while(!in.hasNextDouble()) {
		
			in.next();
		
			System.out.println("Некорректный ввод! \r");
			System.out.println("Введите число: \r");
		}
	
		number = in.nextDouble();
	
		return number;
	
	}

	public static String scannerString() {
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		String symbol;
	
		System.out.println("Введите символ: \r");
	
		while(!in.hasNextLine()) {
		
			in.next();
		
			System.out.println("Некорректный ввод! \r");
			System.out.println("Введите символ (+, -, /, *) : \\r");
		}
		symbol = in.nextLine();
	
		return symbol;
	}
	
	public static void task01() {
		
		System.out.println("1. Необходимо вывести на экран числа от 1 до 5.");
		
		int i;
		
		for(i = 1; i <= 5; i++) {
			
			System.out.print(i);
			
		}
		System.out.println();
	}
	
	public static void task02() {
		
		System.out.println("2. Необходимо вывести на экран числа от 5 до 1. ");
		
		int i;
		
		for(i = 5; i >= 1; i--) {
			
			System.out.print(i);
		}
		
		System.out.println();
	}
	
	public static void task03() {
		
		System.out.println("3. Необходимо вывести на экран таблицу умножения на 3: ");
		
		int i;
		int x;
		
		i = 1;
		
		while(i <= 9) {
			
			x = i * 3;
			
			System.out.println("3 умножить на " + i + " равно " + x);
			
			i++;
		}
		
		System.out.println();
	}
	
	public static void task04() {
		
		System.out.println("4. С помощью оператора while напишите программу вывода всех четных чисел в"
				+ " диапазоне от 2 до 100 включительно.");
		
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
		
		System.out.println("5.  С  помощью  оператора  while  напишите  программу  определения  суммы  "
				+ "всех  нечетных  чисел  в диапазоне от 1 до 99 включительно. ");
		
		int i = 1;
		int x = 0;
		
		while(i <= 99) {
			
			if(i % 2 != 0) {
				
				x = x + i;		
				
			}
			
			i++;
		}
		
		System.out.println("Сумма нечетных числел от 1 до 99 равна " + x);
		
		System.out.println();
	}
	
	public static void task06() {
		
		System.out.println("6.  Напишите  программу,  где  пользователь  вводит любое  целое  "
				+ "положительное  число. А  программа суммирует все числа от 1 до введенного "
				+ "пользователем числа.");
		
		int a = scannerInt();
		int x = 0;
		int i = 1;
		
		while(i <= a) {
			
			x = x + i;
			
			i++;
		}
		
		System.out.println("Сумма чисел от 1 до " + a + " равна " + x);
		
		System.out.println();
	}
	
	public static void task07() {
		
		System.out.println("7. Вычислить значения функции на отрезке [а,b] c шагом h: y = x , при x > 2 и y = -x, при x <= 2 ");
		
		double a;//начальная точка отрезка
		double b;//конечная точка отрезка
		double h;// шаг
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
		
		System.out.println("Введен отрезок [ " + a + " , " + b +  " ] с шагом " + h);
		
		double i = a;
		
		while(i <= b) {
			
			if(i <= 2) {
			
				y = -i;
				
				System.out.println("значение функции y в точке " + i + " равно " + y);
			}
			
			if(i > 2) {
			
				y = i;
				
				System.out.println("значение функции y в точке " + i + " равно " + y);
			}
		i = i + h;
			
		}
		
		System.out.println();
	}
	
	public static void task08() {
		
		System.out.println("8. Вычислить значения функции на отрезке [а,b] c шагом h: "
				+ "y = (x + c) * 2, если x = 15 и y = (x - c) + 6, если x не равен 15.");
		
		double a;//начальная точка отрезка
		double b;//конечная точка отрезка
		double h;// шаг
		double c;
		double y;
		
		a = -25;
		b = 25;
		c = 2;
		h = 5;
		
		System.out.println("Введен отрезок [ " + a + " , " + b +  " ] с шагом " + h);
		
		double i = a;
		
		while(i <= b) {
			
			if(i != 15) {
			
				y = (i - c) + 6;
				
				System.out.println("значение функции y в точке " + i + " равно " + y);
			}
			
			else {
				
				y = (i + c) * 2;
				
				System.out.println("значение функции y в точке " + i + " равно " + y);
				
			}
			
		i = i + h;
			
		}
		
		System.out.println();
	}
	
	public static void task09() {
		
		System.out.println(" Найти сумму квадратов первых ста чисел.");
		
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
		System.out.println("Сумма квадратов первых ста чисел равна " + y);
		
		System.out.println();
		
	}
	
	public static void task10() {
		
		System.out.println("10. Составить программу нахождения произведения квадратов первых двухсот чисел. ");
		
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
		System.out.println("Произведение квадратов первых двухсот чисел равна " + y);
		
		System.out.println();
	}
	
	public static void task11() {
		
		System.out.println("11. Составить программу нахождения разности кубов первых двухсот чисел ");
		
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
		System.out.println("Разность кубов первых двухсот чисел равна " + y);
		
		System.out.println();
		
	}
	
	public static void task12() {
		
		System.out.println("12.  Последовательность  An строится  так:  A1 =  1,  An = 6 + An-1 ,  "
				+ "для  каждого  n  > 1  Составьте  программу нахождения произведения первых 10 членов"
				+ " этой последовательности.\n");
		
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
		
		System.out.println("Произведение первых 10 членов равно " + y);
		
		System.out.println();
	}
	
	public static void task13() {
		
		System.out.println("13. Составить таблицу значений функции y = 5 - (x^2/2) на отрезке [-5; 5] "
				+ "с шагом 0.5.");
		
		double a;//начальная точка отрезка
		double b;//конечная точка отрезка
		double h;// шаг
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
				
		double i = a;
		
		while(i <= b) {
			
			
				y = 5 - (Math.pow(i, 2) / 2);
				
				System.out.println("значение функции y в точке " + i + " равно " + y);
			
				i = i + h;
			
		}
		
		System.out.println();
		
	}
	
	public static void task14() {
		
		System.out.println("14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n. ");
		
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
		
		System.out.println("Если n = " + n + " выражение равно " + x);
		
		System.out.println();
	}
	
	public static void task15() {
		
		System.out.println("15. Вычислить : 1+2+4+8+...+ 32 в 10 степени.");
		double y;
		int i = 1;
		int x = 0;
		
		while(i <= 32) {
				
				x = x + i;		
			
			i = i * 2;
		}
		
		y = Math.pow(x, 10);
		
		System.out.println("1+2+4+8+...+ 32 в 10 степени равно " + y);
		
		System.out.println();
	}
	
	public static void task16() {
		
		System.out.println("16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).");
		
		int i = 3;
		int x = 3;
		double y = 3;
		
		while(i <= 10) {
			
			x = x + i;
			
			y = y * x;
			
			i++;
		}
		
		
		System.out.println("(1+2)*(1+2+3)*...*(1+2+...+10) равно " + y);
		
		System.out.println();
	}
	
	public static void task17() {
		
		System.out.println("17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)");
		
		int a = 1;//произвольное значение
		int n = 4;//произвольное значение
		int x;
		int y = 1;
		int i = 0;
		while(i <= (n - 1)) {
			
			x = a + i;
			
			y = y * x;
			
			i++;
		}
		
		
		System.out.println(" a(a+1)...(a+n-1) равно " + y);
		
		System.out.println();
	}
	
	public static void task18() {
		
		System.out.println("18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, "
				+ "модуль которых больше или равен заданному е. Общий член ряда имеет вид:"
				+ " An = ((-1)^n-1) / n");
		
		double x;
		double a;//член ряда An
		double e = -50;//некоторое число е
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
		
		System.out.println("Сумма членов ряда модуль которых больше или равен е составляет " + y);
		
		System.out.println();
		
	}
	
	public static void task19() {
		
		System.out.println("19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,"
				+ " модуль которых больше или равен заданному е. "
				+ "Общий член ряда имеет вид: An = (1 / 2^n) + (1 / 3^n)");
		
		double x;
		double a;//член ряда An
		double e = -30;//некоторое число е
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
		
		System.out.println("Сумма членов ряда модуль которых больше или равен е составляет " + y);
		
		System.out.println();
	}
	
	public static void task20() {
		
		System.out.println("20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,"
				+ " модуль которых больше или равен заданному е. Общий член ряда имеет вид:"
				+ " An = 1 / ((3*n - 2) * (3*n + 1)). ");
		
		double x;
		double a;//член ряда An
		double e = -20;//некоторое число е
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
		
		System.out.println("Сумма членов ряда модуль которых больше или равен е составляет " + y);
		
		System.out.println();
	}
	
	public static void task21() {
		
		System.out.println("21. Составить программу для вычисления значений функции  "
				+ "F(x) на отрезке [а, b] с шагом h. Результат \r\n" + 
				"представить в виде таблицы, первый столбец которой – значения  аргумента, "
				+ "второй - соответствующие \r\n" + 
				"значения функции: F(x) = x - sin(x).");
		
		double a;//начальная точка отрезка
		double b;//конечная точка отрезка
		double h;// шаг
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
		
		System.out.println("Введен отрезок [ " + a + " , " + b +  " ] с шагом " + h);
		
		double i = a;
		
		System.out.println();
		System.out.println("Значение Х ------ Значение F(x)");
		System.out.println();
		
		while(i <= b) {
			
			y = i - Math.sin(i);
				
			System.out.println(" x " + i + "  ------  " + y);
	
			i = i + h;
			
		}
		
		System.out.println();
	}
	
	public static void task22() {
		
		System.out.println("22. Составить программу для вычисления значений функции  F(x) на отрезке [а, b]"
				+ " с шагом h. Результат представить в виде таблицы, первый столбец которой –"
				+ " значения  аргумента, второй - соответствующие значения функции: F(x) = sin^2(x).");
		
		double a;//начальная точка отрезка
		double b;//конечная точка отрезка
		double h;// шаг
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
		
		System.out.println("Введен отрезок [ " + a + " , " + b +  " ] с шагом " + h);
		
		double i = a;
		
		System.out.println();
		System.out.println("Значение Х ------ Значение F(x)");
		System.out.println();
		
		while(i <= b) {
			
			y = Math.pow(Math.sin(i), 2);
				
			System.out.println(" x " + i + "  ------  " + y);
	
			i = i + h;
			
		}
		
		System.out.println();
	}
	
	public static void task23() {
		
		System.out.println("23. Составить программу для вычисления значений функции  F(x) на отрезке [а, b]"
				+ " с шагом h. Результат представить в виде таблицы, первый столбец которой – "
				+ "значения  аргумента, второй - соответствующие значения функции: F(x) = ctg(x/3) + 1/2sin(x).");
		
		double a;//начальная точка отрезка
		double b;//конечная точка отрезка
		double h;// шаг
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
		
		System.out.println("Введен отрезок [ " + a + " , " + b +  " ] с шагом " + h);
		
		double i = a;
		
		System.out.println();
		System.out.println("Значение Х ------ Значение F(x)");
		System.out.println();
		
		while(i <= b) {
			
			y = (1 / Math.tan(i / 3)) + (1 /(2 * Math.sin(a)));
				
			System.out.println(" x " + i + "  ------  " + y);
	
			i = i + h;
			
		}
		
		System.out.println();
	}
	
	public static void task24() {
		
		System.out.println("24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав."
				+ " Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по"
				+ " сравнению с введенным числом. ");
		
		int n = scannerInt();
		double x;
		int z = n;
		double y = 0;
		
		System.out.println("Вы ввели : " + n);
		
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
		
		System.out.println("\nСумма четных цифр введенного числа  равна " + y);
		
		System.out.println("Число в обратном порядке равно " + a);
		
		System.out.println();
	}
	
	public static void task25() {
		
		System.out.println("25. Требуется определить факториал числа, которое ввел пользователь.");
		
		double a = scannerInt();
		int i = 1;
		double x = 1;
		
		while(i <= a) {
			
			x = x * i;
			
			i++;
		}
		
		System.out.println("Факториал числа " + a + " равен " + x);
		
		System.out.println();
	}
	
	public static void task26() {
		
		System.out.println("26. Вывести  на  экран  соответствий  между  символами  и  их  численными"
				+ "  обозначениями  в  памяти компьютера (Таблицу ASCII).");
		
		double i = 0;
		
		char ch;
		
		while(i <= 255) {
			
			ch = (char) i;
			
			System.out.println("Символ--- " + ch + " соответствует числовому коду " + i);
			
			i++;
		}
		
		System.out.println();
		
	}
	
	public static void task27() {
		
		System.out.println("27. Для каждого натурального числа в промежутке от m до n вывести все делители,"
				+ " кроме единицы и самого числа. m и n вводятся с клавиатуры. ");
		
		double m = scannerInt();
		double n = scannerInt();
		int x = 0;
		
		while(m <= n) {
			
			System.out.println("Делители числа " + m);
			System.out.println("1 и " + m);
			
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
		
		System.out.println("28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить \r\n" + 
				"результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а \r\n" + 
				"также  на  ввод  Y=0  при  делении.  Организовать  возможность  многократных  вычислений  без \r\n" + 
				"перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять \r\n" + 
				"‘0’. ");
		
		for(;;) {
			
			System.out.println("Введите значение Х: ");
			
			double x = scannerDouble();
			
			System.out.println("Введите значение Y: ");
			
			double y = scannerDouble();
		
			System.out.println("Введите символ операции (+, -, /, *) :");
		
			String str = scannerString();
			
			System.out.println("Вы ввели " + x + " " + str + " " + y);
		
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
						System.out.println("На ноль делить нельзя!");
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
					
					System.out.println("Вы ввели не существующую операцию. Попробуйте еще раз!");
			}
			
			System.out.println("Значение выражения равно \n " + z);
			
			System.out.println("Продолжить выполнение программы ? Да---1 / Нет---0 : ");
			
			String str1 = scannerString();
			
			if( str1.equals("0")) {
				
				break;
			}
			
		}
		
		System.out.println();
	}
	
	public static void task29() {
		
		System.out.println("29. Даны два числа. Определить цифры, входящие в запись как первого "
				+ "так и второго числа.");
		
		int a;
		int b;
		int x;
	
		a = 23654;//произвольное значение
		b = 12345;//произвольное значение
		
		String str1 = String.valueOf(b);
		
		System.out.println("В состав первого и второго числа входят цифры ");
		
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
		
		System.out.println("30. Написать программу, переводящую римские цифры в арабские. ");
		
		int i = 0;
		String roman[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	
		while(i <= roman.length-1) {
			
			System.out.println("Арабская цифра " + i + " соответствует римской " + roman[i]);
			
			i++;
		}
		
		System.out.println();
	}
	
	public static void task31() {
		
		System.out.println("31.  Компьютер  генерирует  пять  чисел  в  диапазоне  от  1  до  15  "
				+ "включительно.  Человек  пытается  их угадать.  "
				+ "Программа  должна  выводить  угаданные  и  неугаданные  числа  из  тех,  что "
				+ " сгенерировала программа, а также ошибочные числа пользователя. ");
		
	
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
					
					System.out.println("Ура!Вы угадали цифру " + a);
				}
				
				if(x == b) {
					
					System.out.println("Ура!Вы угадали цифру " + b);
				}
				
				if(x == c) {
					
					System.out.println("Ура!Вы угадали цифру " + c);
				}
				
				if(x == d) {
					
					System.out.println("Ура!Вы угадали цифру " + d);
				}
				
				if(x == e) {
					
					System.out.println("Ура!Вы угадали цифру " + e);
				}
				
				user [i] = x;
				
				i++;
				
			}
				System.out.println("Числа предложенные игроком " );
			
				for(i = 0; i < 5; i++) {
				
					System.out.print(user[i] + " \\ ");
				}
				
			System.out.println("\nЧисла загаданные компьютером \n" + a + " \\ " + b + " \\ " + c + " \\ " + d + " \\ " + e + " \\ ");
			System.out.println();
	}
	
	public static void task32() {
		
		System.out.println("32.  Проверить  введенную  пользователем  строку  на  наличие  недопустимых"
				+ "  символов.  В  качестве первого  символа  допустимы  только  буквы  и  знак  "
				+ "подчеркивания.  Остальные  символы  могут  быть буквами, цифрами и знаком подчеркивания.");
		
		String str = scannerString();
		
		Pattern pattern = Pattern.compile("([a-zA-Z_])\\w*");
		
        Matcher matcher = pattern.matcher(str);
        
		boolean result1 = matcher.matches();
		
		if(result1 == true) {
			
			System.out.println("Вы правильно ввели строку");
		}
		else {
			
			System.out.println("Не корректный ввод. В качестве первого символа допустимы только "
					+ "буквы и знак подчеркивания. Остальные  символы  могут  быть буквами, цифрами "
					+ "и знаком подчеркивания.");
		}
		
		System.out.println();
		
		System.out.println(str);
	}
	
	public static void task33() {
		
		System.out.println("33. Найдите наибольшую цифру данного натурального числа.");
		
		int n = scannerInt();
		
		System.out.println("Вы ввели " + n);
		
		int num = n;
		
		int x;
		
		int count = (num == 0) ? 1 : 0;
		
        while (num != 0) {
        	
            count++;
            
            num = num / 10;
        }
        
        System.out.println("Количество цифр " + count);
        
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
		
        System.out.println("Наибольшая цифра в числе  равна " + max);
        
        System.out.println();
    }
	
	public static void task34() {
		
		System.out.println("34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15. ");
		
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
		
		System.out.println("35. Найдите количество четных цифр данного натурального числа.");
		
		int n = scannerInt();
		
		int x;
		
		System.out.println("Введенное значениие " + n);
		
		int count = (n == 0) ? 1 : 0;
		
		while(n != 0) {
			
			x = n % 10;
			
			if(x % 2 == 0) {
				
				count++;
			}
			
			n = n / 10;
		}
		
		System.out.println("Количество четных чисел " + count);
		
		System.out.println();
	}
	
	public static void task36() {
		
		System.out.println("36.  Два  двузначных  числа,  записанных  одно  за  другим  ,  образуют  "
				+ "четырёхзначное  число,  которое делится на их произведение. Найти эти числа. ");
		
		int a;
		int b;
		int ab;
		
		for(a = 10; a <= 99; a++) {
			
			for(b = 10; b <= 99; b++) {
				
				ab = a * 100 + b;
				
				if(ab % (a * b) == 0) {
					
					System.out.println("Число " + a + " и " + b);
				}
			}
		}
		
		System.out.println();
	}
	
	
	public static void task37() {
		
		System.out.println("37. Даны два двузначных числа А и В. Из этих чисел составили 2 "
				+ "четырехзначных числа: первое число получили путем написания сначала числа А, затем В."
				+ " Для получения второго числа сначала записали число В, затем А. Найти числа А и В "
				+ "если известно , что первое четырехзначное число нацело делится на 99, а второе на 49. ");
		
		int a;
		int b;
		int ab;
		int ba;
		
		for(a = 10; a <= 99; a++) {
			
			for(b = 10; b <= 99; b++) {
				
				ab = a * 100 + b;
				ba = b * 100 + a;
				
				if((ab % 99 == 0) && (ba % 49 == 0)) {
					
					System.out.println("Число " + a + " и " + b);
				}
			}
		}
		
		System.out.println();
	}
	
	public static void task38() {
		
		System.out.println("38.  Для  заданного  натурального  числа  определить,  образуют  ли "
				+ " его  цифры  арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр."
				+ " Например: 1357, 963.");
		
		int n = 1357;
		
		int num = n;
		
		int x;
		
		int count = 0;
		
		while(num != 0) { // находим количество цифр в числе
			
			x = num % 10;
			
			count++;
			
			num = num / 10;
		}
		
		int [] element = new int [count]; // создаем массив размером равным количеству цифр числа
		
		int i = 0;
		
		while(i < count) { // заполняем массив цифрами числа
			
			x = n % 10;
			
			element[i] = x;
			
			n = n / 10;
			
			i++;
		}
		
		int sum = 0;
		
		for(int j = 0; j < count; j++) { //находим сумму цифр числа
			
	        sum = sum + element[j];
	    }
		
		int sum1 = ((element[0] + element[count - 1]) / 2) * count; // сумма n членов арефметической прогрессии 
		
		if(sum == sum1) {
			
			System.out.println("Цифры вашего числа составляют арефметическую прогрессию !");
		}
		else {
			
			System.out.println("Цифры вашего числа не составляют арефметическую прогрессию !");
		}
		
		System.out.println();
	}
	
	public static void task39() {
		
		System.out.println("39.  В  трехзначном  числе  зачеркнули  старшую  цифру.  Когда  полученное  "
				+ "число  умножили  на  7,  то получили исходное число. Найти это число. ");
		
		int n;
		
		for(n = 100; n <= 999; n++) {
			
			if(n == 7 * (n % 100)) {
				
				System.out.println("Это число " + n);
			}
		}
		
		System.out.println();
	}
	
	public static void task40() {
		
		System.out.println("40. Получить все числа, не превышающие заданного числа N, которые делятся"
				+ " без остатка на все свои цифры.");
		
		int n = 123;//произвольное число
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
				
				count++; //считаем количество цифр в числе
				
				b = a % 10;
				
				c = c * b; // находим произведение его цифр
				
				a = a / 10;
			}
			
			if (c != 0) { //если произведение равно 0 то в числе есть цифра 0, на ноль делить нельзя
				
				int count1 = 0;
				
				while(x != 0) {
					
					y = x % 10;
					
					
					if(x % y == 0) {
						
						count1 ++;
						
					}
					
					x = x / 10;
				}
				
				if(count == count1) { // сравниваем количество цифр в числе и количество делителей
					
					System.out.println("Это число :" + i);
				}
			}
			else {
				
				System.out.println("У этого числа есть цифра 0, на 0 делить нельзя: " + i);
			}
			
		}
		
		System.out.println();
	}
}
