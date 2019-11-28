package bowling

class Scorecard {
	var score = 0
	var bonus = 1
	
	def recordRoll(pins: Int) {
		this.score += (pins * this.bonus)
		if (pins == 10) {
			bonus += 1
		}
	}
}