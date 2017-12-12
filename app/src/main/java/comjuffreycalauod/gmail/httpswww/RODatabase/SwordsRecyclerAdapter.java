package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Mr.Darkycible on 8/14/2017.
 */

public class SwordsRecyclerAdapter extends RecyclerView.Adapter<SwordsRecyclerAdapter.SwordsRecyclerAdapterholder>
{
    Context context;

    private ArrayList<DataProvider> arrayyList = new ArrayList<>();

    public SwordsRecyclerAdapter (ArrayList<DataProvider> arrayList,Context context)

    {


        this.arrayyList = arrayList;
        this.context = context;


    }




    @Override
    public SwordsRecyclerAdapterholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.swords_layout,parent,false);
        SwordsRecyclerAdapterholder swordsRecyclerAdapterholder = new SwordsRecyclerAdapterholder(view);




        return swordsRecyclerAdapterholder;
    }

    @Override
    public void onBindViewHolder(final SwordsRecyclerAdapterholder holder, int position) {

   final  DataProvider dataProvider = arrayyList.get(position);
        Glide.with(context).load(dataProvider.getImg_res()).into(holder.imageview);
        holder.textview.setText(dataProvider.getText_res());


        Glide.with(context).load(dataProvider.getImg_res()).into(holder.imageview);



        holder.textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(v.getContext(),Swords_details.class);
                intent.putExtra("NAME",dataProvider.getText_res());
                intent.putExtra("IMG",dataProvider.getImg_res());
                intent.putExtra("POSITION",holder.getAdapterPosition());
                v.getContext().startActivity(intent);


            }
        });







    }

    @Override
    public int getItemCount() {
        return arrayyList.size();
    }




    public static class SwordsRecyclerAdapterholder extends RecyclerView.ViewHolder


    {

        ImageView imageview;
        TextView textview;

        public SwordsRecyclerAdapterholder(View view )

            {

            super(view);


            imageview =  (ImageView)view.findViewById(R.id.swords);
                textview = (TextView) view.findViewById(R.id.textSwords);









        }



    }

    public void setFilter (ArrayList<DataProvider> searchlist)

    {
        arrayyList = new ArrayList<>();
        arrayyList.addAll(searchlist);
        notifyDataSetChanged();



    }



}
