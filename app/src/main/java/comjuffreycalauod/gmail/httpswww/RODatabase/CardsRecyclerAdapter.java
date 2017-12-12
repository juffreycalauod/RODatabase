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
 * Created by Mr.Darkycible on 7/18/2017.
 */

public   class CardsRecyclerAdapter extends RecyclerView.Adapter<CardsRecyclerAdapter.RecyclerViewHolder> {

Context context;


    private ArrayList<DataProvider> arrayList = new ArrayList<>();









   public CardsRecyclerAdapter(ArrayList<DataProvider> arrayList,Context context)

    {

        this.arrayList = arrayList;
        this.context = context;

    }



    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout,parent,false);


        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return  recyclerViewHolder;




    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {





        final DataProvider dataProvider = arrayList.get(position);



        holder.card_name.setText(dataProvider.getText_res());

        Glide.with(context).load(dataProvider.getImg_res()).into(holder.imageview);





        holder.card_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(),Card_details.class);
                intent.putExtra("CARDNAME",dataProvider.getText_res());
                intent.putExtra("CARDIMAGE",dataProvider.getImg_res());
                intent.putExtra("POSITION",holder.getAdapterPosition());

                v.getContext().startActivity(intent);




            }
        });













    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }




    public  static class RecyclerViewHolder extends RecyclerView.ViewHolder

    {


        //Variables


        ImageView imageview;
        TextView card_name;





        public RecyclerViewHolder(View view)

        {

            super(view);


            imageview = (ImageView) view.findViewById(R.id.abyssImg);
            card_name = (TextView) view.findViewById(R.id.abyssTxt);





        }


    }







    public void setFilter (ArrayList<DataProvider> searchList)

    {



        arrayList = new ArrayList<>();
        arrayList.addAll(searchList);
        notifyDataSetChanged();




    }








}
