package yzx.util.streamline

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.View
import androidx.fragment.app.Fragment
import java.io.ByteArrayOutputStream


inline fun <reified T : Activity> Context?.startActivity(clz: Class<T>, block: ((Intent) -> Unit) = {}) {
    this ?: return
    val intent = Intent(this, clz); block(intent); startActivity(intent)
}


inline fun <reified T : Activity> Activity?.startActivityForResult(clz: Class<T>, reqCode: Int, block: ((Intent) -> Unit) = {}) {
    this ?: return
    val intent = Intent(this, clz); block(intent); startActivityForResult(intent, reqCode)
}


inline fun <reified T : Activity> Fragment?.startActivity(clz: Class<T>, block: ((Intent) -> Unit) = {}) {
    this ?: return
    val act = this.activity ?: return
    val intent = Intent(act, clz); block(intent); startActivity(intent)
}


inline fun <reified T : Activity> Fragment?.startActivityForResult(clz: Class<T>, reqCode: Int, block: ((Intent) -> Unit) = {}) {
    this ?: return
    val act = this.activity ?: return
    val intent = Intent(act, clz); block(intent); startActivityForResult(intent, reqCode)
}


fun Activity?.setStatusBarColor(res: Int) {
    if (Build.VERSION.SDK_INT >= 21)
        this?.window?.statusBarColor = res.toResourceColor()!!
}


fun Context?.getAssetsFileString(name: String, bufferSize: Int = 128): String? {
    kotlin.runCatching {
        val input = this?.assets?.open(name) ?: return null
        val out = ByteArrayOutputStream()
        val buffer = ByteArray(bufferSize)
        while (true) {
            val readSize = input.read(buffer)
            if (readSize <= 0) break
            out.write(buffer, 0, readSize)
        }
        return String(out.toByteArray())
    }
    return null
}

