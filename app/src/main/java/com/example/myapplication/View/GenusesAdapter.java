package com.example.myapplication.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Genuses;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GenusesAdapter extends RecyclerView.Adapter<GenusesAdapter.CustomViewHolder> {

    private List<Genuses> dataList;
    // private List<RetroPokemon> dataList;
    private Context context;
    private Picasso picasso;

    public interface OnItemClickListener {
        void onItemClick(Genuses item);
    }
    private final OnItemClickListener listener;

    public GenusesAdapter(Context context, List<Genuses> dataList, OnItemClickListener listener) {
 // public MyAdapter(Context context, List<RetroPokemon> dataList) {
        this.context = context;
        this.dataList = dataList;

        this.listener = listener;


        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        picasso = builder.build();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        public TextView txtscientific_name;
        public TextView txtDesc;
        public ImageView coverImage;

        public CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtscientific_name = (TextView) mView.findViewById(R.id.scientific_name);
            txtDesc = (TextView) mView.findViewById(R.id.description);
            coverImage = (ImageView) mView.findViewById(R.id.icon);
        }

        public void bind(final Genuses item, final OnItemClickListener listener) {
            mView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }

    @Override
    public GenusesAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout, parent, false);
        CustomViewHolder vh = new CustomViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {
        holder.bind(dataList.get(position), listener);
        String commonName = dataList.get(position).getGenName();
        if (commonName == null) {
            commonName = "Unknown";
        }
        String UpperCom = commonName.substring(0, 1).toUpperCase() + commonName.substring(1);
        holder.txtDesc.setText(UpperCom);

        String scientificName = dataList.get(position).getSlug();
        if (scientificName == null){
            scientificName = "Unknown";
        }
        String UpperScient = scientificName.substring(0, 1).toUpperCase() + scientificName.substring(1);
        holder.txtscientific_name.setText(UpperScient);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}