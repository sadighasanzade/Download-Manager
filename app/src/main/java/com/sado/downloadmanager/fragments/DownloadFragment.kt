package com.sado.downloadmanager.fragments

import android.content.res.ColorStateList
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.sado.downloadmanager.R
import kotlin.math.log

class DownloadFragment : Fragment() {

    private lateinit var chipGroup: ChipGroup
    private lateinit var youtubeChip : Chip
    private lateinit var facebookChip : Chip
    private lateinit var instagramChip : Chip

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_download, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chipGroup = view.findViewById(R.id.chip_group_choice)
        youtubeChip = view.findViewById(R.id.chip_youtube)
        facebookChip = view.findViewById(R.id.chip_facebook)
        instagramChip = view.findViewById(R.id.chip_instagram)

        //default youtube should be selected
        if(youtubeChip.isChecked) {
            youtubeChip.chipBackgroundColor = ColorStateList.valueOf(requireContext().getColor(R.color.blue))
            youtubeChip.setTextColor(requireContext().getColor(R.color.white))
        }
        chipGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.chip_instagram -> {
                    instagramChip.chipBackgroundColor = ColorStateList.valueOf(requireContext().getColor(R.color.blue))
                    facebookChip.chipBackgroundColor = ColorStateList.valueOf(requireContext().getColor(R.color.open_blue))
                    youtubeChip.chipBackgroundColor = ColorStateList.valueOf(requireContext().getColor(R.color.open_blue))

                    instagramChip.setTextColor(requireContext().getColor(R.color.white))
                    facebookChip.setTextColor(requireContext().getColor(R.color.black))
                    youtubeChip.setTextColor(requireContext().getColor(R.color.black))
                }

                R.id.chip_facebook -> {
                    instagramChip.chipBackgroundColor = ColorStateList.valueOf(requireContext().getColor(R.color.open_blue))
                    facebookChip.chipBackgroundColor = ColorStateList.valueOf(requireContext().getColor(R.color.blue))
                    youtubeChip.chipBackgroundColor = ColorStateList.valueOf(requireContext().getColor(R.color.open_blue))

                    instagramChip.setTextColor(requireContext().getColor(R.color.black))
                    facebookChip.setTextColor(requireContext().getColor(R.color.white))
                    youtubeChip.setTextColor(requireContext().getColor(R.color.black))
                }

                R.id.chip_youtube -> {
                    instagramChip.chipBackgroundColor = ColorStateList.valueOf(requireContext().getColor(R.color.open_blue))
                    facebookChip.chipBackgroundColor = ColorStateList.valueOf(requireContext().getColor(R.color.open_blue))
                    youtubeChip.chipBackgroundColor = ColorStateList.valueOf(requireContext().getColor(R.color.blue))

                    instagramChip.setTextColor(requireContext().getColor(R.color.black))
                    facebookChip.setTextColor(requireContext().getColor(R.color.black))
                    youtubeChip.setTextColor(requireContext().getColor(R.color.white))

                }
            }
        }
    }


}