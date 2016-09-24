public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99;

        while (beerNum > 0) {

            if (beerNum == 1) {
                System.out.print(beerNum + " bottle of beer on the wall, ");
                System.out.println(beerNum + " bottle of beer.");
                System.out.println("Take one down, pass it around, no more bottles of beer on the wall...");
                System.out.println("If one of those bottles should happen to fall, no more bottles of beer on the wall...");
            } else if (beerNum == 2){
                System.out.print(beerNum + " bottles of beer on the wall, ");
                System.out.println(beerNum + " bottles of beer.");
                System.out.println("Take one down, pass it around, " + (beerNum-1) + " bottle of beer on the wall...");
                System.out.println("If one of those bottles should happen to fall, "
                        + (beerNum-1) + " bottle of beer on the wall...");
            } else {
                System.out.print(beerNum + " bottles of beer on the wall, ");
                System.out.println(beerNum + " bottles of beer.");
                System.out.println("Take one down, pass it around, " + (beerNum-1) + " bottles of beer on the wall...");
                System.out.println("If one of those bottles should happen to fall, "
                        + (beerNum-1) + " bottles of beer on the wall...");
            }
            beerNum = beerNum - 1;
        }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall...");

    }
}
