package com.example.danielmoreno.phonesettings.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.danielmoreno.phonesettings.R;

public class BaseActivity extends AppCompatActivity {
    private TextView mTitleTextView, mActionTitleTextView;
    private ImageView mActionImageView;
    private LinearLayout mActionLinearLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setCustomView(R.layout.action_bar);
            View view = getSupportActionBar().getCustomView();
            mTitleTextView = view.findViewById(R.id.action_bar_title_textView);
            mActionTitleTextView = view.findViewById(R.id.action_title_textView);
            mActionImageView = view.findViewById(R.id.action_imageView);
            mActionLinearLayout = view.findViewById(R.id.action_bar_options_linearLayout);
        }
    }

    /**
     * Sets the action bar title
     *
     * @param title Title to be set
     */
    public void setActivityTitle(String title) {
        mTitleTextView.setText(title);
    }

    /**
     * Sets the action button title
     *
     * @param title Title to be set
     */
    public void setActionTitle(String title) {
        mActionTitleTextView.setText(title);
    }

    /**
     * Sets the image for action bar
     * @param drawable Drawable Id for the image
     */
    public void setActionImage(int drawable) {
        Bitmap bitmap = BitmapFactory.decodeResource(getBaseContext().getResources(), drawable);
        mActionImageView.setImageBitmap(bitmap);
    }

    /**
     * Hides action buttons
     * @param hide boolean to hide the buttons
     */
    public void hideActionButtons(boolean hide) {
        if (hide) {
            mActionLinearLayout.setVisibility(View.GONE);
            return;
        }
        mActionLinearLayout.setVisibility(View.VISIBLE);
    }


}
