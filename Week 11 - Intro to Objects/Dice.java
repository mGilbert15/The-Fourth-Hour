import java.util.Random;

/**
 * Represents the values of three dice.
 *
 * @author Chris Mayfield and Nathan Sprague
 * @version 02/14/2016
 */
public class Dice {

    /** The first die. */
    private final int first;

    /** The second die. */
    private final int second;

    /** The third die. */
    private final int third;

    /**
     * Constructs a new Dice object with the given face values.
     *
     * @param first value of first die
     * @param second value of second die
     * @param third value of third die
     */
    public Dice(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Constructs a new Dice object with random face values.
     */

    public Dice() {
        Random random = new Random();
        this.first = random.nextInt(6) + 1;
        this.second = random.nextInt(6) + 1;
        this.third = random.nextInt(6) + 1;
    }

    /**
     * Adds the values of all dice together.
     *
     * @return sum total of all dice values
     */

    public int addValues() {
        return this.first + this.second + this.third;
    }

    /**
     * Counts how many dice have the given face value.
     *
     * @param face value to look for (1 to 6)
     * @return number of dice that match (0 to 5)
     */

    public int countValues(int face) {
        int count;
        count = 0;
        if (this.first == face) {
            count = count + 1;
        }
        if (this.second == face) {
            count = count + 1;
        }
        if (this.third == face) {
            count = count + 1;
        }
        return count;
    }

    /**
     * @return The number showing on the first die.
     */

    public int getFirst() {
        return this.first;
    }

    /**
     * @return The number showing on the second die.
     */

    public int getSecond() {
        return this.second;
    }

    /**
     * @return The number showing on the third die.
     */

    public int getThird() {
        return this.third;
    }



}
