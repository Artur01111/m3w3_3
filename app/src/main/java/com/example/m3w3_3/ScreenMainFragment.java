package com.example.m3w3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m3w3_3.databinding.FragmentScreenMainBinding;

import java.util.ArrayList;

public class ScreenMainFragment extends Fragment {

    FragmentScreenMainBinding binding;
    WallpaperAdapter adapter;
    private ArrayList<String> WallpaperList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentScreenMainBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new WallpaperAdapter(WallpaperList);
        binding.rvView.setAdapter(adapter);
    }
    private void loadData(){
        WallpaperList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgkeM2uA2_EIO7AmusLJDlsjTIkI-aAkbguw&s");
        WallpaperList.add("https://i.pinimg.com/736x/e2/d6/09/e2d6097151d75bc73a36e425eb4e8bb5.jpg");
        WallpaperList.add("https://809620.selcdn.ru/wallpaperio-net/wallpapers/full/ded49-a-ed49fe-bcad6.jpg");
        WallpaperList.add("https://images.wallpapershq.com/wallpapers/8170/thumbnail_350x622.jpg");
        WallpaperList.add("https://image.winudf.com/v2/image1/Y29tLm9rYXBwei5naXJseXdhbGxwYXBlcnNfc2NyZWVuXzBfMTY5NTAzODgxNV8wNDY/screen-0.jpg?fakeurl=1&type=.jpg");
        WallpaperList.add("https://images.pexels.com/photos/1366919/pexels-photo-1366919.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        WallpaperList.add("https://img.lovepik.com/background/20211030/medium/lovepik-wallpaper-of-flower-wall-mobile-phone-background-image_400376526.jpg");
        WallpaperList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4XbqXStqw1xVFGc-BSYBuoYrb9VP-JfW9Yg&s");
        WallpaperList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfvu-VfAvcS934aNSQC9eD0SAUjP-kWJBLBg&s");
        WallpaperList.add("https://w0.peakpx.com/wallpaper/126/475/HD-wallpaper-by-svetash-on-обои-для-телефона-smoke-in-2021-smoke-smoke-paintin-smoke-smoke-painting-abstract-background-cool-smoke.jpg");
        WallpaperList.add("https://png.pngtree.com/background/20211217/original/pngtree-grim-reaper-halloween-phone-wallpaper-picture-image_1594578.jpg");
        WallpaperList.add("https://cdn.lifehacker.ru/wp-content/uploads/2023/09/iPhone-15-wallpaper-1_1694597571.png");
    }
}