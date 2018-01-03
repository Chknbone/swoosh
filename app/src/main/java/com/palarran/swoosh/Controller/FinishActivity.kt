package com.palarran.swoosh.Controller

import android.os.Bundle
import com.palarran.swoosh.Model.Player
import com.palarran.swoosh.R
import com.palarran.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_finish)

		val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

		searchLeagueText.text = "Looking for a ${player.league} ${player.skill} league near you..."
	}
}
