package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mr.Darkycible on 9/26/2017.
 */

public class ShieldDetails extends AppCompatActivity {




    TextView shieldName,shieldType,shieldDefense,shieldBuy,shieldSell,shieldWeight,shieldRequiredlvl,shieldApplicablejobs,shieldDescription,shieldDroppedby,shieldBuyableatNpc,shieldObtainablefrom;

    Intent intent;
    int img;
    ImageView imageView;
    int position;

    String name;

    String [] type ,defense,buy,sell,weight,requiredlvl,applicablejobs,description,droppedby,buyabletannpc,obtainablefrom;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shield_details);


        shieldName = (TextView) findViewById(R.id.shieldname_txt);
        shieldType = (TextView) findViewById(R.id.shieldtype_txt);
        shieldDefense = (TextView)findViewById(R.id.shielddefense_txt);
        shieldBuy = (TextView) findViewById(R.id.shieldbuy_txt);
        shieldSell = (TextView) findViewById(R.id.shieldsell_txt);
        shieldWeight =(TextView) findViewById(R.id.shieldweight_txt);
        shieldRequiredlvl =(TextView)findViewById(R.id.shieldreuiredlvl_txt);
        shieldApplicablejobs = (TextView) findViewById(R.id.shieldApplicableJobs_txt);
        shieldDescription = (TextView) findViewById(R.id.shieldDescription_txt);
        shieldDroppedby =(TextView) findViewById(R.id.shieldDroppedby_txt);
        shieldBuyableatNpc = (TextView) findViewById(R.id.shieldBuyableatNPC_txt);
        shieldObtainablefrom = (TextView) findViewById(R.id.shieldObtainable_txt);
        imageView  =(ImageView) findViewById(R.id.shield_img);



        type = getResources().getStringArray(R.array.shieldtype);
        defense= getResources().getStringArray(R.array.shieldDefense);
        buy= getResources().getStringArray(R.array.shieldBuy);
        sell= getResources().getStringArray(R.array.shieldSELL);
        weight= getResources().getStringArray(R.array.shieldWEIGHT);
        requiredlvl= getResources().getStringArray(R.array.shieldrequiredLVL);
        applicablejobs= getResources().getStringArray(R.array.shieldapplicableJobs);
        description = getResources().getStringArray(R.array.shieldDescription);
        droppedby= getResources().getStringArray(R.array.shieldDroppedby);
        buyabletannpc= getResources().getStringArray(R.array.shieldBuyableatNpc);
        obtainablefrom= getResources().getStringArray(R.array.shieldObtainablefrom);





        intent = getIntent();

        img = intent.getExtras().getInt("IMG");
        name= intent.getExtras().getString("NAME");
        position = intent.getExtras().getInt("POSITION");



        shieldName.setText(name);
        imageView.setImageResource(img);

        shieldType.setText(type[position]);
        shieldDefense.setText(defense[position]);
        shieldBuy.setText(buy[position]);
        shieldSell.setText(sell[position]);
        shieldWeight.setText(weight[position]);
        shieldRequiredlvl.setText(requiredlvl[position]);
        shieldApplicablejobs.setText(applicablejobs[position]);
        shieldDescription.setText(description[position]);
        shieldDroppedby.setText(droppedby[position]);
        shieldBuyableatNpc.setText(buyabletannpc[position]);
        shieldObtainablefrom.setText(obtainablefrom[position]);




    }
}
