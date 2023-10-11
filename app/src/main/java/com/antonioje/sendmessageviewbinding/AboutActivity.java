package com.antonioje.sendmessageviewbinding;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.danielstone.materialaboutlibrary.MaterialAboutActivity;
import com.danielstone.materialaboutlibrary.items.MaterialAboutActionItem;
import com.danielstone.materialaboutlibrary.model.MaterialAboutCard;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;

import java.util.concurrent.atomic.AtomicInteger;

public class AboutActivity extends MaterialAboutActivity {
    public final int  NVECES_INFO = 5;
    @Override
    @NonNull
    protected MaterialAboutList getMaterialAboutList(@NonNull Context context) {
        MaterialAboutCard.Builder authorCard = new MaterialAboutCard.Builder();
        AtomicInteger cont = new AtomicInteger(1);
        authorCard.title(R.string.cardAuthor_title);
        authorCard.addItem(new MaterialAboutActionItem.Builder()
                .text(R.string.cardAuthor_author)
                .subText(R.string.cardAuthor_region)
                .icon(R.drawable.ic_linkedin)
                .setOnClickAction(() -> {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/antonio-jim%C3%A9nez-espejo-8a4623292/ing"));
                    startActivity(intent);})
                .build());
        authorCard.addItem(new MaterialAboutActionItem.Builder()
                .text(R.string.cardAuthor_repository)
                .subText(R.string.cardAuthor_repositoryGit)
                .icon(R.drawable.ic_github)
                .setOnClickAction(() -> {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AJimesp/SendMessageViewBinding"));
                        startActivity(intent);})
                .build());
        MaterialAboutCard.Builder inforCard = new MaterialAboutCard.Builder();
        inforCard.title(R.string.cardInfo_title);
        inforCard.addItem(new MaterialAboutActionItem.Builder()
                .text(R.string.cardInfo_version)
                .subText(R.string.cardInfo_vnumber)
                .icon(R.drawable.ic_info)
                .setOnClickAction(() -> {
                    if(cont.get() == NVECES_INFO){
                        // Lanzo el intent si el usuario a pulsado 5 veces sobre la información
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://146.190.18.65/"));
                        startActivity(intent); cont.set(0);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Estás a " + (NVECES_INFO - cont.get())+ " pulsaciones de abrir mi WEB", Toast.LENGTH_SHORT).show();
                        cont.getAndIncrement();}
                })
                .build());
        inforCard.addItem(new MaterialAboutActionItem.Builder()
                .text(R.string.cardInfo_sendEmail)
                .subText(R.string.cardInfo_email)
                .icon(R.drawable.ic_email)
                .setOnClickAction(() -> {
                    Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "al.antonio.jimenez.espejo@iesportada.org", null));
                    startActivity(intent);})
                .build());
        return new MaterialAboutList(authorCard.build(),inforCard.build());

    }

    @Override
    protected CharSequence getActivityTitle() {
        return getString(R.string.menu_about);
    }

}
