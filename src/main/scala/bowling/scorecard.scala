package bowling

class Scorecard {
	var score = 0
	var bonus = 1
	var bonusDuration = 2
	
	def recordRoll(pins: Int) {
		score += (pins * bonus)
		if (bonusDuration == 2) {
			bonusDuration -= 1
		} else if (bonusDuration == 1) {
			bonusDuration -=1
			bonus -= 1
		}
		if (pins == 10) {
			bonus += 1
			bonusDuration = 2
		}
	}
}