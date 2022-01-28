import java.util.HashMap;
import java.util.Random;

public class Chernovik {
	public static Integer getNitroLevel(int nitroLevel) {
		// Пропишите логику по конвертации параметра nitroLevel
		if(nitroLevel!=0){

			return nitroLevel;}
		return null;

	}
	private static int generateInt(int from, int to) {
		int diapason = to - from;
		int offence = new Random().nextInt(diapason);
		return from + offence;
	}

	public static void main(String[] args) {
		System.out.println(getNitroLevel(10));

		float acceleration = generateInt(4, 10) / 10.0f;
		System.out.println(acceleration);
		HashMap<String, Double> orders = new HashMap<>();
		orders.put("Иван И.", 4345.5);
		orders.put("Ольга С.", 76564.43);
		orders.put("Александр Т.", 1234.86);
		orders.put("Александр Р.", 23432.87);
		orders.put("Екатерина О.", 1034753.6);
		orders.put("Ярослав В.", 450.0);
		orders.put("Сергей Ш.", 20000000.6);

		double sum =0.0; // Объявите переменную, где будет сохранена общая сумма
		for (Double i : orders.values()) { // Пройдитесь в цикле по значениям
			sum+=i;
		}

		System.out.println("Всего было совершено заказов на сумму: " + sum);

	}


}
