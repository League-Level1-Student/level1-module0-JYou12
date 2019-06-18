void setup(){
  
  size(500, 500);
  
}

int x = 0;
int y = 0;
int fallSpeed = 4;
int timesCollected = 0;
int score = 0;
   int randomNumber = (int) random(width);
   int bucketX;
   int bucketY = 450;
void draw(){
   background(135, 206, 235);
      y += fallSpeed/2;
      x = randomNumber;

      fill(0, 0, 240);
    stroke(0, 0, 250);
    ellipse(x, y, 10, 20);
    
    bucketX = mouseX;
    fill(0, 0, 0);
    rect(bucketX, bucketY, 40, 50);
    
    if(y > 500 && dist(bucketX, bucketY, x, y) >= 40){
      y = 0;
      score --;
      randomNumber = (int) random(width);
      fallSpeed -= 2;
    }
  
  if(dist(bucketX, bucketY, x, y) <= 40){
    score++;
          y = 0;
      timesCollected ++;
      randomNumber = (int) random(width);
      fallSpeed ++;
  }
      fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
  
}
