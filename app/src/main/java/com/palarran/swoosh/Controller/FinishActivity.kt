package com.palarran.swoosh.Controller

import android.os.Bundle
import com.palarran.swoosh.R
import com.palarran.swoosh.Utilities.EXTRA_LEAGUE
import com.palarran.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_finish)

		val league = intent.getStringExtra(EXTRA_LEAGUE)
		val skill = intent.getStringExtra(EXTRA_SKILL)

		searchLeagueText.text = "Looking for a $league $skill league near you..."
	}
}
