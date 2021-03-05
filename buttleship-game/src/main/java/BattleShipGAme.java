import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class BattleShipGAme {
    //private static final int SIZE = 10;
    //private static final int SHIPS = 10;
    private static final int SHIP = 1;
    private static final int EMPTY = 0;
    private static final int HIT = -1;
    private static final int HIT_SHIP = -2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Привет! Давай сиграем в морской бой!");

        System.out.println("Введи размер поля");
        int size = sc.nextInt();
        System.out.println("Введи количество кораблей");
        int ships = sc.nextInt();


        do{
            play(size, ships);
        }
        while(isPlayAgain());
        System.out.println("Пока");

    }

    private static boolean isPlayAgain() {

        Scanner sc = new Scanner(System.in);
        int answer, sh;
        sh=0;
        String s = "";
        do {
            s = (sh==0) ? "Игра окончена\n Сыграем еще? (0-нет? 1-да)": "Введено невеное значение! Введите 0 для выхода или 1 для повтора игры!";//проверка на корректность ввода
            System.out.println(s);
             answer = sc.nextInt();
             sh++;

        }
        while(answer !=1 && answer!=0);
        return answer ==1;


    }

    private static void play(int size, int ships) {
        while(ships >(size*size)/4) {
            System.out.printf("на поле %d Х %d может размещаться не более %d кораблей\n",size,size,(size*size)/5); //проверка на допустимое количество кораблей
            System.out.println("Измените количество кораблей");
            Scanner sc = new Scanner(System.in);
            ships = sc.nextInt();

        }
            int[][] board = generateBoard(size, ships);
        int hits = 0;

        while(hits < ships) {
            printBoard(board);
            boolean isHit = makeMove(board);

            if(isHit){
                System.out.println("Попал!\n");
                hits++;

            }
            else{
                System.out.println("Промазал!\n");
            }
            
        }
    }

    private static boolean makeMove(int[][] board) {
        int line, row;
        System.out.println("Ваш ход: ");
        Scanner scanner = new Scanner(System.in);
        int size = board[0].length;
        do{
            String move = scanner.nextLine().toUpperCase();//A1
             row = move.charAt(0) - 'A';
             line = Integer.parseInt(move.substring(1)) - 1;
        }
        while(row < 0 || row >=size || line < 0 || line >=size);
        /*if(board[line][row] == SHIP){
            board[line][row] = HIT_SHIP;
            return  true;
        }*/

            switch (board[line][row]){//проверка на можно ли сюда стрелять
                case SHIP: board[line][row] = HIT_SHIP;return true;
                case HIT_SHIP:
                case HIT:
                    System.out.println("В эту клетку стрелять уже нельзя! Измените ход!"); makeMove(board); break;
                default: board[line][row] = HIT;
            }

      //board[line][row] = HIT;
        return false;


    }

    private static void printBoard(int[][] board) {
        System.out.print("    ");
        for (char i = 'A'; i < board[0].length + 'A'; i++) {
            System.out.print(" " + i + " ");
        }

        System.out.println();
        int i = 0;
        for (int[] lines : board) {

            System.out.printf("%3d ", ++i);
            for (int cell : lines) {
                switch (cell)
                {
                    case EMPTY:
                        System.out.print(" . ");
                        break;
                    case SHIP:
                        System.out.print("[ ]");
                        break;
                    case HIT:
                        System.out.print(" X ");
                        break;
                    case HIT_SHIP:
                        System.out.print("[X]");
                        break;
                }
            }
            System.out.println();
        }
    }

    private static int[][] generateBoard(int size, int ships) {
        int[][] board = new int[size][size];//здесь добавить проверку, что столько кораблей можно разместить на таком поле

        Random rnd = new Random();
        int i, j;

        for ( int k = 0; k < ships; k++) {
            do {
                i = rnd.nextInt(size);
                j = rnd.nextInt(size);
            }
            //while(board[i][j]==SHIP);
            while(placeShips(board, i,j));

            board[i][j] = SHIP;
        }


        return board;
    }

    private static boolean placeShips(int[][] board,int i, int j) {//проверяем окружение корабля
        int m,n;
        if(board[i][j] == SHIP) {return true;}

        for (int k = -1; k < 2 ; k++) {
            m = i+k;
            for (int l = (-1); l <2 ; l++) {
                n = j+l;
                if(m== -1 || n== -1 || m== board.length || n == board.length) {continue;}

                else if(board[m][n]==SHIP) {return true;}
            }
        }

        return false;
    }



}
