import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game1 {
    int playerX ;
    int playerY ;

    int enemy1X ;
    int enemy1Y ;

    int enemy2X ;
    int enemy2Y ;

    int mapwidth;
    int mapheight;

    int keyX;
    int keyY;

    int tempX;
    int tempY;

    int cntNeeded = 1;

    List X_used = new ArrayList();
    List Y_used = new ArrayList();

    int size = 0;

    public Game1() {


        this.setUp();
        this.keyX = keyX;
        this.keyY = keyY;
        //day la toa do player
        this.playerX = playerX;
        this.playerY = playerY;

        this.enemy1X = enemy1X;
        this.enemy1Y = enemy1Y;

        this.enemy2X = enemy2X;
        this.enemy2Y = enemy2Y;

        this.mapheight = 4;
        this.mapwidth = 4;



    }
    public void setUp(){

        int isOk = 0;
        Random rand = new Random();
        while (isOk < cntNeeded ){
            System.out.println(isOk);
            System.out.println(cntNeeded);

            keyX =  rand.nextInt(4);
            keyY =  rand.nextInt(4);
            tempX = keyX;
            tempY = keyY;

            System.out.println(keyX);
            System.out.println(keyY);

            System.out.println("-------------------");
            isOk++;
        }

        this.nextStep();
        while (isOk < cntNeeded ){
            System.out.println(isOk);
            System.out.println(cntNeeded);

            int isSame = 0;
            playerX = tempX = rand.nextInt(4);
            playerY = tempY = rand.nextInt(4);

            System.out.println(playerX);
            System.out.println(playerY);
            System.out.println(X_used);
            System.out.println(Y_used);
            System.out.println("-------------------");
            for(int k = 0; k < size; k ++){
                int lolX = (int) X_used.get(k);
                int lolY = (int) Y_used.get(k);
                if (playerX == lolX && playerY == lolY){
                    isSame++;
                }
            }
            if (isSame == 0){
                isOk++;
            }
        }
        this.nextStep();
        while (isOk < cntNeeded ){
            System.out.println(isOk);
            System.out.println(cntNeeded);

            int isSame = 0;
            enemy1X = tempX = rand.nextInt(4);
            enemy1Y = tempY = rand.nextInt(4);
            System.out.println(enemy1X);
            System.out.println(enemy1Y);
            System.out.println(X_used);
            System.out.println(Y_used);
            System.out.println("-------------------");
            for(int k = 0; k < size; k ++){
                int lolX = (int) X_used.get(k);
                int lolY = (int) Y_used.get(k);
                if (enemy1X == lolX && enemy1Y == lolY){
                    isSame++;
                }
            }
            if (isSame == 0){
                isOk++;
            }
        }
        this.nextStep();
        while (isOk < cntNeeded ){
            System.out.println(isOk);
            System.out.println(cntNeeded);

            int isSame = 0;
            enemy2X = tempX = rand.nextInt(4);
            enemy2Y = tempY = rand.nextInt(4);
            System.out.println(enemy2X);
            System.out.println(enemy2Y);
            System.out.println(X_used);
            System.out.println(Y_used);
            System.out.println("-------------------");
            for(int k = 0; k < size; k ++){
                int lolX = (int) X_used.get(k);
                int lolY = (int) Y_used.get(k);
                if (enemy2X== lolX && enemy2Y == lolY){
                    isSame++;
                }
            }
            if (isSame == 0){
                isOk++;
            }
        }
    }

    public void nextStep(){
        cntNeeded++;
        X_used.add(tempX);
        Y_used.add(tempY);
        size = X_used.size();

    }

    public void gameLoop(){
//        int cnt = 0;
        while (true) {
            this.printMap();
            this.run();
            if (playerX == keyX && playerY==keyY){
                this.printMap();
                System.out.println("WIN");
                break;
                //cach 2 System.exit(0);
            }
        }


    }
    public  void  run(){
        //player nhap lenh
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
//            System.out.println(input);

        if (input.equals("up")){
            this.playerY--;
        }
        else if (input.equals("down")){
            this.playerY++;
        }
        else if (input.equals("right")){
            this.playerX++;
            //cach 2 if playerX != 3 thi thuc hien lenh
        }
        else if (input.equals("left")){
//            System.out.println("left");
            this.playerX--;
        }
        this.clamp();
    }

    private void clamp() {
        if (playerX >= mapwidth-1){
            playerX = 3;
        }
        if (playerX <= 0  ){
            playerX = 0;
        }
        if (playerY <= 0  ){
            playerY = 0;
        }
        if (playerY >= mapheight-1){
            playerY = 3;
        }
    }

    public void printMap(){
        for (int i = 0; i < mapheight; i++) {
            for (int j = 0; j < mapwidth; j++) {
                if (i==playerY && j==playerX){
                    System.out.print(" P ");
                }
                else if (i==enemy1Y && j==enemy1X){
                    System.out.print(" E ");
                }
                else if (i==enemy2Y && j==enemy2X){
                    System.out.print(" E ");
                }
                else if (i==keyY && j==keyX){
                    System.out.print(" K ");
                }
                else{
                    System.out.print(" x ");
                }
            }
            System.out.println("");
        }
    }
}
