package com.example.testtusk

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testtusk.databinding.ItemBinding

//дата класс должен работать с viewholder(специальный класс который будет содержать в себе все ссылки на все view которые будут в одном элементе)
class Adapter : RecyclerView.Adapter<Adapter.holder>() {
    val imagelist = ArrayList<image>()
    class holder(intem: View) : RecyclerView.ViewHolder(intem){
        var isImageScaled = false
        val binding = ItemBinding.bind(intem)
        fun bind(image: image) = with(binding){
            im.setImageResource(image.imageId)
        }


    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): holder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.item,p0,false)
        return holder(view)
    }

    override fun onBindViewHolder(p0: holder, p1: Int) {
        p0.bind(imagelist[p1])
    }

    override fun getItemCount(): Int {
        return imagelist.size
    }
    fun addimage(image: image){
        imagelist.add(image)
        notifyDataSetChanged()


    }
}