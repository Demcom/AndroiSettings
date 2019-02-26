package com.example.danielmoreno.phonesettings.settings.models;

public class SettingModel {
    private String mTitle;
    private int mSettingsImageId;

    public SettingModel(String title, int settingsImageId) {
        this.mTitle = title;
        this.mSettingsImageId = settingsImageId;
    }

    /**
     * Gets the setting title
     *
     * @return Title String
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Gets the setting image id
     *
     * @return Image Id
     */
    public int getSettingsImageId() {
        return mSettingsImageId;
    }
}
