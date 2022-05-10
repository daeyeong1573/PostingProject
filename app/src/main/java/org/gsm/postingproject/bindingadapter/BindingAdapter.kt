package org.gsm.postingproject.bindingadapter

import android.widget.TextView
import androidx.databinding.BindingAdapter

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("setText", "setGrade")
    fun changeText(view: TextView, text: String, grade: Int) {
        view.text = "$text | $grade 학년"
    }

}