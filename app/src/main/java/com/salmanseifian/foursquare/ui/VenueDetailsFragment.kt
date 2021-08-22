package com.salmanseifian.foursquare.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.salmanseifian.foursquare.R
import com.salmanseifian.foursquare.databinding.VenueDetailsFragmentBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class VenueDetailsFragment : Fragment(R.layout.venue_details_fragment) {

    private val viewModel: MapsViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = VenueDetailsFragmentBinding.bind(view)

        val venueId = VenueDetailsFragmentArgs.fromBundle(requireArguments()).venueId
        val venue = viewModel.allVenues.firstOrNull() { it.id == venueId }

        binding.venue = venue
    }

}