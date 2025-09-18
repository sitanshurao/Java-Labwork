import java.util.Scanner;
 class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Sitanshu 24csu323");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Not an alphabet!");
        }
    }
}