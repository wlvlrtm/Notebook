public class TV extends Controller {
    public TV(boolean power) {
        this.power = power;
    }

    @Override
    String getName() {
        return "TV";
    }
}
