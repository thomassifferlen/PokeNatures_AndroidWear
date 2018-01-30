package com.example.aliennoob.pokenatures;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.jar.Attributes;

import android.widget.LinearLayout;
import android.widget.TextView;

import 	android.graphics.Color;

import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;

import android.view.View;


public class Natures_Activity extends WearableActivity
{

    private List<Nature> Natures_List;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natures);


        this.Natures_List = new ArrayList<Nature>();

        this.Natures_List.add( new Nature("Bold", "Assuré", "Def+", "Att-"));
        this.Natures_List.add( new Nature("Quirky", "Bizarre", "None", "None"));
        this.Natures_List.add( new Nature("Brave", "Brave", "Att+", "Speed-"));
        this.Natures_List.add( new Nature("Calm", "Calme", "SpDef+", "Att-"));
        this.Natures_List.add( new Nature("Quiet", "Discret", "SpAtt+", "Speed-"));
        this.Natures_List.add( new Nature("Docile", "Docile", "None", "None"));
        this.Natures_List.add( new Nature("Mild", "Doux", "SpAtt+", "Def-"));
        this.Natures_List.add( new Nature("Rash", "Foufou", "SpAtt+", "SpDef-"));
        this.Natures_List.add( new Nature("Gentle", "Gentil", "SpDef+", "Def-"));
        this.Natures_List.add( new Nature("Hardy", "Hardi", "None", "None"));
        this.Natures_List.add( new Nature("Jolly", "Jovial", "Speed+", "SpAtt-"));
        this.Natures_List.add( new Nature("Lax", "Lâche", "Def+", "SpDef-"));
        this.Natures_List.add( new Nature("Impish", "Malin", "Def+", "SpAtt-"));
        this.Natures_List.add( new Nature("Sassy", "Malpoli", "SpDef+", "Speed-"));
        this.Natures_List.add( new Nature("Naughty", "Mauvais", "Att+", "SpDef-"));
        this.Natures_List.add( new Nature("Modest", "Modeste", "SpAtt+", "Att-"));
        this.Natures_List.add( new Nature("Naive", "Naif", "Speed+", "SpDef-"));
        this.Natures_List.add( new Nature("Hasty", "Pressé", "Speed+", "Def-"));
        this.Natures_List.add( new Nature("Careful", "Prudent", "SpDef+", "SpAtt-"));
        this.Natures_List.add( new Nature("Bashful", "Pudique", "None", "None"));
        this.Natures_List.add( new Nature("Relaxed", "Relax", "Def+", "Speed-"));
        this.Natures_List.add( new Nature("Adamant", "Rigide", "Att+", "SpAtt-"));
        this.Natures_List.add( new Nature("Serious", "Sérieux", "None", "None"));
        this.Natures_List.add( new Nature("Lonely", "Solo", "Att+", "Def-"));
        this.Natures_List.add( new Nature("Timid", "Timide", "Speed+", "Att-"));

        LinearLayout layout = (LinearLayout) findViewById(R.id.grid);

        ListIterator<Nature> it = this.Natures_List.listIterator();
        while(it.hasNext())
        {
            Nature Nat = it.next();

            LinearLayout tmpLayout = new LinearLayout(this);
            tmpLayout.setOrientation(LinearLayout.HORIZONTAL);

            /*LayoutParams params = tmpLayout.getLayoutParams();
            params.height = 100;
            params.width = 100;
            tmpLayout.setLayoutParams(params);*/

            tmpLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT
            ));

            TextView NameFrench = new TextView(this);
            NameFrench.setText(Nat.FrenchName);
            NameFrench.setTextSize(18);
            tmpLayout.addView(NameFrench);

            TextView NameEnglish = new TextView(this);
            NameEnglish.setText(" (" + Nat.EnglishName + ") : ");
            //NameEnglish.setTextColor(Color.parseColor("#27ae60"));
            NameEnglish.setTextSize(12);
            tmpLayout.addView(NameEnglish);

            TextView Buff = new TextView(this);
            Buff.setText(Nat.Buff);
            Buff.setTextColor(Color.parseColor("#27ae60"));
            tmpLayout.addView(Buff);

            TextView separator2 = new TextView(this);
            separator2.setText(" ");
            tmpLayout.addView(separator2);

            TextView DeBuff = new TextView(this);
            DeBuff.setText(Nat.Debuff);
            DeBuff.setTextColor(Color.parseColor("#e74c3c"));
            tmpLayout.addView(DeBuff);

            View v = new View(this);
            v.setLayoutParams(new LinearLayout.LayoutParams(
                    LayoutParams.MATCH_PARENT,
                    2
            ));
            v.setBackgroundColor(Color.parseColor("#B3B3B3"));

            layout.addView(v);

            layout.addView(tmpLayout);
        }

        // Enables Always-on
        setAmbientEnabled();
    }

}
