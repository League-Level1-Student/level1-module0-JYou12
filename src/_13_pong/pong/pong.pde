void setup(){
  
  size(750, 750);
  background(0, 0, 50);
  
}
int ballX = 375;
int ballY = 200;
int ballSpeed = 5;
int ballFall = -5;
int x = 375;
int y = 725;
void draw(){  
  if(ballX >= width){
    ballSpeed = -5;
  }else if (ballX <= 0){
    ballSpeed = 5;
  }
    ballX += ballSpeed; 
    ballY -= ballFall;

  background(0, 0, 50);
  fill(200, 0, 0);
  stroke(200, 0, 0);
  ellipse(ballX, ballY, 25, 25);
  
  x = mouseX;
  rect(x, y, 50, 5);
boolean hitPaddle = intersects(ballX, ballY, x, y, 50);

if(hitPaddle == true){
  ballFall = 5;
}else if(ballY <= 0){
 ballFall = -5; 
}
  
  if(ballY >= 775){
   exit();
  }
  
}

     boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
    }
