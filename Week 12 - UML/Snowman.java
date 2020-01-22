public class Snowman {

    private String name;
    private boolean hasHat;
    private String catchPhrase;

    public Snowman() {
        this.name = "Frosty";
        this.hasHat = true;
        this.catchPhrase = "Happy Birthday";
    }

    public Snowman(String name, boolean hasHat, String catchPhrase) {
        this.name = name;
        this.hasHat = hasHat;
        this.catchPhrase = catchPhrase;
    }

    public String getName() {
        return this.name;
    }

    public boolean hasHat() {
        return this.hasHat;
    }

    public void sayCatchPhrase() {
        System.out.println(catchPhrase);
    }

    public String toString() {
        String hat;
        if (hasHat()) {
            hat = "has a hat";
        } else {
            hat = "doesn't have a hat";
        }
        return this.name + "is a snowman that " + hat;
    }


}
