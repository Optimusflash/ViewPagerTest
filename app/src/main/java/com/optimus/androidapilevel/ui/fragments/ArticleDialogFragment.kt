package com.optimus.androidapilevel.ui.fragments


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.optimus.androidapilevel.R
import kotlinx.android.synthetic.main.fragment_article_dialog.*


/**
 * A simple [Fragment] subclass.
 */
class ArticleDialogFragment : DialogFragment() {

    companion object{
        const val TAG = "ArticleDialogFragment"
    }

    private val urlWikipedia = "https://ru.wikipedia.org/wiki/История_версий_Android"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_article_dialog, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_dialog_submit.setOnClickListener {
            openUrlLink()
            dismiss()
        }

        btn_dialog_cancel.setOnClickListener {
            dismiss()
        }
    }

    private fun openUrlLink() {
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(urlWikipedia)
        startActivity(i)
    }

}
