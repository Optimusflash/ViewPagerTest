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
class ApiLevelFragment : Fragment() {

    companion object{
        private const val TAG = " TAG"

        fun newInstance(id: Int): ApiLevelFragment{
            val fragment = ApiLevelFragment()
            fragment.arguments = Bundle().apply {
                putInt(TAG, id)
            }
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_api_level, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val apiLevelId = arguments?.getInt(TAG)

        apiLevelId?.let {
            DataGenerator.getApiLevelById(it)?.let {apiLevel ->
                tv_api_title.text = apiLevel.name
                tv_api_version.text = apiLevel.version.toString()
                tv_api_year.text = apiLevel.year.toString()
                tv_api_description.text = view.resources.getString(apiLevel.description)
            }
        }




    }


}