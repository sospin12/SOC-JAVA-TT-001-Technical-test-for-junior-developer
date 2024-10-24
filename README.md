## SOME TEST FOR JUNIOR JOBS

In order to practice for a junior programmer test, I decidesd to look for some resource from internet and practice them. 

## EXCESICES

The clas App contains 10 diffentet excersices:

- `e1InvertirString`: Reverse a string using conventional programming or using Class StringBuilder .reverse()'this is a StringBuilder mwthod' and .toString()'From stringBuilder to String'.  INPUT: String, OUTPUT: void, print the reversed string.

- `e2IsCapicua`: is capicua if the number is the same reversed. INPUT: int, OUTPUT: void, print if capicua or not. here I am using String.valueOf(number), to convert the int value to a String value, so I can apply te StringBuilder.reverse().toString() class an its methods. 

- `e3CountCharacterTimes`: this method count the number of times a character is ona String, INPUT: String, OUTPUT: void, print the character and the counter. here I defined a static array with length 256 to add 1 to the each postion any time the word aperas. charAt(i) return the char position from the string and adds every coincidense. them it only print the values different from cero.

- `e4Repetidos`: this method count the number of times a character is ona String, INPUT: String, OUTPUT: void, print the character and the counter. The differece e3CountCharacterTimes before ir that the only print the words that appear more than 1 time.

- `e5MultipeOf`: print if is mulple or not from a number, INPUT: int, int. OUTPUT: void, print the character and the counter.

- `e6LeapYear`: print if leap year or not, INPUT: int year. OUTPUT: boolean. I use Class LocalDate and methods .of() .isLeapYEar() - this method return false or true.

- `e7RandomOrderString`: randomice a string, INPUT: String. OUTPUT: void, print the randomice String. I use Class String and .split() to create a static array of strings, then convert this array to a list there fore I can use the Colletions(class) and .shuffle() to ramdomice the list. to print we use the method .forEach(System.out::print) into list.

- `e8NotDuplicateList`: return only the not duplicated numbers, INPUT: List<Integer> list. OUTPUT: void, print the set of integer without repeat it. Set class does not allow repeated numbers so we change from List class to Set class with HashSet<>(list), then print with .forEach().

- `e9CheckIfVouelIsPresent`: Check if a vowel is present if not return false, INPUT: string text. OUTPUT: void, print true or false. 

- `e10Palindromo`: Check if a string is palindrome, INPUT: string text. OUTPUT: void, print true or false.

## CONCLUSIONS

1. There is a big pack of Classes that allow me to make leaner prgrams and efficency optimiced.
2. I can instance the public class App, this is somehting I needed to reinforce.
3. To chage from int to String, String.valueOf(int) helpfu, and the other way aroud I use Integer.perseInt(String).