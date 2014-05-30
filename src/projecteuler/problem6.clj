(ns projecteuler.problem6)

(defn square-sums
	[n]
	(/ (* n (inc n)) 2))


(defn sum-squares
	[n]
	0)


(defn problem6
	"Sum square difference"
	[n]
	(- (square-sums n) (sum-squares n)))

