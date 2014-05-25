(ns projecteuler.problem3)

(defn is-prime
	""
	[x]
	)

(defn prime-factors
	"Find all prime factors of x"
	[x]
	(set
		(loop [i 2 result ()]
			(if (>= i x)
				result
				(recur (+ i 1) (if (and (= (mod x i) 0) (= (not-empty (prime-factors i)) nil)) (conj result i) result))))))

(defn problem3
	"Problem 3 solution"
	[x]
	(last (prime-factors x)))
