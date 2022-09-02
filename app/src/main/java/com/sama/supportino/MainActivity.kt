package com.sama.supportino

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationBarView
import com.sama.supportino.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    companion object {
//        private const val ID_HOME = 1
//        private const val ID_TICKET = 2
//        private const val ID_CONVERSATION = 3
//
//    }

    private lateinit var binding: ActivityMainBinding
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpNavigation()
    }


    private fun setUpNavigation() {
        //-----------library---------
//        binding.menu.add(KBottomNavigation.Model(ID_CONVERSATION, R.drawable.ic_chat))
//        binding.menu.add(KBottomNavigation.Model(ID_HOME, R.drawable.ic_dashboard))
//        binding.menu.add(KBottomNavigation.Model(ID_TICKET, R.drawable.ic_ticket))
//
//        binding.menu.setOnClickMenuListener {
//            when (it.id) {
//                ID_HOME -> navigate(ID_HOME)
//                ID_CONVERSATION -> navigate(ID_CONVERSATION)
//                ID_TICKET -> navigate(ID_TICKET)
//
//                else -> ""
//            }
//        }
        //-----------library---------

        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        binding.apply {
            bottomNavigationView.selectedItemId = R.id.dashboard_item
            bottomNavigationView.setupWithNavController(navController)
            bottomNavigationView?.setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.dashboard_item -> navigate(R.id.dashboardFragment)
                    R.id.ticket_item -> navigate(R.id.ticketFragment)
                    R.id.chat_item -> navigate(R.id.conversationFragment)
                    R.id.profile_item -> navigate(R.id.profileFragment)
                }
                return@setOnItemSelectedListener true
            }
        }
    }

    private fun navigate(actionId: Int) {
        navController.navigate(actionId, null)
    }

}