import java.util.Scanner;

public class Shopping {
    public static void main(String[] args){
        System.out.println("Вас приветствует список покупок!");
        
        String[] shoppingList = new String[7];
        
        Scanner scanner = new Scanner(System.in);
        
        int productCount = 0;
        while (true){
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1){

                    for (int i = 0; i < shoppingList.length; i++) {
                        String productName = scanner.next();
                        shoppingList[i] = productName;
                        System.out.println("Товар " + shoppingList[i] + " добавлен в список под номером " + (productCount + 1));
                        productCount = productCount + 1;
                        shoppingList[productCount] = shoppingList[i];
                        break;
                    }


            } else if (actionNumber == 2) {

                for(int j = 0; j < productCount; j++){
                    System.out.println((j + 1) + ". " + shoppingList[j]);
                }

            } else if (actionNumber == 3) {

                for(int k = 0; k < shoppingList.length; k++){
                    shoppingList[k] = null;
                    productCount = 0;
                }


            } else if (actionNumber == 4){

                break;

            } else {
                System.out.println("Неизвестная команда!");
            }

        }
    }
}
