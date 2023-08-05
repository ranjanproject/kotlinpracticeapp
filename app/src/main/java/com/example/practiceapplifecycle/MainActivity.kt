package com.example.practiceapplifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.util.LinkedList
import java.util.Queue

class MainActivity : AppCompatActivity() {
    private val TAG = "Activirty1"

    private var name by TrimAppend()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")


        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.frag_layout, BlankFragment())

        ft.commit()

        name = "kajjbf    "

        val q: Queue<Int> = LinkedList()
         val x = q.remove()
       showErrorLog(Result.Success())

        val f1 = findViewById<Button>(R.id.btn1)

        f1.setOnClickListener {

            val ft1 = supportFragmentManager.beginTransaction()
            ft1.replace(R.id.frag_layout, BlankFragment())

            ft1.commit()
        }

        val f2 = findViewById<Button>(R.id.btn2)

        f2.setOnClickListener {
            val ft2 = supportFragmentManager.beginTransaction()
            ft2.replace(R.id.frag_layout, BlankFragment2())

            ft2.commit()
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }


    private fun showErrorLog(result: Result){
        when(result){
            is Result.Success -> print("")
            is Result.Fail -> print("kkjakf")
        }
    }
}