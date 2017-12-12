package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 10/2/2017.
 */

public class Maps_Recycler extends AppCompatActivity implements SearchView.OnQueryTextListener {




     RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MapsRecyclerAdapter mapsRecyclerAdapter;

    int img_res [] = {R.drawable.ama_fild01,R.drawable.ayo_fild01,R.drawable.ayo_fild02,R.drawable.bif_fild01,R.drawable.bif_fild02,
            R.drawable.bra_fild01,R.drawable.cmd_fild01,R.drawable.cmd_fild02,R.drawable.cmd_fild03,R.drawable.cmd_fild04
            ,R.drawable.cmd_fild05,R.drawable.cmd_fild06,R.drawable.cmd_fild07,R.drawable.cmd_fild08,R.drawable.cmd_fild09
            ,R.drawable.dew_fild01,R.drawable.dic_fild01,R.drawable.dic_fild02,R.drawable.dicastes02,R.drawable.ecl_fild01,
            R.drawable.ein_fild01,R.drawable.ein_fild02,R.drawable.ein_fild03,R.drawable.ein_fild04,R.drawable.ein_fild05,
            R.drawable.ein_fild06,R.drawable.ein_fild07,R.drawable.ein_fild08,R.drawable.ein_fild09,R.drawable.ein_fild10,
            R.drawable.einbech,R.drawable.gef_fild00,R.drawable.gef_fild01,R.drawable.gef_fild02,R.drawable.gef_fild03
            ,R.drawable.gef_fild04,R.drawable.gef_fild05,R.drawable.gef_fild06,R.drawable.gef_fild07,R.drawable.gef_fild08,
            R.drawable.gef_fild09,R.drawable.gef_fild10,R.drawable.gef_fild11,R.drawable.gef_fild12,R.drawable.gef_fild14,
            R.drawable.gon_fild01,R.drawable.hu_fild01,R.drawable.hu_fild02,R.drawable.hu_fild03,R.drawable.hu_fild04,
            R.drawable.hu_fild05,R.drawable.hu_fild06,R.drawable.hu_fild07,R.drawable.lhz_fild01,R.drawable.lhz_fild02,
            R.drawable.lhz_fild03,R.drawable.lou_fild01,R.drawable.ma_fild01,R.drawable.ma_fild02,R.drawable.man_fild01
            ,R.drawable.man_fild02,R.drawable.man_fild03,R.drawable.mid_camp,R.drawable.mjolnir_01,R.drawable.mjolnir_02,
            R.drawable.mjolnir_03,R.drawable.moc_fild01,R.drawable.moc_fild02,R.drawable.moc_fild03,R.drawable.moc_fild07
            ,R.drawable.moc_fild11,R.drawable.moc_fild12,R.drawable.moc_fild13,R.drawable.moc_fild16,R.drawable.moc_fild17
            ,R.drawable.moc_fild18,R.drawable.moc_fild19,R.drawable.moc_fild22,R.drawable.moc_ruins,R.drawable.moro_vol,
            R.drawable.mosk_fild02,R.drawable.nif_fild01,R.drawable.nif_fild02,R.drawable.pay_arche,R.drawable.pay_fild01
            ,R.drawable.pay_fild02,R.drawable.pay_fild03,R.drawable.pay_fild04,R.drawable.pay_fild05,R.drawable.pay_fild06,
            R.drawable.pay_fild07,R.drawable.pay_fild08,R.drawable.pay_fild09,R.drawable.pay_fild10,R.drawable.pay_fild11,
            R.drawable.prt_fild00,R.drawable.prt_fild01,R.drawable.prt_fild02,R.drawable.prt_fild03,R.drawable.prt_fild04
            ,R.drawable.prt_fild05,R.drawable.prt_fild06,R.drawable.prt_fild07,R.drawable.prt_fild08,R.drawable.prt_fild09,
            R.drawable.prt_fild10,R.drawable.prt_fild11,R.drawable.prt_monk,R.drawable.ra_fild01,R.drawable.ra_fild02,
            R.drawable.ra_fild03,R.drawable.ra_fild04,R.drawable.ra_fild05,R.drawable.ra_fild06,R.drawable.ra_fild07,
            R.drawable.ra_fild08,R.drawable.ra_fild09,R.drawable.ra_fild10,R.drawable.ra_fild11,R.drawable.ra_fild12
            ,R.drawable.ra_fild13,R.drawable.rockrdg1,R.drawable.rockrdg2,R.drawable.spl_fild01,R.drawable.spl_fild02,
            R.drawable.spl_fild03,R.drawable.um_fild01,R.drawable.um_fild02,R.drawable.um_fild03,R.drawable.um_fild04
            ,R.drawable.ve_fild01,R.drawable.ve_fild02,R.drawable.ve_fild03,R.drawable.ve_fild04,R.drawable.ve_fild05
            ,R.drawable.ve_fild06,R.drawable.ve_fild07,R.drawable.xmas_fild01,R.drawable.yggdrasil01,R.drawable.yuno_fild01,
            R.drawable.yuno_fild02_re,R.drawable.yuno_fild03,R.drawable.yuno_fild04,R.drawable.yuno_fild05,R.drawable.yuno_fild06, R.drawable.yuno_fild07,R.drawable.yuno_fild08,R.drawable.yuno_fild09,R.drawable.yuno_fild10,R.drawable.yuno_fild11,R.drawable.
            yuno_fild12,
            R.drawable.abbey01,
            R.drawable.abbey02,
            R.drawable.abbey03,
            R.drawable.abyss_01,
            R.drawable.abyss_02,
            R.drawable.abyss_03,
            R.drawable.alde_dun01,
            R.drawable.alde_dun02,
            R.drawable.alde_dun03,
            R.drawable.alde_dun04,
            R.drawable.ama_dun01,
            R.drawable.ama_dun02,
            R.drawable.ama_dun03,
            R.drawable.anthell01,
            R.drawable.anthell02,
            R.drawable.ayo_dun01,
            R.drawable.ayo_dun02,
            R.drawable.beach_dun,
            R.drawable.beach_dun2,
            R.drawable.beach_dun3,
            R.drawable.bra_dun01,
            R.drawable.bra_dun02,
            R.drawable.c_tower1,
            R.drawable.c_tower2,
            R.drawable.c_tower2,
            R.drawable.c_tower3,
            R.drawable.c_tower3,
            R.drawable.c_tower4,
            R.drawable.dew_dun01,
            R.drawable.dew_dun02,
            R.drawable.dic_dun01,
            R.drawable.dic_dun02,
            R.drawable.dic_dun03,
            R.drawable.ecl_tdun01,
            R.drawable.ecl_tdun02,
            R.drawable.ecl_tdun03,
            R.drawable.ecl_tdun04,
            R.drawable.ein_dun01,
            R.drawable.ein_dun02,
            R.drawable.gef_dun00,
            R.drawable.gef_dun01,
            R.drawable.gef_dun02,
            R.drawable.gef_dun03,
            R.drawable.gefenia01,
            R.drawable.gefenia02,
            R.drawable.gefenia03,
            R.drawable.gefenia04,
            R.drawable.gl_cas01,
            R.drawable.gl_cas02,
            R.drawable.gl_church,
            R.drawable.gl_chyard,
            R.drawable.gl_in01,
            R.drawable.gl_knt01,
            R.drawable.gl_knt02,
            R.drawable.gl_prison,
            R.drawable.gl_prison1,
            R.drawable.gl_sew01,
            R.drawable.gl_sew02,
            R.drawable.gl_sew03,
            R.drawable.gl_step,
            R.drawable.gon_dun01,
            R.drawable.gon_dun02,
            R.drawable.gon_dun03,
            R.drawable.hugel,
            R.drawable.ice_dun01,
            R.drawable.ice_dun02,
            R.drawable.ice_dun03,
            R.drawable.ice_dun04,
            R.drawable.in_sphinx1,
            R.drawable.in_sphinx2,
            R.drawable.in_sphinx3,
            R.drawable.in_sphinx4,
            R.drawable.in_sphinx5,
            R.drawable.iz_dun00,
            R.drawable.iz_dun01,
            R.drawable.iz_dun02,
            R.drawable.iz_dun03,
            R.drawable.iz_dun04,
            R.drawable.jupe_core,
            R.drawable.juperos_01,
            R.drawable.juperos_02,
            R.drawable.kh_dun01,
            R.drawable.kh_dun02,
            R.drawable.lasa_dun01,
            R.drawable.lasa_dun02,
            R.drawable.lasa_dun03,
            R.drawable.lasa_dun_q,
            R.drawable.lhz_dun01,
            R.drawable.lhz_dun02,
            R.drawable.lhz_dun03,
            R.drawable.lou_dun01,
            R.drawable.lou_dun02,
            R.drawable.lou_dun03,
            R.drawable.ma_dun01,
            R.drawable.mag_dun01,
            R.drawable.mag_dun02,
            R.drawable.mal_dun01,
            R.drawable.mjo_dun01,
            R.drawable.mjo_dun02,
            R.drawable.mjo_dun03,
            R.drawable.moc_pryd01,
            R.drawable.moc_pryd02,
            R.drawable.moc_pryd03,
            R.drawable.moc_pryd04,
            R.drawable.moc_prydb1,
            R.drawable.mosk_dun01,
            R.drawable.mosk_dun02,
            R.drawable.mosk_dun03,
            R.drawable.nameless_in,
            R.drawable.nameless_n,
            R.drawable.nyd_dun01,
            R.drawable.nyd_dun02,
            R.drawable.odin_tem01,
            R.drawable.odin_tem02,
            R.drawable.odin_tem03,
            R.drawable.orcsdun01,
            R.drawable.orcsdun02,
            R.drawable.pay_dun00,
            R.drawable.pay_dun01,
            R.drawable.pay_dun02,
            R.drawable.pay_dun03,
            R.drawable.pay_dun04,
            R.drawable.prt_maze01,
            R.drawable.prt_maze02,
            R.drawable.prt_maze03,
            R.drawable.prt_sewb1,
            R.drawable.prt_sewb2,
            R.drawable.prt_sewb3,
            R.drawable.prt_sewb4,
            R.drawable.ra_san01,
            R.drawable.ra_san02,
            R.drawable.ra_san03,
            R.drawable.ra_san04,
            R.drawable.ra_san05,
            R.drawable.ra_temin,
            R.drawable.tha_t01,
            R.drawable.tha_t02,
            R.drawable.tha_t03,
            R.drawable.tha_t04,
            R.drawable.tha_t05,
            R.drawable.tha_t06,
            R.drawable.tha_t07,
            R.drawable.tha_t08,
            R.drawable.tha_t09,
            R.drawable.tha_t10,
            R.drawable.tha_t11,
            R.drawable.tha_t12,
            R.drawable.thana_boss,
            R.drawable.thor_camp,
            R.drawable.thor_v01,
            R.drawable.thor_v02,
            R.drawable.thor_v03,
            R.drawable.treasure01,
            R.drawable.treasure02,
            R.drawable.tur_dun01,
            R.drawable.tur_dun02,
            R.drawable.tur_dun03,
            R.drawable.tur_dun04,
            R.drawable.um_dun01,
            R.drawable.um_dun02,
            R.drawable.umbala,
            R.drawable.xmas,
            R.drawable.xmas_dun01,
            R.drawable.xmas_dun02};

    ArrayList<DataProvider> arrayList = new ArrayList<>();

    String [] text_res;


    int i = 0;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_recycler);





        recyclerView = (RecyclerView)findViewById(R.id.MyRecyclerMaps);

        text_res = getResources().getStringArray(R.array.maps);


        for(String name :text_res)
        {

            DataProvider dataProvider = new DataProvider(img_res[i],name);

            i++;

                arrayList.add(dataProvider);


        }



        mapsRecyclerAdapter = new MapsRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        layoutManager= new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mapsRecyclerAdapter);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items,menu);
        MenuItem menuItem = menu.findItem(action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(this);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        newText = newText.toLowerCase();
        ArrayList<DataProvider> filterarrayList = new ArrayList<>();

        for(DataProvider dataProvider : arrayList)

        {

            String searchtext  = dataProvider.getText_res().toLowerCase();
            if(searchtext.startsWith(newText))

            {


                filterarrayList.add(dataProvider);

            }







        }

        mapsRecyclerAdapter.setFilter(filterarrayList);




        return false;
    }


}
