import java.util.Scanner;

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


    public Game1() {
        //day la toa do player
        this.playerX = 2;
        this.playerY = 2;

        this.enemy1X = 3;
        this.enemy1Y = 3;

        this.enemy2X = 2;
        this.enemy2Y = 3;

        this.mapheight = 4;
        this.mapwidth = 4;

        this.keyX = 1;
        this.keyY = 1;

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
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
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
