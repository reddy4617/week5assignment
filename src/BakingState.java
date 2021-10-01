public class BakingState implements State {
    @Override
    public void AmericanBread_Ready_Status(Bread status) {
        System.out.println("Bread is in >>>");
        status.setBread(this);
    }

    @Override
    public String toString() {
        return "Baking State";
    }
}
