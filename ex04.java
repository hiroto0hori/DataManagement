import java.util.Random;
imoort java.util.Scannar;

public class HeadsOrTails {
    public static void main(String[] args) {
        // あいさつをする
        Scanner scannner = new Scanner(System.in);
        System.out.println("あなたの名前は何ですか？");
        String name = scannner.next();
        System.out.println("こんにちは！"+ name +"さん");

        Random rand = new Random();
        int headsCount = 0;
        int tailsCount = 0;
        
        System.out.println("Tossing a coin...");

        for (int i = 1; i <= 3; i++) {
            boolean isHeads = rand.nextBoolean();
            if (isHeads) {
                System.out.println("Round " + i + ": Heads");
                headsCount++;
            } else {
                System.out.println("Round " + i + ": Tails");
                tailsCount++;
            }
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
        
        if (headsCount > tailsCount) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}
