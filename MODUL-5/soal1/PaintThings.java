package soal1 ;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350 ;
        
        Paint paint = new Paint(COVERAGE) ;

        Rectangle deck ;
        Sphere bigBall ;
        Cylinder tank ;
        double deckAmt, bigBallAmt, tankAmt ;

        deck = new Rectangle(20, 30) ;
        bigBall = new Sphere(15) ;
        tank = new Cylinder(10, 30) ;

        deckAmt = paint.amount(deck) ;
        bigBallAmt = paint.amount(bigBall) ;
        tankAmt = paint.amount(tank) ;

        System.out.println("\nNumber of gallons of paint needed : ") ;
        System.out.printf("Deck = %.2f gallon(s)\n", deckAmt) ;
        System.out.printf("Big Ball = %.2f gallon(s)\n", bigBallAmt) ;
        System.out.printf("Tank = %.2f gallon(s)\n", tankAmt) ;
    }
}