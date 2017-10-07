package CarFax;

public class CarWheel {
    private float tireState;

    public CarWheel ( ) {
        this.tireState = 1;
    }

    public CarWheel ( float tireState ) {
        if ( tireState >= 0 && tireState <= 1 ) {
            this.tireState = tireState;
        }
    }
    public void newTire ( ) {
        this.tireState = 1;
    }

    public float getTireState() {
        return tireState;}

    public void useTire(int percent) {
        this.tireState -= (tireState < (float) percent / 100f) ? tireState : (float) percent / 100f;}

    public void show() {
        System.out.println("Tire state: " + (int) (tireState * 100f) + "%.");
    }
    public static void main(String[] args) {
        CarWheel carWheel = new CarWheel();
        carWheel.useTire(56);
        carWheel.show();
        carWheel.newTire();
        carWheel.show();
        carWheel.useTire(50);
        carWheel.show();
    }
}
