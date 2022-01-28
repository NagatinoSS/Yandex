package FinansAppVer4;

import java.util.ArrayList;
import java.util.HashMap;


public class ExpensesManager {
	HashMap<String, ArrayList<Double>> expensesByCategories;

	ExpensesManager() {
		expensesByCategories = new HashMap<>();
	}

	double saveExpense(double moneyBeforeSalary, String category, double expense) {
		moneyBeforeSalary = moneyBeforeSalary - expense;
		System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
		if (expensesByCategories.containsKey(category)) {
			ArrayList<Double> expenses = expensesByCategories.get(category);
			expenses.add(expense);
		} else {
			ArrayList<Double> expenses = new ArrayList<>();
			expenses.add(expense);
			expensesByCategories.put(category, expenses);
		}
		if (moneyBeforeSalary < 1000) {
			System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
		}
		return moneyBeforeSalary;
	}

	void printAllExpensesByCategories() {
		for (String category : expensesByCategories.keySet()) {
			System.out.println(category);
			ArrayList<Double> expenses = expensesByCategories.get(category);
			for (Double expense : expenses) {
				System.out.println(expense);
			}
		}
	}

	double findMaxExpenseInCategory(String category) {
		double maxExpense = 0;
		if (expensesByCategories.containsKey(category)) {
			ArrayList<Double> expenses = expensesByCategories.get(category);
			for (Double expense : expenses) {
				if (expense > maxExpense) {
					maxExpense = expense;
				}
			}
		} else {
			System.out.println("Такой категории пока нет.");
		}
		return maxExpense;
	}

	void removeAllExpenses() {
		expensesByCategories.clear();
		System.out.println("Траты удалены.");
	}

	// Напишите метод для получения суммы всех трат
	double getExpensesSum() {
		double sum = 0;
		for (ArrayList<Double> exp : expensesByCategories.values()) { //обход по значениям
			for (double d : exp) {
				sum += d;
			}
		}
		return sum;

	}

	// Напишите метод для удаления категории
	void removeCategory(String remove){
		if(expensesByCategories.containsKey(remove)){
			expensesByCategories.remove(remove);
		}
	}


	 // Напишите метод для получения категории, где размер трат больше всего
	// Используйте эти переменные для сохранения промежуточных значений
	 String getMaxOrderCustomerName() {
		 double maxCategorySum = 0;
		 String maxCategoryName = "";
		/*for (String s : expensesByCategories.keySet()) {
			ArrayList<Double> expenses = expensesByCategories.get(s);
			double sum = 0;
			for (Double d: expenses){
				sum+=d;
			}
			if (sum>maxCategorySum){
				maxCategorySum=sum;
				maxCategoryName = s;
			}
		}*/
		 // Здесь должен быть обход по значениям
		 for (String s : expensesByCategories.keySet()) {
			 double sum = 0;
			 for (double orderPrice : expensesByCategories.get(s)) {
				 sum += orderPrice;
			 }
			 if (sum > maxCategorySum) {
				 maxCategorySum = sum;
				 maxCategoryName = s;
			 }
		 }

		 return maxCategoryName;
	 }



}