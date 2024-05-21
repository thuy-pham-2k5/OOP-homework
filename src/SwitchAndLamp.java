import java.util.Objects;

public class SwitchAndLamp {
    private final boolean switchButton = true;
    public boolean isStatusSwitch(String button) {
        if (Objects.equals(button, "on"))
            return true;
        if (Objects.equals(button,"off"))
            return false;
        return false;
    }
    public void statusSwitchButton() {
        System.out.println("Switch Button");
        System.out.println("status: " );
    }
}
