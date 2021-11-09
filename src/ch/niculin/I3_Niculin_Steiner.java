package ch.niculin;
import java.util.*;

public class I3_Niculin_Steiner {
    public static void main(String[] args) {
        toMorse();
        toAlphabet();
    }

    private static void toMorse() {
        Map<Character, String> alphabet = new HashMap<>();
        alphabet.put('A', "·–");
        alphabet.put('B', "–···");
        alphabet.put('C', "–·–·");
        alphabet.put('D', "–··");
        alphabet.put('E', "·");
        alphabet.put('F', "··–·");
        alphabet.put('G', "––·");
        alphabet.put('H', "····");
        alphabet.put('I', "··");
        alphabet.put('J', "·–––");
        alphabet.put('K', "–·–");
        alphabet.put('L', "·–··");
        alphabet.put('M', "––");
        alphabet.put('N', "–·");
        alphabet.put('O', "–––");
        alphabet.put('P', "·––·");
        alphabet.put('Q', "––·–");
        alphabet.put('R', "·–·");
        alphabet.put('S', "···");
        alphabet.put('T', "–");
        alphabet.put('U', "··–");
        alphabet.put('V', "···–");
        alphabet.put('W', "·––");
        alphabet.put('X', "–··–");
        alphabet.put('Y', "–·––");
        alphabet.put('Z', "––··");
        alphabet.put('1', "·––––");
        alphabet.put('2', "··–––");
        alphabet.put('3', "···––");
        alphabet.put('4', "····–");
        alphabet.put('5', "·····");
        alphabet.put('6', "–····");
        alphabet.put('7', "––···");
        alphabet.put('8', "–––··");
        alphabet.put('9', "––––·");
        alphabet.put('0', "–––––");
        alphabet.put(' ', "/");
        alphabetAusgeben(alphabet);
        System.out.println("Gebe Text ein: ");
        String eingabeText = new Scanner(System.in).nextLine();
        String gross = eingabeText.toUpperCase(Locale.ROOT);

        char[] ch = gross.toCharArray();

        int counter = 0;

        for (int c = counter; c < ch.length; c++) {

            for (Map.Entry<Character, String> eintrag : alphabet.entrySet()) {
                Character normal = eintrag.getKey();
                String morse = eintrag.getValue();
                if (normal == ch[c]) {
                    System.out.print(morse + " ");
                    counter++;
                    break;
                }
            }
        }
    }

    private static void alphabetAusgeben(Map<Character, String> alphabet) {
        for (Map.Entry<Character, String> eintrag : alphabet.entrySet()) {
            Character character = eintrag.getKey();
            String string = eintrag.getValue();
            System.out.println(character + " -> " + string);
        }
    }

    public static void toAlphabet() {
        Map<String, Character> alphabet2 = new HashMap<>();
        alphabet2.put( "·–",'A');
        alphabet2.put( "–···", 'B');
        alphabet2.put( "–·–·", 'C');
        alphabet2.put( "–··", 'D');
        alphabet2.put( "·", 'E');
        alphabet2.put( "··–·", 'F');
        alphabet2.put( "––·", 'G');
        alphabet2.put( "····", 'H');
        alphabet2.put( "··", 'I');
        alphabet2.put( "·–––", 'J');
        alphabet2.put( "–·–", 'J');
        alphabet2.put( "·–··", 'L');
        alphabet2.put( "––", 'M');
        alphabet2.put( "–·", 'N');
        alphabet2.put( "–––", 'O');
        alphabet2.put( "·––·", 'P');
        alphabet2.put( "––·–", 'Q');
        alphabet2.put( "·–·", 'R');
        alphabet2.put( "···", 'S');
        alphabet2.put( "–", 'T');
        alphabet2.put( "··–", 'U');
        alphabet2.put( "···–", 'V');
        alphabet2.put( "·––", 'W');
        alphabet2.put( "–··–", 'X');
        alphabet2.put( "–·––" ,'Y');
        alphabet2.put( "––··", 'Z');
        alphabet2.put( "·––––", '1');
        alphabet2.put( "··–––", '2');
        alphabet2.put( "···––", '3');
        alphabet2.put( "····–", '4');
        alphabet2.put( "·····", '5');
        alphabet2.put( "–····", '6');
        alphabet2.put( "––···", '7');
        alphabet2.put( "–––··", '8');
        alphabet2.put( "––––·", '9');
        alphabet2.put( "–––––", '0');
        alphabet2.put( " ", ' ');
        alphabet2.put( "/", ' ');


        System.out.println("\nGebe Text in Morsezeichen ein: ");
        String eingabeText = new Scanner(System.in).nextLine();
        String[] strings = eingabeText.split(" ");
        int counter = 0;

        for (int c = counter; c < strings.length; c++) {

            for (Map.Entry<String, Character> eintrag : alphabet2.entrySet()) {
                String morse = eintrag.getKey();
                Character normal = eintrag.getValue();
                if (morse.equals(strings[c])) {
                    System.out.print(normal);
                    counter++;
                    break;
                }
            }
        }
    }
}
