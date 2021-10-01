public class BreadTestApp {

    public static void main(String[] args) {
        Bread bread = new Bread();
        BakingState baked = new BakingState();

        baked.AmericanBread_Ready_Status(bread);
        System.out.println(bread.getBread().toString());
        System.out.println();

        BreadCoolingState cooling = new BreadCoolingState();
        cooling.AmericanBread_Ready_Status(bread);
        System.out.println(bread.getBread().toString());
    }
}
