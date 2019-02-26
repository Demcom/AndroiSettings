package com.example.danielmoreno.phonesettings.settings;

import com.example.danielmoreno.phonesettings.settings.fragments.SettingsListFragment;

public class SettingsConfigurator {

    /**
     * Configures the settings MVP
     *
     * @param settingsListFragment
     */
    public static void configureSettingsListView(SettingsListFragment settingsListFragment) {
        SettingsListPresenterImplementation settingsListPresenterImplementation = new SettingsListPresenterImplementation();
        SettingsListModelImplementation settingsListModelImplementation = new SettingsListModelImplementation();
        settingsListFragment.setSettingsListPresenter(settingsListPresenterImplementation);
        settingsListPresenterImplementation.setSettingsModel(settingsListModelImplementation);
        settingsListPresenterImplementation.setSettingsListView(settingsListFragment);
        settingsListModelImplementation.setSettingsListPresenter(settingsListPresenterImplementation);
    }

}
