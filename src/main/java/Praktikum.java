import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {

        /*String firstAndSecondName = "Тимоти Шаломе";
        Account account = new Account(firstAndSecondName);
        account.checkNameToEmboss();*/

        Scanner console = new Scanner(System.in);
        String firstAndSecondName = console.nextLine();
        Account account = new Account(firstAndSecondName);
        account.checkNameToEmboss();
    }
}

/*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
