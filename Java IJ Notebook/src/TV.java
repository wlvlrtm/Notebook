public class TV implements Controllable {
    @Override
    public void TurnOn() {
        System.out.println("TV turn ON");
    }
    
    @Override
    public void TurnOff() {
        System.out.println("TV turn OFF");
    }

    @Override
    public void Repair() {
        System.out.print("TV: ");
        Controllable.super.Repair();
        System.out.println("Pay: " + Controllable.pay);
    }

    public void Reset() {
        Controllable.Reset();
    }

}
