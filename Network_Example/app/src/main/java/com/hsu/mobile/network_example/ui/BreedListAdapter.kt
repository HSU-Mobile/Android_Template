package com.hsu.mobile.network_example.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hsu.mobile.network_example.databinding.ItemBreedListBinding
import com.hsu.mobile.network_example.model.Breed

class BreedListAdapter(private val viewModel: BreedViewModel, private val onClick: (position: Int) -> Unit) :
    RecyclerView.Adapter<BreedListAdapter.BreedListViewHolder>() {

    inner class BreedListViewHolder(private val binding: ItemBreedListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(breed: Breed) {
            binding.breedListItemImage.clipToOutline = true

            breed.image?.let {
                it.url?.let {
                    Glide.with(itemView.context)
                        .load(breed.image.url)
                        .into(binding.breedListItemImage)
                }
            }

            binding.breedListItemName.text = breed.name

            binding.root.setOnClickListener {
                onClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreedListViewHolder {
        val binding =
            ItemBreedListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BreedListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BreedListViewHolder, position: Int) {
        holder.bind(viewModel.breedList.value!![position])
    }

    override fun getItemCount(): Int = viewModel.breedList.value?.size ?: 0
}