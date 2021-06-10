   import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class wpm{
    static String[] words={"envelope","cantelope","the","hello","microphone","elephant","biscuit","hammer","went","cap"};
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Your time starts in ");
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
         System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
         System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        
        Random rand=new Random();
        for(int i=0;i<10;i++){
            System.out.print(words[rand.nextInt(9)]+" ");
            
        }
        
        System.out.println();
        double start=LocalTime.now().toNanoOfDay();
        Scanner scan =new Scanner(System.in);
        String typeWords=scan.nextLine();
        double end=LocalTime.now().toNanoOfDay();
        double elapsedTime=end-start;
        double seconds=elapsedTime/1000000000.0;
        int numChars=typeWords.length();
        int wpm = (int)((((double)numChars/5)/seconds)*60);
        System.out.println("Your wpm is " +wpm + "!");
    }
}
