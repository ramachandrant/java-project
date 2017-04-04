public class Rectangulator {
  public static void main(strin[] args) {
   int length = Integer.parseInt(args[0]);
   int width = Integer.parseInt(args[1]);

   Rectangle myRectangle = new Rectangle(lenght, width);
   String output = String.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());

    System.out.println(output);
  }

}
