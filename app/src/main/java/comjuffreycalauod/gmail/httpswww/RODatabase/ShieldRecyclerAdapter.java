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
 * Created by Mr.Darkycible on 8/23/2017.
 */

public class ShieldRecyclerAdapter extends RecyclerView.Adapter<ShieldRecyclerAdapter.ShieldHolder>{
    Context context;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    public  ShieldRecyclerAdapter (ArrayList<DataProvider> arrayList,Context context)

    {

        this.arrayList = arrayList;
        this.context = context;



    }








    @Override
    public  ShieldHolder onCreateViewHolder (ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shield_layout,parent,false);

        ShieldHolder shieldHolder= new ShieldHolder(view);





        return shieldHolder;
    }



    @Override
    public void onBindViewHolder(final ShieldHolder holder, int position) {

      final  DataProvider dataProvider = arrayList.get(position);
        Glide.with(context).load(dataProvider.getImg_res()).into(holder.imageview);
        holder.textview.setText(dataProvider.getText_res());





        holder.textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(v.getContext(),ShieldDetails.class);
                intent.putExtra("NAME",dataProvider.getText_res());
                intent.putExtra("IMG",dataProvider.getImg_res());
                intent.putExtra("POSITION",holder.getAdapterPosition());
                v.getContext().startActivity(intent);



            }
        });






    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public static class ShieldHolder extends RecyclerView.ViewHolder

    {

        ImageView imageview;
        TextView textview;


        public ShieldHolder (View view)




        {

            super(view);



            imageview = (ImageView) view.findViewById(R.id.advancedarmguard_img);
            textview = (TextView) view.findViewById(R.id.advancedarmguard_txt);




        }


    }

    public void setFilter (ArrayList<DataProvider> searchList)


    {
        arrayList = new ArrayList<>();
        arrayList.addAll(searchList);

        notifyDataSetChanged();



    }

}
