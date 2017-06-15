package week3.three;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Николай on 16.06.2017.
 * Строки. Ввод пароля.
 Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
 - длинна пароля должна быть от 8 до 20 символов
 - в пароле должны быть как маленькие так и большие буквы
 - должны быть цифры
 - не должен содержать слов 'password', 'pass', 'gfhjkm'
 - генерировать случайный пароль используя символы: a-z A-Z 0-9

 */
public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        String password1 = sc.nextLine();
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?!password|pass|gfhjkm).{8,20}");
        Matcher matcher = pattern.matcher(password);
        if(password.equals(password1) && matcher.matches() == true){
            System.out.println("true");
        } else {
            System.out.println("false");
            main(args);
        }
    }
}
