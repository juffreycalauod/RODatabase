package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mr.Darkycible on 10/2/2017.
 */

public class Maps_details extends AppCompatActivity {


    ImageView imageView;
    TextView textview, textview1,textview2,textview3,textview4,textview5,textview6,textview7;

    String  text ;
    String xmlarrays[];
    int [] xmlarraysint={R.array.ama_fild01,R.array.ayo_fild01,R.array.ayo_fild02,R.array.bif_fild01,R.array.bif_fild02,
            R.array.bra_fild01,R.array.cmd_fild01,R.array.cmd_fild02,R.array.cmd_fild03,R.array.cmd_fild04
            ,R.array.cmd_fild05,R.array.cmd_fild06,R.array.cmd_fild07,R.array.cmd_fild08,R.array.cmd_fild09
            ,R.array.dew_fild01,R.array.dic_fild01,R.array.dic_fild02,R.array.dicastes02,R.array.ecl_fild01,
            R.array.ein_fild01,R.array.ein_fild02,R.array.ein_fild03,R.array.ein_fild04,R.array.ein_fild05,
            R.array.ein_fild06,R.array.ein_fild07,R.array.ein_fild08,R.array.ein_fild09,R.array.ein_fild10,
            R.array.einbech,R.array.gef_fild00,R.array.gef_fild01,R.array.gef_fild02,R.array.gef_fild03
            ,R.array.gef_fild04,R.array.gef_fild05,R.array.gef_fild06,R.array.gef_fild07,R.array.gef_fild08,
            R.array.gef_fild09,R.array.gef_fild10,R.array.gef_fild11,R.array.gef_fild12,R.array.gef_fild14,
            R.array.gon_fild01,R.array.hu_fild01,R.array.hu_fild02,R.array.hu_fild03,R.array.hu_fild04,
            R.array.hu_fild05,R.array.hu_fild06,R.array.hu_fild07,R.array.lhz_fild01,R.array.lhz_fild02,
            R.array.lhz_fild03,R.array.lou_fild01,R.array.ma_fild01,R.array.ma_fild02,R.array.man_fild01
            ,R.array.man_fild02,R.array.man_fild03,R.array.mid_camp,R.array.mjolnir_01,R.array.mjolnir_02,
            R.array.mjolnir_03,R.array.moc_fild01,R.array.moc_fild02,R.array.moc_fild03,R.array.moc_fild07
            ,R.array.moc_fild11,R.array.moc_fild12,R.array.moc_fild13,R.array.moc_fild16,R.array.moc_fild17
            ,R.array.moc_fild18,R.array.moc_fild19,R.array.moc_fild22,R.array.moc_ruins,R.array.moro_vol,
            R.array.mosk_fild02,R.array.nif_fild01,R.array.nif_fild02,R.array.pay_arche,R.array.pay_fild01
            ,R.array.pay_fild02,R.array.pay_fild03,R.array.pay_fild04,R.array.pay_fild05,R.array.pay_fild06,
            R.array.pay_fild07,R.array.pay_fild08,R.array.pay_fild09,R.array.pay_fild10,R.array.pay_fild11,
            R.array.prt_fild00,R.array.prt_fild01,R.array.prt_fild02,R.array.prt_fild03,R.array.prt_fild04
            ,R.array.prt_fild05,R.array.prt_fild06,R.array.prt_fild07,R.array.prt_fild08,R.array.prt_fild09,
            R.array.prt_fild10,R.array.prt_fild11,R.array.prt_monk,R.array.ra_fild01,R.array.ra_fild02,
            R.array.ra_fild03,R.array.ra_fild04,R.array.ra_fild05,R.array.ra_fild06,R.array.ra_fild07,
            R.array.ra_fild08,R.array.ra_fild09,R.array.ra_fild10,R.array.ra_fild11,R.array.ra_fild12
            ,R.array.ra_fild13,R.array.rockrdg1,R.array.rockrdg2,R.array.spl_fild01,R.array.spl_fild02,
            R.array.spl_fild03,R.array.um_fild01,R.array.um_fild02,R.array.um_fild03,R.array.um_fild04
            ,R.array.ve_fild01,R.array.ve_fild02,R.array.ve_fild03,R.array.ve_fild04,R.array.ve_fild05
            ,R.array.ve_fild06,R.array.ve_fild07,R.array.xmas_fild01,R.array.yggdrasil01,R.array.yuno_fild01,
            R.array.yuno_fild02,R.array.yuno_fild03,R.array.yuno_fild04,R.array.yuno_fild05,R.array.yuno_fild06,
            R.array.yuno_fild07,R.array.yuno_fild08,R.array.yuno_fild09,R.array.yuno_fild10,R.array.yuno_fild11,
            R.array.yuno_fild12,
            R.array.abbey01,
            R.array.abbey02,
            R.array.abbey03,
            R.array.abyss_01,
            R.array.abyss_02,
            R.array.abyss_03,
            R.array.alde_dun01,
            R.array.alde_dun02,
            R.array.alde_dun03,
            R.array.alde_dun04,
            R.array.ama_dun01,
            R.array.ama_dun02,
            R.array.ama_dun03,
            R.array.anthell01,
            R.array.anthell02,
            R.array.ayo_dun01,
            R.array.ayo_dun02,
            R.array.beach_dun,
            R.array.beach_dun2,
            R.array.beach_dun3,
            R.array.bra_dun01,
            R.array.bra_dun02,
            R.array.c_tower1,
            R.array.c_tower2,
            R.array.c_tower2,
            R.array.c_tower3,
            R.array.c_tower3,
            R.array.c_tower4,
            R.array.dew_dun01,
            R.array.dew_dun02,
            R.array.dic_dun01,
            R.array.dic_dun02,
            R.array.dic_dun03,
            R.array.ecl_tdun01,
            R.array.ecl_tdun02,
            R.array.ecl_tdun03,
            R.array.ecl_tdun04,
            R.array.ein_dun01,
            R.array.ein_dun02,
            R.array.gef_dun00,
            R.array.gef_dun01,
            R.array.gef_dun02,
            R.array.gef_dun03,
            R.array.gefenia01,
            R.array.gefenia02,
            R.array.gefenia03,
            R.array.gefenia04,
            R.array.gl_cas01,
            R.array.gl_cas02,
            R.array.gl_church,
            R.array.gl_chyard,
            R.array.gl_in01,
            R.array.gl_knt01,
            R.array.gl_knt02,
            R.array.gl_prison,
            R.array.gl_prison1,
            R.array.gl_sew01,
            R.array.gl_sew02,
            R.array.gl_sew03,
            R.array.gl_step,
            R.array.gon_dun01,
            R.array.gon_dun02,
            R.array.gon_dun03,
            R.array.hugel,
            R.array.ice_dun01,
            R.array.ice_dun02,
            R.array.ice_dun03,
            R.array.ice_dun04,
            R.array.in_sphinx1,
            R.array.in_sphinx2,
            R.array.in_sphinx3,
            R.array.in_sphinx4,
            R.array.in_sphinx5,
            R.array.iz_dun00,
            R.array.iz_dun01,
            R.array.iz_dun02,
            R.array.iz_dun03,
            R.array.iz_dun04,
            R.array.jupe_core,
            R.array.juperos_01,
            R.array.juperos_02,
            R.array.kh_dun01,
            R.array.kh_dun02,
            R.array.lasa_dun01,
            R.array.lasa_dun02,
            R.array.lasa_dun03,
            R.array.lasa_dun_q,
            R.array.lhz_dun01,
            R.array.lhz_dun02,
            R.array.lhz_dun03,
            R.array.lou_dun01,
            R.array.lou_dun02,
            R.array.lou_dun03,
            R.array.ma_dun01,
            R.array.mag_dun01,
            R.array.mag_dun02,
            R.array.mal_dun01,
            R.array.mjo_dun01,
            R.array.mjo_dun02,
            R.array.mjo_dun03,
            R.array.moc_pryd01,
            R.array.moc_pryd02,
            R.array.moc_pryd03,
            R.array.moc_pryd04,
            R.array.moc_prydb1,
            R.array.mosk_dun01,
            R.array.mosk_dun02,
            R.array.mosk_dun03,
            R.array.nameless_in,
            R.array.nameless_n,
            R.array.nyd_dun01,
            R.array.nyd_dun02,
            R.array.odin_tem01,
            R.array.odin_tem02,
            R.array.odin_tem03,
            R.array.orcsdun01,
            R.array.orcsdun02,
            R.array.pay_dun00,
            R.array.pay_dun01,
            R.array.pay_dun02,
            R.array.pay_dun03,
            R.array.pay_dun04,
            R.array.prt_maze01,
            R.array.prt_maze02,
            R.array.prt_maze03,
            R.array.prt_sewb1,
            R.array.prt_sewb2,
            R.array.prt_sewb3,
            R.array.prt_sewb4,
            R.array.ra_san01,
            R.array.ra_san02,
            R.array.ra_san03,
            R.array.ra_san04,
            R.array.ra_san05,
            R.array.ra_temin,
            R.array.tha_t01,
            R.array.tha_t02,
            R.array.tha_t03,
            R.array.tha_t04,
            R.array.tha_t05,
            R.array.tha_t06,
            R.array.tha_t07,
            R.array.tha_t08,
            R.array.tha_t09,
            R.array.tha_t10,
            R.array.tha_t11,
            R.array.tha_t12,
            R.array.thana_boss,
            R.array.thor_camp,
            R.array.thor_v01,
            R.array.thor_v02,
            R.array.thor_v03,
            R.array.treasure01,
            R.array.treasure02,
            R.array.tur_dun01,
            R.array.tur_dun02,
            R.array.tur_dun03,
            R.array.tur_dun04,
            R.array.um_dun01,
            R.array.um_dun02,
            R.array.umbala,
            R.array.xmas,
            R.array.xmas_dun01,
            R.array.xmas_dun02};

