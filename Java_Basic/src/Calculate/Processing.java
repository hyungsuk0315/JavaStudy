int var = 0;
PImage img_city1;
PImage img_city2;
//set array
float[] xPos = new float[250];
float[] yPos = new float[250];
float[] xVel = new float[250];
float[] yVel = new float[250];
float[] s = new float[250]; 

int a = 0;
int b = 0;
int c = 100;
int p = 10;

//set up array
void setup() {
  size(1200, 600);
  img_city1 = loadImage("city1.jpg");
  img_city2 = loadImage("city2.jpg");
  
  for (int i=0; i < 250; i++) {
    xPos[i] = random(1, 1200);
  }

  for (int i=0; i < 250; i++) {
    yPos[i] = random(00, 300);
  }

  for (int i=0; i < 250; i++) {
    xVel[i] = random(-10, 10);
  }

  for (int i=0; i < 250; i++) {
    yVel[i] = random(-10, 10);
  }
  for (int i=0; i < 250; i++) {
    s[i] = random(1, 6);
  }
}
//draw stars
void draw() {
  background(0);
  if(var == 0){
    img_city1.resize(1200,600);
    image(img_city1, 0 , 0);
  }else if(var == 1 ){
    img_city2.resize(1200,600);
    image(img_city2, 0 , 0);
  }else if(var >= 1){
    img_city2.resize(1200,600);
    image(img_city2, 0 , 0);
  }
  
  
  fill(255);
  

  for (int i=0; i < 250; i++) {
    if(var == 0) break;
    else if(var == 1) fill(100);
    else if(var == 2) fill(255);
    //else if(var == 3) fill(255);
    noStroke ();
    ellipse(xPos[i], yPos[i], s[i], s[i]);
  }
  if(var != 0) tracker();
println(var);
}
void mouseClicked() {
  var++;
}
void tracker () 
{
  smooth ();
//  stroke(255);
    noStroke ();
  line (a, b, c, a);
  a = a + 3;
  if (a == 600) {
    a = 0;
    c = c +100;
    b = b +100;
  }

    if(var == 1) stroke(10);
    else if(var == 2) stroke(255);
   // else if(var == 3) stroke(255);



  for (int i=0; i < 250; i++) {

    line (xPos[i]+p, yPos[i], xPos[i], yPos[i]);
    line (xPos[i], yPos[i]+p, xPos[i], yPos[i]);
    line (xPos[i], yPos[i], xPos[i]-p, yPos[i]);
    line (xPos[i], yPos[i], xPos[i], yPos[i]-p);
    if (a > yPos[i]-25) {
      p = 5;
    }
    if (a < yPos[i]+25) {
      p = 5;
    }
    if (a < yPos[i]-25) {
      p = 0;
    }
    if (a > yPos[i]+25) {
      p = 0;
    }
    i = i + 1;
  }
}