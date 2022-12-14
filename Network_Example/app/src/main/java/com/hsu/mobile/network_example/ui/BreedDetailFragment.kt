package com.hsu.mobile.network_example.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.bumptech.glide.Glide
import com.hsu.mobile.network_example.R
import com.hsu.mobile.network_example.databinding.FragmentBreedDetailBinding

private const val POSITION = "position"

class BreedDetailFragment : Fragment() {

    private lateinit var binding: FragmentBreedDetailBinding
    private val viewModel by activityViewModels<BreedViewModel>()
    private var position: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            position = it.getInt(POSITION)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBreedDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val breed = viewModel.breedList.value?.get(position)

        if (breed == null) {
            Toast.makeText(requireContext(), "Data Error", Toast.LENGTH_SHORT).show()
            parentFragmentManager.popBackStack()
            return
        }

        Glide.with(requireContext())
            .load(breed.image?.url ?: R.drawable.ic_baseline_image_not_supported_24)
            .into(binding.breedDetailImage)

        binding.apply {
            breedDetailName.text = breed.name
            breedDetailOrigin.text = breed.origin
            breedDetailLifespan.text = "lifespan: ${breed.life_span}"
            breedDetailDescription.text = breed.description
            breedDetailTemperament.text = breed.temperament
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(position: Int) =
            BreedDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(POSITION, position)
                }
            }
    }
}