    int img ;



    int position;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_details);


        imageView = findViewById(R.id.ama_fild01details_img);
        textview = findViewById(R.id.ama_fild01details_txt);
        textview1 = findViewById(R.id.mob1);
        textview2 =findViewById(R.id.mob2);
        textview3 = findViewById(R.id.mob3);
        textview4 = findViewById(R.id.mob4);
        textview5 = findViewById(R.id.mob5);
        textview6 = findViewById(R.id.mob6);
        textview7 =findViewById(R.id.mob7);


        Intent intent =getIntent();

      img =  intent.getExtras().getInt("IMG");
        position = intent.getExtras().getInt("POSITION");


        for(int i = 0;i <xmlarraysint.length;i++)

        {

            if (position == i)

            {




                xmlarrays = getResources().getStringArray(xmlarraysint[i]);


        try {

            textview1.setText(xmlarrays[0]);
            textview2.setText(xmlarrays[1]);
            textview3.setText(xmlarrays[2]);
            textview4.setText(xmlarrays[3]);
            textview5.setText(xmlarrays[4]);
            textview6.setText(xmlarrays[5]);
            textview7.setText(xmlarrays[6]);


        }

        catch (IndexOutOfBoundsException ex)

        {
            if (textview5 == null) {
                textview5.setText("");
            }

            if(textview6 == null)

            {


                textview6.setText("");

            }

            if(textview7 == null)
            {

                textview7.setText("");
            }

        }

            }

        }















        imageView.setImageResource(img);



        text = intent.getExtras().getString("NAME");

        textview.setText(text);




















    }
}
