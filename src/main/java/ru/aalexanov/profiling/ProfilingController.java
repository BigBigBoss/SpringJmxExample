package ru.aalexanov.profiling;

/**
 * Created by aalexanov on 21.09.15.
 */
public class ProfilingController implements ProfilingControllerMBean{
    private  boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


}
