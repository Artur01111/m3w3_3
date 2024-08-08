package com.example.m3w3_3;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.m3w3_3.databinding.WallpaperItemBinding;

public class WallpaperViewHolder extends RecyclerView.ViewHolder {

    WallpaperItemBinding binding;

    public WallpaperViewHolder(@NonNull WallpaperItemBinding binding ) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String image){
        Glide.with(binding.imgWallpaper).load(image).into(binding.imgWallpaper);
    }
}
