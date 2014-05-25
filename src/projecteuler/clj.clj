(ns projecteuler.clj)

(defn problem1
  "Find the sum of multiples of 3 and 5 below x"
  [x]
  (if (= x 0)
  	x
  	(if (or (= (mod (- x 1) 3) 0) (= (mod (- x 1) 5) 0))
  		(+ (- x 1) (problem1 (- x 1)))
  		(+ 0 (problem1 (- x 1))))))
