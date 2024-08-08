package com.example.m3w3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m3w3_3.databinding.WallpaperItemBinding;

import java.util.ArrayList;

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperViewHolder> {

    private ArrayList<String> WallpaperList;

    public WallpaperAdapter(ArrayList<String> wallpaperList){
        this.WallpaperList = wallpaperList;
    }
    @NonNull
    @Override
    public WallpaperViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WallpaperViewHolder(WallpaperItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull WallpaperViewHolder holder, int position) {
        holder.onBind(WallpaperList.get(position));
    }

    @Override
    public int getItemCount() {
        return WallpaperList.size();
    }
}
