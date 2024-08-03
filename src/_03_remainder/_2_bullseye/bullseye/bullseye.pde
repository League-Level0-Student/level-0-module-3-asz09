
void setup() {
 
  // set the size of your sketch
  size(1000,1000);
  
}

void draw() {
  int size = 1000;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 0; i < 8; i++){
  
   
    if (i%2 == 0){
    fill (#F70000);
    ellipse(500,500,size,size);
    }
    else{
    fill(#FFFFFF);
    ellipse(500,500,size,size);
    }
   size -= 200;
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
