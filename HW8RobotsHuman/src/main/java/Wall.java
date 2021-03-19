public class Wall implements Let{
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean goLet(Move party, double maxJump) {

        if(maxJump >= height){
        party.jump();
        return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "стену высотой " + height;
    }
}
