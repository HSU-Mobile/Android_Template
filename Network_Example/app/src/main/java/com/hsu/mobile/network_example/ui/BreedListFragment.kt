package com.hsu.mobile.network_example.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.hsu.mobile.network_example.R
import com.hsu.mobile.network_example.databinding.FragmentBreedListBinding

class BreedListFragment : Fragment() {

    private val viewModel by activityViewModels<BreedViewModel>()
    private lateinit var binding: FragmentBreedListBinding
    private lateinit var breedListAdapter: BreedListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBreedListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        breedListAdapter = BreedListAdapter(viewModel) { pos ->
            parentFragmentManager.beginTransaction()
                .replace(id, BreedDetailFragment.newInstance(pos))
                .addToBackStack(null)
                .commit()
        }

        binding.breedListRv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = breedListAdapter
        }

        viewModel.breedList.observe(viewLifecycleOwner) {
            breedListAdapter.notifyDataSetChanged()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = BreedListFragment()
    }
}