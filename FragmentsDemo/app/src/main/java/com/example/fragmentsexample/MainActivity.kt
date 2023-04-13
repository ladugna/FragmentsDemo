package com.example.fragmentsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentsexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var fmanager: FragmentManager
    lateinit var tx: FragmentTransaction
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // assign and get the object for the FragmentManager by using the below statements
        // supportFragmentManager.beginTransaction().add(R.id.frame1, HomeFragment()).commit()
        fmanager =
            supportFragmentManager // It's like getSupportFragmentManager() from FragmentActivity
        //get the object for FragmentTransaction and Initialize the transaction
        tx = fmanager.beginTransaction()
        /* by default we are going to show the HomeFragment in onCreate() method using add() method
            * add() method accepts two parameters -
            * 1. id of fragment 2.object of Fragment class*/
        tx.add(R.id.frame1, HomeFragment())
        // Commit the fragment transaction
        tx.commit()
    }

    fun home(view: View) {
        tx = fmanager.beginTransaction()
        // when the user selects the Home button, we are replacing the HomeFragment
        tx.replace(R.id.frame1, HomeFragment())
        tx.commit()
    }

    fun gallery(view: View) {
        tx = fmanager.beginTransaction()
        // when the user selects the Home button, we are replacing the HomeFragment
        tx.replace(R.id.frame1, GalleryFragment())
        tx.commit()
    }

    fun contactus(view: View) {
        tx = fmanager.beginTransaction()
        // when the user selects the Home button, we are replacing the HomeFragment
        tx.replace(R.id.frame1, ContactFragment())
        tx.commit()
    }
}