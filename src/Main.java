public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    /** Бухгалтеры попросили посчитать сумму всех выплат за месяц.
    * Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
    * «Сумма трат за месяц составила … рублей».
    */
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element: arr) {
            sum = sum + element;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей \n", sum);

    }
    /**  Также бухгалтерия попросила найти минимальную и максимальную трату за день.
    *  Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
    *  «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
    */
    public static void task2() {
            System.out.println("Задача 2");
            int[] arr = generateRandomArray();
            int maxArr = 1;
            int minArr = 200_001;
            for (int element: arr){
                if (element>maxArr) {
                    maxArr = element;
                }
            }
            for (int element: arr) {
                if (element<minArr) {
                    minArr = element;
                }
            }
            System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n", minArr, maxArr);
    }
    /**Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
    * Напишите программу, которая посчитает среднее значение трат за месяц
    * (то есть сумму всех трат за месяц поделить на количество дней),
    * и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
    * Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
     */
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element: arr) {
            sum = sum + element;
        }
        float middle = (float)sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей");
    }
    /**В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться
     * в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся
     * в виде массива символов — char[ ].
     * Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
     * В качестве данных для массива используйте:
     * char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
     * В результате в консоль должно быть выведено: Ivanov Ivan.
     */
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            int place = reverseFullName.length - i;
            System.out.print(reverseFullName[place -1]);
        }
    }
}