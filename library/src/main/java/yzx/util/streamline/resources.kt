package yzx.util.streamline

import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat


fun Int?.toResourceString(): String? {
    this ?: return null
    return application.resources.getString(this)
}


fun Int?.toResourceColor(): Int? {
    this ?: return null
    return ResourcesCompat.getColor(application.resources, this, application.theme)
}


fun Int?.toResourceDrawable(): Drawable? {
    this ?: return null
    return ResourcesCompat.getDrawable(application.resources, this, application.theme)
}


fun Int.toDP(): Int {
    return (application.resources.displayMetrics.density * this + 0.5f).toInt()
}

fun Float.toDP(): Float {
    return application.resources.displayMetrics.density * this
}


fun Int.toPX(): Int {
    return (this / application.resources.displayMetrics.density + 0.5f).toInt()
}


fun Float.toPX(): Float {
    return this / application.resources.displayMetrics.density
}

