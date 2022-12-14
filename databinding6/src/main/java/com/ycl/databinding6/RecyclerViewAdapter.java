package com.ycl.databinding6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.ycl.databinding6.databinding.ItemBinding;

import java.util.List;

/**
 * 作者：ycl
 * 时间：2022/12/14
 * 描述：创建Recyclerview的Adapter-------添加了dataBinding 和Adapter的结合起来的写法
 * recyclerView的Adapter创建三部曲
 * 1.创建自己的Adapter类如RecyclerViewAdapter
 * 2.在这个类中创建自己的MyViewHolder 让其继承RecyclerView.ViewHolder
 * 3.让创建的Adapter类来继承RecyclerView.Adapter<内部创建的MyViewHolder>
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    List<Idol> idols;

    public RecyclerViewAdapter(List<Idol> idols) {
        this.idols = idols;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding itemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item, parent, false);
        return new MyViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //做数据的处理
        Idol idol = idols.get(position);
        holder.itemBinding.setIdol(idol);
    }

    @Override
    public int getItemCount() {
        return idols.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        private ItemBinding itemBinding;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public MyViewHolder(ItemBinding itemBinding){
            super(itemBinding.getRoot());
            this.itemBinding=itemBinding;
        }
    }

}
