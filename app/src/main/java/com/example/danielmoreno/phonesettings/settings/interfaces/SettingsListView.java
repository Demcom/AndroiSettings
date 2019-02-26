package com.example.danielmoreno.phonesettings.settings.interfaces;

import com.example.danielmoreno.phonesettings.settings.models.SettingModel;

import java.util.ArrayList;

public interface SettingsListView {
    /**
     * Shows settings with the given ArrayList
     *
     * @param settingModels settings model array to be shown
     */
    void showSettings(ArrayList<SettingModel> settingModels);

    /**
     * Shows error message withe the given string id
     *
     * @param message
     */
    void showSettingsError(int message);
}

