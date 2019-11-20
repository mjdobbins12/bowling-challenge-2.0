package bowling

class Scorecard {
	var score = 0
	
	def recordRoll(roll: Int) {
		this.score += roll
	}
}