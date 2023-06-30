package com.example.testrecyrcle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.testrecyrcle.databinding.ItemCarBinding

class CarViewAdapter(private val carList:ArrayList<Car>) :
    RecyclerView.Adapter<CarViewAdapter.CarHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        return CarHolder(ItemCarBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.bind(carList[position])
    }

    override fun getItemCount(): Int {
       return carList.size
    }

    inner class CarHolder(private  var binding: ItemCarBinding):ViewHolder(binding.root) {
        fun bind(car: Car){
            binding.apply {
                tvCarName.text=car.name
                tvYearCar.text=car.year.toString()
                Glide.with(imageCars).load(car.image).into(imageCars)


            }


        }
    }
}