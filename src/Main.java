public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int [] salary = {200_000, 15_000, 35_000, 145_000, 85_000};
        int sum = 0;
         for (int i =0; i < salary.length; i++) {
             sum += salary[i];
         }
             System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();

        System.out.println("task 2");
        int Min = salary[0];
        int Max = salary[1];
        for (int i =0; i < salary.length; i++) {
            if (salary[i] > Max){
                Max = salary[i];
            }
            if (salary[i]< Min){
                Min = salary[i];
            }
        }
            System.out.println("Минимальная сумма трат за неделю составила " + Min + "рублей. Максимальная сумма трат за неделю составила " + Max + " рублей");
        System.out.println();

        System.out.println("task 3");
        int sumWeek = sum / salary.length;
        System.out.println("Средняя сумма трат за месяц составила " + sumWeek + " рублей");

        System.out.println();

        System.out.println("task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i =0; i < reverseFullName.length / 2; i++) {
            int leftIndex = i;
            int rightIndex = reverseFullName.length - i - 1;
            char temp = reverseFullName[leftIndex];
            reverseFullName[leftIndex] = reverseFullName[rightIndex];
            reverseFullName[rightIndex] = temp;
        }
        for (int i =0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }












    }
}