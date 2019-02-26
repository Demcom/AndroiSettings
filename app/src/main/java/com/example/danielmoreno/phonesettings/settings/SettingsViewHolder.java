package com.example.danielmoreno.phonesettings.settings;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.danielmoreno.phonesettings.R;

public class SettingsViewHolder extends RecyclerView.ViewHolder {
    private TextView mTitleTextView;
    private ImageView mIconImageView;

    public SettingsViewHolder(@NonNull View itemView) {
        super(itemView);
        setupView();
    }

    /**
     * Sets up the view elements
     */
    private void setupView() {
        mTitleTextView = itemView.findViewById(R.id.settingTextView);
        mIconImageView = itemView.findViewById(R.id.settingImageView);
    }

    /**
     * Sets the title passed
     *
     * @param title Title to be shown
     */
    public void setTitle(String title) {
        mTitleTextView.setText(title);
    }

    /**
     * Sets the image to the cell passing the image id
     *
     * @param imageId The id of the resource
     */
    public void setSettingImage(int imageId) {
        mIconImageView.setImageResource(imageId);

    }
}
