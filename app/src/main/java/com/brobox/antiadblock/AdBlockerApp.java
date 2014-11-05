package com.brobox.antiadblock;

/**
 * Created by Daniel on 05.11.2014.
 */
public class AdBlockerApp {

    private String packageName;
    private boolean isInstalled;

    public AdBlockerApp(boolean isInstalled, String packageName) {
        this.isInstalled = isInstalled;
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public boolean isInstalled() {
        return isInstalled;
    }

    public void setInstalled(boolean installed) {
        this.isInstalled = installed;
    }
}
