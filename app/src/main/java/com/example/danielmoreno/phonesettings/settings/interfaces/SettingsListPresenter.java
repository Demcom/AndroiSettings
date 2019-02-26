package com.example.danielmoreno.phonesettings.settings.interfaces;

import com.example.danielmoreno.phonesettings.settings.models.SettingModel;

import java.util.ArrayList;

public interface SettingsListPresenter {
    /**
     * Request settings to Model
     */
    void getSettings();

    /**
     * Presents settings with the given array
     *
     * @param settingModelArrayList ArrayList of settings models
     */
    void presentSettings(ArrayList<SettingModel> settingModelArrayList);
}
