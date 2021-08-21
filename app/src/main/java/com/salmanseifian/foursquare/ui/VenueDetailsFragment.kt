package com.salmanseifian.foursquare.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.salmanseifian.foursquare.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class VenueDetailsFragment : Fragment() {

    private val viewModel: MapsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.venue_details_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val venueId = VenueDetailsFragmentArgs.fromBundle(requireArguments()).venueId
        val venue = viewModel.allVenues.firstOrNull() { it.id == venueId }
    }

}