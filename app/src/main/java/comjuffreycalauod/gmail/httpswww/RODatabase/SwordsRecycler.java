package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 8/15/2017.
 */

public class SwordsRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener
{



    private  SwordsRecyclerAdapter swordsRecyclerAdapter;




    String [] text_Res;



    int [] img_Res = {R.drawable.blade,R.drawable.bravegladiatorblade,R.drawable.byeollungum,R.drawable.caesarssword,
            R.drawable.curvedsword,R.drawable.cutlus,R.drawable.edge,R.drawable.edger,R.drawable.elementalsword,R.drawable.excalibur,
            R.drawable.falchion,R.drawable.fireblend,R.drawable.flamberge,R.drawable.gaiasword,R.drawable.gloriusflamberge,
            R.drawable.gloriousholyavenger,R.drawable.gloriusrapier,R.drawable.haedonggum,R.drawable.holyavenger,
            R.drawable.holysaber,R.drawable.honglyunssword,R.drawable.icefalchion,R.drawable.immaterialsword,
            R.drawable.jeweledsword,R.drawable.mysteltainn,R.drawable.nagan,R.drawable.novicefalchion,
            R.drawable.orchishsword,R.drawable.platinumshotel,R.drawable.rapier,R.drawable.refinedfireblend,
            R.drawable.refinedimmaterialsword,R.drawable.refinednagann,R.drawable.ringpommelsaber,R.drawable.rubber,
            R.drawable.saber,R.drawable.sashimi,R.drawable.scimitar,R.drawable.solarsword,R.drawable.stardustblade,
            R.drawable.sword,R.drawable.tirfing,R.drawable.townsword,R.drawable.tsurugi,R.drawable.twinedgeofnaghtsieger,R.drawable.valorousgladiatorblade};


        ArrayList<DataProvider> arrayList = new ArrayList<>();

    int i = 0;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swords_recycler);


        RecyclerView recyyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;

        recyyclerView = (RecyclerView) findViewById(R.id.recyclerwidget_swords);
        text_Res = getResources().getStringArray(R.array.swords_array);

        for(String name: text_Res)

        {


            DataProvider dataProvider = new DataProvider(img_Res[i],name);

            arrayList.add(dataProvider);
            i++;



        }


        swordsRecyclerAdapter = new SwordsRecyclerAdapter(arrayList,this);
        recyyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyyclerView.setLayoutManager(recyclerLayoutManager);
        recyyclerView.setAdapter(swordsRecyclerAdapter);





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)


    {

        getMenuInflater().inflate(R.menu.menu_items,menu);
        MenuItem menuitem = menu.findItem(action_search);

        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuitem);
        searchView.setOnQueryTextListener(this);






        return true;
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

            filterArrayList.add(dataProvider);



        }


        swordsRecyclerAdapter.setFilter(filterArrayList);











        return false;
    }
}
