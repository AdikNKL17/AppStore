package com.majesthink.adik.appstore.model;

public class Application {
    private String app_name, app_developer, APP_ICON;
    private int app_size;

    public Application(){

    }

    public String getApp_name() {
        return app_name;
    }

    public Application(String app_name, String app_developer, String APP_ICON, int app_size) {
        this.app_name = app_name;
        this.app_developer = app_developer;
        this.APP_ICON = APP_ICON;
        this.app_size = app_size;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getApp_developer() {
        return app_developer;
    }

    public void setApp_developer(String app_developer) {
        this.app_developer = app_developer;
    }

    public String getAPP_ICON() {
        return APP_ICON;
    }

    public void setAPP_ICON(String APP_ICON) {
        this.APP_ICON = APP_ICON;
    }

    public int getApp_size() {
        return app_size;
    }

    public void setApp_size(int app_size) {
        this.app_size = app_size;
    }
}
