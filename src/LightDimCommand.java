public class LightDimCommand implements Command{

    private  Light light;
    private int newLevel;
    private int previousLevel;


    public LightDimCommand(Light light, int newBrightness) {
        this.light = light;
        this.newLevel = newBrightness;
    }

    @Override
    public void execute() {

        previousLevel = light.getBrightness();
        light.dim(newLevel);

    }

    @Override
    public void undo() {

        light.dim(previousLevel);

    }
}
