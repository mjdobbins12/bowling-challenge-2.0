package bowling

import org.scalatest.FunSpec

class ScorecardSpec extends FunSpec {
	describe("Bowling scorecard") {
		describe("when new") {
			it("should start at 0") {
				val sc = new Scorecard
				assert(sc.score === 0)
			}
		}
		
		describe("after some pins are knocked down") {
			it("should record the total") {
				val sc = new Scorecard
				sc.recordRoll(3)
				assert(sc.score === 3)
			}
			
			it("should record multiple rolls") {
				val sc = new Scorecard
				sc.recordRoll(3)
				sc.recordRoll(6)
				assert(sc.score === 9)
			}
		}
	}
}