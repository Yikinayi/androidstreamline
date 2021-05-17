package yzx.util.streamline

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import android.widget.EditText


fun View?.gone() {
    this?.visibility = View.GONE
}


fun View?.isGone(): Boolean {
    return this?.visibility == View.GONE
}


fun View?.invisible() {
    this?.visibility = View.INVISIBLE
}


fun View?.isInvisible(): Boolean {
    return this?.visibility == View.INVISIBLE
}


fun View?.visible() {
    this?.visibility = View.VISIBLE
}


fun View?.isVisible(): Boolean {
    return this?.visibility == View.VISIBLE
}


inline fun View?.resetLayoutParams(block: (ViewGroup.LayoutParams?) -> ViewGroup.LayoutParams?) {
    val view = this ?: return
    val lp = block(view.layoutParams)
    if (lp != null) view.layoutParams = lp
}


fun EditText?.onTextChanged(block: () -> Unit) {
    this?.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) = Unit
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) = block()
        override fun afterTextChanged(s: Editable) = Unit
    })
}


var View?.leftMargin: Int
    get() {
        kotlin.runCatching { return (this?.layoutParams as? ViewGroup.MarginLayoutParams)?.leftMargin ?: 0 }
        return 0
    }
    set(value) {
        val view = this ?: return
        runCatching { (view.layoutParams as? ViewGroup.MarginLayoutParams)?.leftMargin = value; view.requestLayout() }
    }


var View?.rightMargin: Int
    get() {
        kotlin.runCatching { return (this?.layoutParams as? ViewGroup.MarginLayoutParams)?.rightMargin ?: 0 }
        return 0
    }
    set(value) {
        val view = this ?: return
        runCatching { (view.layoutParams as? ViewGroup.MarginLayoutParams)?.rightMargin = value; view.requestLayout() }
    }


var View?.topMargin: Int
    get() {
        kotlin.runCatching { return (this?.layoutParams as? ViewGroup.MarginLayoutParams)?.topMargin ?: 0 }
        return 0
    }
    set(value) {
        val view = this ?: return
        runCatching { (view.layoutParams as? ViewGroup.MarginLayoutParams)?.topMargin = value; view.requestLayout() }
    }


var View?.bottomMargin: Int
    get() {
        kotlin.runCatching { return (this?.layoutParams as? ViewGroup.MarginLayoutParams)?.bottomMargin ?: 0 }
        return 0
    }
    set(value) {
        val view = this ?: return
        runCatching { (view.layoutParams as? ViewGroup.MarginLayoutParams)?.bottomMargin = value; view.requestLayout() }
    }
