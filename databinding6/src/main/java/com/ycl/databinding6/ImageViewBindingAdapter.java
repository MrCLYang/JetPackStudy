package com.ycl.databinding6;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

/**
 * 作者：ycl
 * 时间：2022/12/14
 * 描述：网络加载图片
 */
public class ImageViewBindingAdapter {
     //加载网络图片
     @BindingAdapter("itemImage")
    public static void setImage(ImageView imageView,String url){
        if(!TextUtils.isEmpty(url)){
            Picasso.get()
                    .load(url)
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(imageView);
        }else {
            imageView.setBackgroundColor(Color.GRAY);
        }
    }
}
