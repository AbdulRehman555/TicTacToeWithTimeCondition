import java.util.Date;
import java.util.Scanner;

public class TicTacToeWithTimeCondition {

    public static void main(String args[]){
        Game G = new Game();
        boolean flag = false;
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t       WELCOME TO TICTACTOE         ");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t       SIGN OF PLAYER 1 = X         ");
        System.out.println("\t\t       SIGN OF PLAYER 2 = O         ");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Enter player 1 name: ");
        Scanner scanner = new Scanner(System.in);
        String namePlayer1 = scanner.nextLine();
        System.out.println("Enter player 1 name: ");
        String namePlayer2 = scanner.nextLine();

        G.getter();
        for(int i=0;i<9;i++){
            G.setTurn(i);
            G.getter();
            char sign = G.check();
            if(sign=='X'){
                if(timeCheck(namePlayer1.length())){
                    flag = true;
                    System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\t\t       CONGRATS! "+namePlayer1);
                    System.out.println("\t\t        Player 1 WINS            ");
                    System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                }
            }
            else if(sign=='O') {
                if (timeCheck(namePlayer2.length())) {
                    flag = true;
                    System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\t\t       CONGRATS! "+namePlayer2);
                    System.out.println("\t\t        Player 2 WINS            ");
                    System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t           MATCH DRAW!              ");
            System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    public static boolean timeCheck(int nameLength){
        Date now = new Date();
        int minutes = now.getMinutes();
        int difference = nameLength-minutes;
        System.out.println(nameLength);
        System.out.println(minutes);
        System.out.println(difference);
        if(difference%2!=0)
            return true;
        return false;

    }

}
