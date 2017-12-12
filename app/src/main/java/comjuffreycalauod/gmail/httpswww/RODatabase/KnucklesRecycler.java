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

import java.util.ArrayList;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 8/19/2017.
 */

public class KnucklesRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener
{


    private  KnucklesRecyclerAdapter  knucklesRecyclerAdapter;





    String [] text_Res;

    int [] img_Res = {R.drawable.berserk,R.drawable.bravebattlefist,R.drawable.claw,R.drawable.combobattleglove,R.drawable.electricfist,
            R.drawable.finger,R.drawable.fist,R.drawable.gloriousclaw,R.drawable.gloriousfist,R.drawable.hatiiclaw,R.drawable.hornofhillslion,
            R.drawable.iciclefist,R.drawable.kaiserknuckle,R.drawable.knuckledusters,R.drawable.magmafist,R.drawable.monkknuckle,R.drawable.seismicfist,
            R.drawable.studdedknuckles,R.drawable.valorousbattlefist,R.drawable.waghnak};
    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knuckles_recycler);

        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;

        recyclerView = (RecyclerView) findViewById(R.id.recyclerwidget_knuckles);

        text_Res = getResources().getStringArray(R.array.knucles_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        knucklesRecyclerAdapter= new KnucklesRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(knucklesRecyclerAdapter);






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

        knucklesRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }




}
