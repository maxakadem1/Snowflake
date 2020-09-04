



import java.lang.Math;
//Maxim Abdulkhalikov 7876165
public class Snowflake
{
    //you can choose the number of iterations with this int
    public static int numOfFlakes =6;
    
    public double length;
    //drawing a plus
   public static void drawPlus(){
       StdDraw.setPenColor(StdDraw.BLACK);
       StdDraw.line(0.5, 0.8, 0.5, 0.2);
       StdDraw.line(0.8, 0.5, 0.2, 0.5);
       
    }
    
  
   //recursive method whicj uses thigonometry to make a snowflake in the correct form
   public static void Recursion(int counter,double x, double y,double leng , double rad){
       int zhopa = counter - 1;
       if(zhopa<=0){
           
           
        }else{
       for(int i=0;i<5;i++){
          StdDraw.line(x, y, x+Math.cos(((Math.PI*i)/4)+rad)*leng, y+Math.sin(((Math.PI*i)/4)+rad)*leng); 
          Recursion(zhopa,x+Math.cos(((Math.PI*i)/4)+rad)*leng,y+Math.sin(((Math.PI*i)/4)+rad)*leng,leng/2,
          rad+(Math.PI*i)/4-(Math.PI/2));
        }
       
        
    }
    }
    //main which starts a snowflake
   public static void main (String args[]){
       drawPlus();
       //drawFiveLines(0.5,0.8,0.1,0);
       //drawFiveLines(0.5,0.2,0.1,Math.PI);
       //drawFiveLines(0.8,0.5,0.1,(Math.PI/2)*3);
       //drawFiveLines(0.2,0.5,0.1,Math.PI/2);
       Recursion(numOfFlakes,0.5,0.8,0.15,0);
       Recursion(numOfFlakes,0.5, 0.2,0.15,Math.PI);
       Recursion(numOfFlakes,0.8, 0.5,0.15,(Math.PI/2)*3);
       Recursion(numOfFlakes,0.2, 0.5,0.15,Math.PI/2);
    }
}
