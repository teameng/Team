package com.teamengineering.team

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import androidx.annotation.NonNull
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot


class MainActivity : AppCompatActivity()
{
    companion object{
        private val TAG = "MainActivity"
    }
    //java comp for line below (FirebaseFirestore db = FirebaseFirestore.getInstance();)
    var db = FirebaseFirestore.getInstance()
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // SeekBar progSeek = (SeekBar) findViewById(R.id.seekBar);
    }
fun toastMe(view: View)
{
    val myToast = Toast.makeText(this, "Currently the app shows a test result screen with a progress bar at 75%", Toast.LENGTH_LONG)
    myToast.show()
}
fun showRes(view: View)
{
    setContentView(R.layout.res_test)
}
/*fun setProgress()
{

    db.collection("users")
        .get()
        .addOnCompleteListener(object: OnCompleteListener<QuerySnapshot>() {
            @Override
            override fun onComplete(@NonNull task: Task<QuerySnapshot>) {
                if (task.isSuccessful())
                {
                    for (document in task.getResult())
                    {
                        Log.d(TAG, document.getId() + " => " + document.getData())
                    }
                }
                else
                {
                    Log.w(TAG, "Error getting documents.", task.getException())
                }
            }
        })





}*/
fun homeScreen(view: View)
{
    setContentView(R.layout.activity_main)
}
}
