package yzx.util.streamline.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import yzx.util.streamline.Streamline
import yzx.util.streamline.getAssetsFileString
import yzx.util.streamline.toResourceDrawable


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<TextView>(R.id.tv).text = getAssetsFileString("fuck.txt")


    }

}