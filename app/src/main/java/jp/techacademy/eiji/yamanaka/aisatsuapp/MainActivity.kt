package jp.techacademy.eiji.yamanaka.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if ((hour >= 2) && (9 >= hour)){
                    textView.text = "おはよう"
                } else if ((hour >= 10) && (17 >= hour)){
                    textView.text = "こんにちは"
                } else if ( ((hour >= 18) && (23 >= hour)) || ((hour >= 0) && (1 >= hour)) ){
                    textView.text = "こんばんは"
                }
            },
            13, 0, true)
        timePickerDialog.show()
    }

}
