import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        for (int i=0; i<s.length(); i++) {
        	for (int j = 0; j < ALPHABET.length(); j++) {
        		if (ALPHABET.toCharArray()[j] == s.toCharArray()[i]){
        			aCoder = aCoder + s.toCharArray()[i];
        	} 
        	}
        	if (s.toCharArray()[i]==' ') {
        		aCoder = aCoder + ' ';
        	}
        }
        for (int i=0; i< aCoder.length(); i++) {
        	if (aCoder.toCharArray()[i] ==' ') {
        		chaineCodee = chaineCodee + ' ';
        	} else {
        		for (int j = 0; j< ALPHABET.length(); j++) {
        			if(ALPHABET.toCharArray()[j]==aCoder.toCharArray()[i]) {
        				if(j <= ALPHABET.length() -5) {
        					chaineCodee = chaineCodee + ALPHABET.toCharArray()[j+4];
        				} else {
        					if (j == ALPHABET.length() - 4) {
        						chaineCodee = chaineCodee + ALPHABET.toCharArray()[0];
        					} else if (j == ALPHABET.length() - 3) {
        						chaineCodee = chaineCodee + ALPHABET.toCharArray()[1];
        					} else if (j == ALPHABET.length() - 2) {
        						chaineCodee = chaineCodee + ALPHABET.toCharArray()[2];
        					} else if (j == ALPHABET.length() - 1) {
        						chaineCodee = chaineCodee + ALPHABET.toCharArray()[3];
        					}
        				}
        			}
        		}
        	}
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
