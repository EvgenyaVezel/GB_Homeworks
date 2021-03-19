public class Treadmill implements Let{
    private double length;

    public Treadmill(double height) {
        this.length = height;
    }

    @Override
    public boolean goLet(Move party, double maxRun) {

        if(maxRun >= length){
            party.run();
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "беговую дорожку длиной "+ length;
    }
}
