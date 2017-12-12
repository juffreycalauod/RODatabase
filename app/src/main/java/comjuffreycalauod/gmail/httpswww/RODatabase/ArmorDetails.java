package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Mr.Darkycible on 9/25/2017.
 */

public class ArmorDetails extends AppCompatActivity {


    TextView armorName,armorType,armorDefense,armorBuy,armorSell,armorWeight,armorRequiredlvl,armorApplicablejobs,armorDescription,armorDroppedby,armorBuyableatNpc,armorObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String [] type ,defense,buy,sell,weight,requiredlvl,applicablejobs,description,droppedby,buyabletannpc,obtainablefrom;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.armor_info);

        armorName =  findViewById(R.id.armorname_txt);
        armorType =  findViewById(R.id.armortype_txt);
        armorDefense = (TextView)findViewById(R.id.armordefense_txt);
        armorBuy = (TextView) findViewById(R.id.armorbuy_txt);
        armorSell = (TextView) findViewById(R.id.armorsell_txt);
        armorWeight =(TextView) findViewById(R.id.armorweight_txt);
        armorRequiredlvl =(TextView)findViewById(R.id.armorreuiredlvl_txt);
        armorApplicablejobs = (TextView) findViewById(R.id.armorApplicableJobs_txt);
        armorDescription = (TextView) findViewById(R.id.armorDescription_txt);
        armorDroppedby =(TextView) findViewById(R.id.armorDroppedby_txt);
        armorBuyableatNpc = (TextView) findViewById(R.id.armorBuyableatNPC_txt);
        armorObtainablefrom = (TextView) findViewById(R.id.armorObtainable_txt);
        imageView  =(ImageView) findViewById(R.id.armor_img);



        type = getResources().getStringArray(R.array.armorTyppe);
        defense= getResources().getStringArray(R.array.armorDefense);
        buy= getResources().getStringArray(R.array.armorBUY);
        sell= getResources().getStringArray(R.array.armorSELL);
        weight= getResources().getStringArray(R.array.armorWEIGHT);
        requiredlvl= getResources().getStringArray(R.array.armorrequiredLVL);
        applicablejobs= getResources().getStringArray(R.array.armorapplicableJobs);
        description = getResources().getStringArray(R.array.armorDescription);
        droppedby= getResources().getStringArray(R.array.armorDropedby);
        buyabletannpc= getResources().getStringArray(R.array.armorBuyableatNpc);
        obtainablefrom= getResources().getStringArray(R.array.armorObtainablefrom);








        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name= intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");



        armorName.setText(name);
        imageView.setImageResource(img);

        armorType.setText(type[position]);
        armorDefense.setText(defense[position]);
        armorBuy.setText(buy[position]);
        armorSell.setText(sell[position]);
        armorWeight.setText(weight[position]);
        armorRequiredlvl.setText(requiredlvl[position]);
        armorApplicablejobs.setText(applicablejobs[position]);
        armorDescription.setText(description[position]);
        armorDroppedby.setText(droppedby[position]);
        armorBuyableatNpc.setText(buyabletannpc[position]);
        armorObtainablefrom.setText(obtainablefrom[position]);

























    }
}
