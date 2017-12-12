package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import pl.droidsonroids.gif.GifTextView;

public class Monster_details extends AppCompatActivity {


    TextView textview,textview0,textview1,textview2,textview3,textview4,textview5,textview6,textview7,
            textview8,textview9,textview10,textview11,textview12,textview13,textview14,textview15,textview16,textview17;




    GifTextView gifTextView;
    int img_id =0;
    String [] hp;
    String [] level;
    String [] race;
    String [] property;
    String [] size;
    String [] hit;
    String [] flee;
    String [] walkspeed;
    String [] attack;
    String [] def;
    String [] baseexp;
    String [] jobexp;
    String [] str;
    String [] agi;
    String [] vit;
    String [] Int;
    String [] Dex;
    String [] Luk;
    String  name;



   int  position = 0  ;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_details);



        gifTextView = (GifTextView)  findViewById(R.id.testabyssmalkobold);



        textview = (TextView) findViewById(R.id.hp_txt);
        textview0 = (TextView) findViewById(R.id.level_txt);
        textview1 = (TextView) findViewById(R.id.race_txt);
        textview2 = (TextView) findViewById(R.id.property_txt);
        textview3 = (TextView) findViewById(R.id.size_txt);
        textview4 = (TextView) findViewById(R.id.hit_txt);
        textview5 = (TextView) findViewById(R.id.flee_txt);
        textview6 = (TextView) findViewById(R.id.walkspeed_txt);
        textview7 = (TextView) findViewById(R.id.attack_txt);
        textview8 = (TextView) findViewById(R.id.def_txt);
        textview9 = (TextView) findViewById(R.id.baseexperience_txt);
        textview10 = (TextView) findViewById(R.id.jobexperience_txt);
        textview11= (TextView) findViewById(R.id.str_txt);
        textview12 = (TextView) findViewById(R.id.agi_txt);
        textview13= (TextView) findViewById(R.id.vit_txt);
        textview14 = (TextView) findViewById(R.id.int_txt);
        textview15= (TextView) findViewById(R.id.dex_txt);
        textview16 = (TextView) findViewById(R.id.luk_txt);
        textview17 = (TextView) findViewById(R.id.name_txt);


        Intent intent = getIntent();


       img_id = intent.getExtras().getInt("GIF");
        name  = intent.getExtras().getString("NAME");



        gifTextView.setBackgroundResource(img_id);

        hp = getResources().getStringArray(R.array.hp);
        level = getResources().getStringArray(R.array.Level);
        race = getResources().getStringArray(R.array.Race);
        property = getResources().getStringArray(R.array.Property);
        size = getResources().getStringArray(R.array.Size);
        hit = getResources().getStringArray(R.array.Hit);
        flee = getResources().getStringArray(R.array.FLEE);
        walkspeed = getResources().getStringArray(R.array.WALKSPEED);
        attack = getResources().getStringArray(R.array.ATTACk);
        def = getResources().getStringArray(R.array.DEF);
        baseexp = getResources().getStringArray(R.array.BASEXP);
        jobexp = getResources().getStringArray(R.array.JobEXP);
        str = getResources().getStringArray(R.array.STR);
        agi = getResources().getStringArray(R.array.AGI);
        vit = getResources().getStringArray(R.array.VIT);
        Int = getResources().getStringArray(R.array.INT);
        Dex = getResources().getStringArray(R.array.DEXX);
        Luk = getResources().getStringArray(R.array.Luk);






        position = intent.getExtras().getInt("POSITION");








            textview.setText(hp[position]);
        textview0.setText(level[position]);
        textview1.setText(race[position]);
        textview2.setText(property[position]);
        textview3.setText(size[position]);
        textview4.setText(hit[position]);
        textview5.setText(flee[position]);
        textview6.setText(walkspeed[position]);
        textview7.setText(attack[position]);
        textview8.setText(def[position]);
        textview9.setText(baseexp[position]);
        textview10.setText(jobexp[position]);
        textview11.setText(str[position]);
        textview12.setText(agi[position]);
        textview13.setText(vit[position]);
        textview14.setText(Int[position]);
        textview15.setText(Dex[position]);
        textview16.setText(Luk[position]);
        textview17.setText(name);





















    }
}
