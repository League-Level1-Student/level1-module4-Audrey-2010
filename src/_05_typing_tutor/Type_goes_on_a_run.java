package _05_typing_tutor;

import java.util.Random;

public class Type_goes_on_a_run {
public static void main(String[] args) {
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

}
}
