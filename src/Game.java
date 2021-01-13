import java.util.Scanner;

public class Game {
    private char[][] arr = new char[3][3];

    public Game() {
        arr = new char[][]{{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    }

    public void getter(){
        System.out.println("\t\t       _____________");
        for(int i=0;i<3;i++) {
            System.out.print("\t\t\t\t");
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + "   ");
            System.out.println();
        }
        System.out.println("\t\t       _____________");
    }
    public void setTurn(int i){
        Scanner scanner = new Scanner(System.in);
        int pos;
        if(i%2==0)
            System.out.println("Player 1 turn!");
        else
            System.out.println("Player 2 turn!");
        do{
            System.out.println("At which location you want to make your turn: ");
            pos=scanner.nextInt();
            if(pos==1){
                if (arr[0][0] == 'X' || arr[0][0] == 'O')
                    System.out.println("Location Not Free(Try another location)");
                else if(i%2==0){
                    arr[0][0]='X';
                    break;
                }
                else{
                    arr[0][0]='O';
                    break;
                }
            }
            else if (pos == 2)
            {

                if (arr[0][1] == 'X' || arr[0][1] == 'O')
                    System.out.println("Location Not Free(Try another location)");
                else if (i % 2 == 0)
                {
                    arr[0][1] = 'X';
                    break;
                }
                else
                {
                    arr[0][1] = 'O';
                    break;
                }
            }
            else if (pos == 3)
            {

                if (arr[0][2] == 'X' || arr[0][2] == 'O')
                    System.out.println("Location Not Free(Try another location)");
                else if (i % 2 == 0)
                {
                    arr[0][2] = 'X';
                    break;
                }
                else
                {
                    arr[0][2] = 'O';
                    break;
                }
            }
            else if (pos == 4)
            {

                if (arr[1][0] == 'X' || arr[1][0] == 'O')
                    System.out.println("Location Not Free(Try another location)");
                else if (i % 2 ==0)
                {
                    arr[1][0] = 'X';
                    break;
                }
                else
                {
                    arr[1][0] = 'O';
                    break;
                }
            }
            else if (pos == 5)
            {
                if (arr[1][1] == 'X' || arr[1][1] == 'O')
                    System.out.println("Location Not Free(Try another location)");
                else if (i % 2 == 0)
                {
                    arr[1][1] = 'X';
                    break;
                }
                else
                {
                    arr[1][1] = 'O';
                    break;
                }
            }
            else if (pos == 6)
            {
                if (arr[1][2] == 'X' || arr[1][2] == 'O')
                    System.out.println("Location Not Free(Try another location)");
                else if (i % 2 == 0)
                {
                    arr[1][2] = 'X';
                    break;
                }
                else
                {
                    arr[1][2] = 'O';
                    break;
                }
            }
            else if (pos == 7)
            {

                if (arr[2][0] == 'X' || arr[2][0] == 'O')
                    System.out.println("Location Not Free(Try another location)");
                else if (i % 2 == 0)
                {
                    arr[2][0] = 'X';
                    break;
                }
                else
                {
                    arr[2][0] = 'O';
                    break;
                }
            }
            else if (pos == 8)
            {

                if (arr[2][1] == 'X' || arr[2][1] == 'O')
                    System.out.println("Location Not Free(Try another location)");
                else if (i % 2 == 0)
                {
                    arr[2][1] = 'X';
                    break;
                }
                else
                {
                    arr[2][1] = 'O';
                    break;
                }
            }
            else if (pos == 9)
            {

                if (arr[2][2] == 'X' || arr[2][2] == 'O')
                    System.out.println("Location Not Free(Try another location)");
                else if (i % 2 == 0)
                {
                    arr[2][2] = 'X';
                    break;
                }
                else
                {
                    arr[2][2] = 'O';
                    break;
                }
            }
        }while(true);
    }
    public char check(){
        if (arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2]){
            if (arr[0][0] == 'X')
                return 'X';
            else
                return 'O';
        }
        else if (arr[1][0] == arr[1][1] && arr[1][0] == arr[1][2]){
            if (arr[1][0] == 'X')
                return 'X';
            else
                return 'O';
        }
        else if (arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2]){
            if (arr[2][0] == 'X')
                return 'X';
            else
                return 'O';
        }
        else if (arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0]){
            if (arr[0][0] == 'X')
                return 'X';
            else
                return 'O';
        }
        else if (arr[0][1] == arr[1][1] && arr[0][1] == arr[2][1]){
            if (arr[0][1] == 'X')
                return 'X';
            else
                return 'O';
        }
        else if (arr[0][2] == arr[1][2] && arr[0][2] == arr[2][2]){
            if (arr[0][2] == 'X')
                return 'X';
            else
                return 'O';
        }
        else if (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2]){
            if (arr[0][0] == 'X')
                return 'X';
            else
                return 'O';
        }
        else if (arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0]){
            if (arr[0][2] == 'X')
                return 'X';
            else
                return 'O';
        }
        return '#';
    }
}
