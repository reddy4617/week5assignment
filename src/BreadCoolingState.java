public class BreadCoolingState implements State{

    @Override
    public void AmericanBread_Ready_Status(Bread State) {
        System.out.println("Bread is in >>> ");
        State.setBread(this);
    }

    @Override
    public String toString(){
        return "Cooling State";
    }
}
