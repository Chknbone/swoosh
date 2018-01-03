package com.palarran.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.palarran.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_welcome)

		//listens for "Get Started" button to be clicked then starts LeagueActivity
		getStartedButton.setOnClickListener {
			val leagueIntent = Intent(this, LeagueActivity::class.java)
			startActivity(leagueIntent)
		}
	}
}
