package com.antonioje.sendmessageviewbinding;

import android.content.Context;

import androidx.annotation.NonNull;

import com.danielstone.materialaboutlibrary.MaterialAboutActivity;
import com.danielstone.materialaboutlibrary.items.MaterialAboutActionItem;
import com.danielstone.materialaboutlibrary.model.MaterialAboutCard;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;

public class AboutActivity extends MaterialAboutActivity {
    @Override
    @NonNull
    protected MaterialAboutList getMaterialAboutList(@NonNull Context context) {
        MaterialAboutCard.Builder card = new MaterialAboutCard.Builder();
        card.addItem(new MaterialAboutActionItem.Builder()
                .text("Version")
                .subText("1.0.0")
                .icon(R.drawable.ic_action_send)
                .build());
        return new MaterialAboutList.Builder()
                .addCard(card.build())
                .build();
    }

    @Override
    protected CharSequence getActivityTitle() {
        return getString(R.string.menu_about);
    }

}
