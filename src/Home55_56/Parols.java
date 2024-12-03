package Home55_56;

import java.util.Arrays;

public class Parols {
    public static void main(String[] args) {
        String[] password = new String[7];
        password[0] = "MyPassword123";
        password[1] = "ffffff66";
        password[2] = "ShlechtPass";
        password[3] = "aSdf3h";
        password[4] = "avalanche gt2020";
        password[5] = "RRR";
        password[6] = "Ra2Ra2Ra2";
        System.out.println(Arrays.toString(password));
        checkPassword(password[0]);
        System.out.println();
        checkPassword(password[1]);
        System.out.println();
        checkPassword(password[2]);
        System.out.println();
        checkPassword(password[3]);
        System.out.println();
        checkPassword(password[4]);
        System.out.println();
        checkPassword(password[5]);
        System.out.println();
        checkPassword(password[6]);

    }

    private static void checkPassword(String parol) {
        System.out.println("Пароль " + parol);
        boolean passwordLenght = parol.length() <= 7 || parol.length() > 20;
        if (passwordLenght) {
            System.out.println("Пароль должен быть длиной от 8 до 20 символов");

        }
        char[] password = parol.toCharArray();

        boolean passwordUpeerCase = true;

        for (char ch : password) {
            if (Character.isUpperCase(ch)) {
                passwordUpeerCase = false;

            }
        }
        if (passwordUpeerCase) {
            System.out.println("Пароль должен содержать хотя бы одну заглавную букву");
        }
        boolean passwordLowercase = true;

        for (char ch : password) {
            if (Character.isLowerCase(ch)) {
                passwordLowercase = false;

            }
        }
        if (passwordLowercase) {
            System.out.println("Пароль должен содержать хотя бы одну строчную букву");
        }
        boolean passwordIsLetter = true;

        for (char ch : password) {
            if (!Character.isLetter(ch)) {
                passwordIsLetter = false;

            }

        }
        if (passwordIsLetter) {
            System.out.println("Пароль должен содержать хотя бы одну цифру.");
        }
        boolean passwordCheckSpace = true;
        for (char ch : password) {
            if (ch == ' ') {
                passwordCheckSpace = false;
            }
        }
        if (!passwordCheckSpace) {
            System.out.println("Пароль не должен содержать пробелов.");
        }
        if (!passwordLenght & !passwordUpeerCase & !passwordLowercase  & !passwordIsLetter & passwordCheckSpace) {
            System.out.println("Пароль подходит " );
        }
    }


}
