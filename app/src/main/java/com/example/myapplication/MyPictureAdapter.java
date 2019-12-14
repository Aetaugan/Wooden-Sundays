package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.Image_;
import com.example.myapplication.model.RetroPhoto;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyPictureAdapter extends RecyclerView.Adapter<MyPictureAdapter.CustomViewHolder> {
   // private List<RetroPhoto> dataList;
    private List<Image_> ListImages;
    private Context context;
    public ImageView coverImage;

    private Picasso picasso;

    public MyPictureAdapter(Context context, List<Image_> ImageDetail, MyPictureAdapter.OnItemClickListener listener) {
        this.context = context;
       // this.dataList = dataList;
        this.ListImages = ImageDetail;
         this.listener = listener;

/*
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        picasso = builder.build();*/
    }
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_imagedetail, parent, false);
        CustomViewHolder vh = new CustomViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        picasso = builder.build();
        holder.bind(ListImages.get(position), listener);
        // final RetroPhoto item = dataList.get(position);
      // CustomViewHolder.imgViewIcon.setImageResource(ListImages[position].getImageUrl());
       // Picasso.with(context).load(ListImages.get(position).getUrl()).into(coverImage);

        picasso.load(ListImages.get(position).getUrl()).placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(coverImage);
    }

    @Override
    public int getItemCount() {
        return ListImages.size();
    }


    public interface OnItemClickListener {
        void onItemClick(Image_ item);
    }
    private final MyPictureAdapter.OnItemClickListener listener;


    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;


        public CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            coverImage = (ImageView) mView.findViewById(R.id.ImagedetailsList);
        }

        public void bind(final Image_ item, final MyPictureAdapter.OnItemClickListener listener) {
            mView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }


}
