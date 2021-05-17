package yzx.util.streamline.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import yzx.util.streamline.Streamline
import yzx.util.streamline.toResourceDrawable


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Streamline.init(this.application)

        val d = R.drawable.ic_launcher_background.toResourceDrawable()
        window.decorView.setBackgroundDrawable(d)

    }

}