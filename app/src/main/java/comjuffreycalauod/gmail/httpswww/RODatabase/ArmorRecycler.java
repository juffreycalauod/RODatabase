package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import com.crashlytics.android.Crashlytics;

import java.util.ArrayList;

import io.fabric.sdk.android.Fabric;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 8/22/2017.
 */

public class ArmorRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener {


    private  ArmorsRecyclerAdapter armorsRecyclerAdapter;






    String [] text_Res;

    int [] img_Res = {R.drawable.adventurerssuit,R.drawable.aebeceessragingtyphoonarmor,R.drawable.angeldress,R.drawable.angelicprotection,R.drawable.armorofnaga,
            R.drawable.assassinsrobe,R.drawable.assaulterplate,R.drawable.blessedholyrobe,R.drawable.boneplate,R.drawable.brynhild,R.drawable.chainmail,
            R.drawable.chameleonarmor,R.drawable.claytoscrackingeartharmor,R.drawable.coat,R.drawable.cottonshirt,R.drawable.diabolusarmor,R.drawable.diabolusrobe,
            R.drawable.divinecloth,R.drawable.dragonvest,R.drawable.elitearchersuit,R.drawable.eliteengineerarmor,R.drawable.eliteshootersuit,
            R.drawable.formalsuit,R.drawable.freyjaovercoat,R.drawable.fullplate,R.drawable.glitteringjacket,R.drawable.gloriousmassproductionsuit,R.drawable.gloriouspopularizedsuit,
            R.drawable.glorioussuit,R.drawable.goibnesarmor,R.drawable.goldenarmor,R.drawable.holyrobe,R.drawable.improvedtights,R.drawable.incredibleeventresignationcoat,
            R.drawable.jacket,R.drawable.kandura,R.drawable.legionplatearmor,R.drawable.lifelink,R.drawable.lordsclothes,R.drawable.luciussfiercearmorofvolcano,
            R.drawable.magecoat,R.drawable.mantle,R.drawable.medicsrobe,R.drawable.meteoplatearmor,R.drawable.minkcoat,R.drawable.ninjasuit,R.drawable.noviceadventurerssuit,
            R.drawable.novicebreastplate,R.drawable.odinsblessing,R.drawable.oldgreenpantie,R.drawable.orleanssgown,R.drawable.paddedarmor,
            R.drawable.pantie,R.drawable.recuperativearmor,R.drawable.robeofcast,R.drawable.saintsrobe,R.drawable.saphiensarmorofocean,R.drawable.scapulare,
            R.drawable.silkrobe,R.drawable.silverrobe,R.drawable.snipingsuit,R.drawable.spiritualtunic,R.drawable.sprintmail,R.drawable.tatterednoviceninjasuit,R.drawable.thiefclothes,R.drawable.tights,
            R.drawable.usedmagecoat,R.drawable.valkyrianarmor,R.drawable.warlocksbattlerobe,R.drawable.weddingdress,R.drawable.woodenmail};


    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.armor_recycler);

        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;

        recyclerView = (RecyclerView) findViewById(R.id.recyclerwidget_armor);

        text_Res = getResources().getStringArray(R.array.armor_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        armorsRecyclerAdapter= new ArmorsRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(armorsRecyclerAdapter);






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items,menu);
        MenuItem menuitem = menu.findItem(action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuitem);
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


        ArrayList<DataProvider> filterArrayList = new ArrayList<>();

        for(DataProvider dataProvider: arrayList)

        {
            String searchText = dataProvider.getText_res().toLowerCase();

            if(searchText.startsWith(newText))

            {

                filterArrayList.add(dataProvider);

            }


        }

        armorsRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }



}
