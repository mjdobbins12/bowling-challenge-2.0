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
	}
}