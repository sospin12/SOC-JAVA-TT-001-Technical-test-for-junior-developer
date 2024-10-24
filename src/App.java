import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    // INVERTIR UNA CADENA
    private void e1InvertirString(String str) {

        /*
         * String[] array = str.split("");
         * String str2 = new String();
         * 
         * for (int i = 0; i < array.length; i++) {
         * str2 += array[array.length-1-i];
         * str2 = str2.toUpperCase();
         * }
         * System.out.println(str2);
         * }
         */

        // metodo disponible desde java 5
        String newString = new StringBuilder(str).reverse().toString();
        System.out.println(newString);
    }

    // CAPICUA NUMBER
    private void e2IsCapicua(int number) {
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if (numberText.equals(reverseNumber)) {
            System.out.println("Is capicua");
        } else {
            System.out.println("Not capicua");
        }

    }

    // murcielago-------CONTAR CARACTERES
    // m=1, u=1, r=1, c=1, i=1, e=1, l=1, a=1, g=1, o=1
    private void e3CountCharacterTimes(String text) {
        int i, length, counter[] = new int[256];

        length = text.length();

        for (i = 0; i < length; i++) {
            counter[text.charAt(i)]++;
        }

        for (int j = 0; j < 256; j++) {
            if (counter[j] != 0) {
                System.out.println((char) j + ": " + counter[j]);
            }
        }
    }

    // solo improme los caracteres repetido, que hayan mas de uno
    private void e4Repetidos(String text) {
        int i, length, counter[] = new int[256];

        length = text.length();

        for (i = 0; i < length; i++) {
            counter[text.charAt(i)]++;
        }

        for (int j = 0; j < 256; j++) {
            if (counter[j] > 1) {
                System.out.println((char) j + ": " + counter[j]);
            }
        }
    }

    // esmultipo de un numero
    public void e5MultipeOf(int num, int n) {
        if (num % n == 0) {
            System.out.println("Es multiplo.");
        } else {
            System.out.println("No es multiplo");
        }
    }

    // si es biciesto o no
    public boolean e6LeapYear(int year) {
        return LocalDate.of(year, 1, 1).isLeapYear();
    }

    // desordenar una cadena de texto
    public void e7RandomOrderString(String text) {
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::print);
    }

    public void e8NotDuplicateList(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::print);
    }

    public void e9CheckIfVouelIsPresent(String text) {
        /*
         * String[] array = text.split("");
         * boolean isPresent = false;
         * for (String s : array) {
         * if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o")
         * || s.equals("u")) {
         * isPresent = true;
         * break;
         * }
         * }
         * System.out.println(isPresent);
         */

        System.out.println(text.matches(".*[aeiou].*"));

        boolean result = Arrays.asList(text.split("")).stream()
                .anyMatch(s -> s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"));
        System.out.println(result);
    }

    private void e10Palindromo(String text){
        boolean result  = true;
        int length = text.length();

        for (int i = 0; i < length/2; i++) {
            if (text.charAt(i)!=text.charAt(length-i-1)){
                result = false;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        // app.e1InvertirString("santiago");
        // app.e2IsCapicua(456);
        // app.e3CountCharacterTimes("muercielago");
        // app.e4Repetidos("murcielagmuerlago");
        // app.e5MultipeOf(10, 2);
        // System.out.println((app.e6LeapYear(2025))? "Is leap year":"Not leap year");
        // app.e7RandomOrderString("santiago");
        // app.e8NotDuplicateList(Arrays.asList(1,2,3,4,5,5,6,6,7,7));
        // app.e9CheckIfVouelIsPresent("sntg");
        app.e10Palindromo("oro");
    }
}
