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
 * Created by Mr.Darkycible on 8/16/2017.
 */

public class OneHandSpearRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener {




    private  OneHandSpearRecyclerAdapter oneHandSpearRecyclerAdapter;





    String [] text_Res;

    int [] img_Res = {R.drawable.assaulterspear,R.drawable.battlehook,R.drawable.brocca,R.drawable.gelerdria,
            R.drawable.gloriousspear,R.drawable.gungnir,R.drawable.huntingspear,R.drawable.javelin,R.drawable.longhorn,
            R.drawable.pike,R.drawable.poleaxe,R.drawable.polexo,R.drawable.refinedbrocca,R.drawable.spear,
            R.drawable.spearofexcellent,R.drawable.tjungkuletti};

    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_handedspears_recycler);


        RecyclerView recyclerView;

        RecyclerView.LayoutManager recyclerLayoutManager;
        recyclerView = (RecyclerView) findViewById(R.id.recyclerwidget_OneHandedSpears);

        text_Res = getResources().getStringArray(R.array.one_handedspears_array);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        oneHandSpearRecyclerAdapter = new OneHandSpearRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(oneHandSpearRecyclerAdapter);






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

        oneHandSpearRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }




}
