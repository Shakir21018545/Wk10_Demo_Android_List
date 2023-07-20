package sg.edu.rp.c346.id21018545.wk10demoandroidlist;

import java.io.Serializable;

public class AndroidVersion implements Serializable {
    String name;
    String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return name + '\n' + version;
    }
}
