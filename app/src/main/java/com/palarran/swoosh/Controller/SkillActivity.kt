package com.palarran.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.palarran.swoosh.Model.Player
import com.palarran.swoosh.R
import com.palarran.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

	lateinit var player : Player

	//usage explained in leagueActivity.kt
	override fun onSaveInstanceState(outState: Bundle?) {
		super.onSaveInstanceState(outState)
		outState?.putParcelable(EXTRA_PLAYER, player)
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_skill)
		player = intent.getParcelableExtra(EXTRA_PLAYER) //EXTRA from LeagueActivity's intent
	}

	override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
		super.onRestoreInstanceState(savedInstanceState)
		if (savedInstanceState != null) {
			player = savedInstanceState.getParcelable(EXTRA_PLAYER)
		}
	}

	fun onBeginnerClick(view: View) {
		ballerToggleButton.isChecked = false
		player.skill = "beginner"
	}

	fun onBallerClick(view: View) {
		beginnerToggleButton.isChecked = false
		player.skill = "baller"
	}

	fun onSkillFinishClick(view: View) {
		if (player.skill != "") {
			val finishActivity = Intent(this, FinishActivity::class.java)
			finishActivity.putExtra(EXTRA_PLAYER, player)
			startActivity(finishActivity)
		} else {
			Toast.makeText(this, "Choose a skill level", Toast.LENGTH_SHORT).show()
		}

	}
}
