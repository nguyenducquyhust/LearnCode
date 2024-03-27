//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//import java.util.Random;
//
//public class GamePaner extends JPanel implements ActionListener {
//    static final int SCREEN_WIDTH = 600;
//    static final int SCREEN_LENGTH = 600;
//    static final int UNIT_SIZE = 25;
//    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_LENGTH)/UNIT_SIZE;
//    static final int DELAY = 75;
//    final int x[]  = new int[GAME_UNITS];
//    final int y[]  = new int[GAME_UNITS];
//    int bodyParts = 6;
//    int appleEaten ;
//    int applex;
//    int appley;
//    char direction = 'R';
//    boolean running = false;
//    Timer timer;
//    Random random;
//    GamePaner(){
//        random = new Random();
//        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_LENGTH));
//        this.setBackground(Color.black);
//        this.setFocusable(true);
//        this.addKeyListener(new MyKeyAdapter());
//        startGame();
//
//    }
//    public void newApple(){
//        applex = random.nextInt((int)(SCREEN_LENGTH/UNIT_SIZE))*UNIT_SIZE;
//        appley = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
//
//    }
//    public void startGame(){
//        newApple();
//        running = true;
//        timer = new Timer(DELAY,this);
//        timer.start();
//
//
//
//
//
//    }
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        draw(g);
//
//    }
//    public void draw(Graphics g){
//        if(true) {
//
//            for (int i = 0; i < SCREEN_LENGTH / UNIT_SIZE; i++) {
//                g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_LENGTH);
//                g.drawLine(0, i * UNIT_SIZE, SCREEN_LENGTH, i * UNIT_SIZE);
//            }
//            g.setColor(Color.red);
//            g.fillOval(applex, appley, UNIT_SIZE, UNIT_SIZE);
//            for (int i = 0; i < bodyParts; i++) {
//                if (i == 0) {
//                    g.setColor(Color.green);
//                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
//                } else {
//                    g.setColor(Color.blue);
//                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
//                }
//            }
//        }
//        else{ GameOVer(g);
//
//        }
//
//
//    }
//    public void GameOVer(Graphics g){
//        g.setColor(Color.red);
//        g.setFont(new Font("Ink Fre",Font.BOLD,75));
//        FontMetrics metrics = getFontMetrics(g.getFont());
//        g.drawString("m ngu vai cut",SCREEN_LENGTH - metrics.stringWidth("m ngu vai cut ")/2,600);
//    }
//    public void move() {
//        for (int i = bodyParts; i > 0; i--) {
//            x[i] = x[i - 1];
//            y[i] = y[i - 1];
//        }
//
//        switch (direction) {
//            case 'U':
//                y[0] -= UNIT_SIZE;
//                break;
//            case 'D':
//                y[0] += UNIT_SIZE;
//                break;
//            case 'L':
//                x[0] -= UNIT_SIZE;
//                break;
//            case 'R':
//                x[0] += UNIT_SIZE; // Corrected: add UNIT_SIZE to x-coordinate
//                break;
//        }
//    }
//
//    public void checkApple(){
//        if((x[0]==applex)&&y[0]==appley){
//            bodyParts++;
//            appleEaten++;
//            newApple();
//        }
//
//    }
//    public void checkCillision(){
//        for(int i = bodyParts;i>0;i--){
//            if((x[0] == x[i])&&(y[0] == y[i])){
//                running = false;
//            }
//        }
//        if(x[0]<0){
//            running = false;
//        }
//        if(x[0]>SCREEN_WIDTH){
//            running = false;
//        }
//        if(y[0] < 0){
//            running = false;
//        }
//        if(y[0]>SCREEN_LENGTH){
//            running = false;
//        }
//        if(running = false){
//            timer.stop();
//        }
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (running) {
//            move();
//
//            checkApple();
//            checkCillision();
//        }
//        repaint();
//
//        }
//
//
//
// class MyKeyAdapter extends KeyAdapter{
//    @Override
//    public void keyPressed(KeyEvent e){
//        switch (e.getKeyCode()){
//            case  KeyEvent.VK_LEFT:
//                if(direction != 'R' ){
//                    direction = 'L';
//                }
//                break;
//            case KeyEvent.VK_RIGHT:
//                if(direction != 'L'){
//                    direction = 'R';
//                }
//            case KeyEvent.VK_UP:
//                if(direction != 'D'){
//                    direction = 'U';
//                }
//            case KeyEvent.VK_DOWN:
//                if(direction != 'U'){
//                    direction = 'D';
//                }
//
//        }
//
//    }
//}
//}
