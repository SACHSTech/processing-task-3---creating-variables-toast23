import processing.core.PApplet;
import java.util.Random;


public class Sketch extends PApplet {

  Random rand = new Random();
	
  // width and height 
	float width = 800f;
  float height = 700f;

  // scale factor
  float wScaleF = width / 400f;
  float hScaleF = height / 400f;


  public void settings() {
    size((int)width, (int)height);
  }

  public void setup() {
    background(0, 255, 0);
    noLoop();
  }

  public void draw() {
	  
	// sky 
  fill(0, 255, 255);
  rect(0f, 0f, width, 230f * hScaleF);

  // house 
  fill(255, 205, 180);
  rect(170f * wScaleF, 220f * hScaleF, 70 * wScaleF, 45 * hScaleF);

  // roof
  fill(165, 42, 42);
  triangle(170 * wScaleF, 220 * hScaleF, 205 * wScaleF, 195 * hScaleF, 240 * wScaleF, 220 * hScaleF);

  // window
  fill(0, 0, 255);
  rect(179 * wScaleF, 232 * hScaleF, 11 * wScaleF, 12 * hScaleF);
  rect(220 * wScaleF, 232 * hScaleF, 11 * wScaleF, 12 * hScaleF);

  // door 
  fill(165, 42, 42);
  rect(200 * wScaleF, 242 * hScaleF, 10 * wScaleF, 20 * hScaleF);

  // sun 
  fill(255, 255, 0);
  ellipse(rand.nextInt((int)width), (rand.nextInt((int)(190f * hScaleF))), 80 * wScaleF, 80 * hScaleF);

  // time 
  fill(0, 0, 0);
  text(year() + "-" + month() + "-" + day(), 0, height);

  }


}