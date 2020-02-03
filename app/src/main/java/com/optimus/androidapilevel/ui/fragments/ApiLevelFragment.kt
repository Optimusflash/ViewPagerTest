package com.optimus.androidapilevel.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.optimus.androidapilevel.R
import com.optimus.androidapilevel.utils.DataGenerator
import kotlinx.android.synthetic.main.fragment_api_level.*

/**
 * A simple [Fragment] subclass.
 */
class ApiLevelFragment : Fragment(R.layout.fragment_api_level) {

    companion object{
        private const val EXTRA_ID = "EXTRA_ID"

        fun newInstance(id: Int): ApiLevelFragment{
            val fragment = ApiLevelFragment()
            fragment.arguments = Bundle().apply {
                putInt(EXTRA_ID, id)
            }
            return fragment
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val apiLevelId = arguments?.getInt(EXTRA_ID)

        apiLevelId?.let {
            DataGenerator.getApiLevelById(it)?.let {apiLevel ->
                tv_api_title.text = apiLevel.name
                tv_api_level.text = apiLevel.level
                tv_api_version.text = apiLevel.version
                tv_api_year.text = apiLevel.year
                tv_api_description.text = view.resources.getString(apiLevel.description)
            }
        }




    }


}
