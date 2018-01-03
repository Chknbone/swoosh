package com.palarran.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.palarran.swoosh.R
import com.palarran.swoosh.Utilities.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

	var selectedLeague = ""

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_league)
	}

	/*
	each button below listens to be clicked. If clicked that value is set in the variable
	"selectedLeague" and the button color is changed.
	 */
	fun onMensClicked(view: View) {
		womens_toggle_button.isChecked = false
		coed_toggle_button.isChecked = false

		selectedLeague = "mens"
	}

	fun onWomensClicked(view: View) {
 		mens_toggle_button.isChecked = false
		coed_toggle_button.isChecked = false

		selectedLeague = "womens"
	}

	fun onCoEdClicked(view: View) {
		mens_toggle_button.isChecked = false
		womens_toggle_button.isChecked = false

		selectedLeague = "co-ed"
	}

	/*
	when "Next" button is clicked, checks to make sure one of the toggle buttons above have been
	selected. If not, a Toast pops up as a reminder.

	Once a selection has been made, skillActivity is started and the value from 'selectedLeague' is
	passed into an EXTRA and that is passed to the skillActivity
	 */
	fun leagueNextClicked(view: View) {
		if (selectedLeague != "") {
			val skillActivity = Intent(this, SkillActivity::class.java)
			skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
			startActivity(skillActivity)
		} else {
			Toast.makeText(this, "Select a league", Toast.LENGTH_SHORT).show()
		}

	}
}
