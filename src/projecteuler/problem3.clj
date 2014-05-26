(ns projecteuler.problem3
	(:require [clojure.set]))

(defn prime-factors
	"Find all prime factors of x"
	[x]
	(if (<= x 1)
		#{}
		(loop [div 2]
			(if (= (mod x div) 0)
				(clojure.set/union #{div} (prime-factors (/ x div)))
				(recur (+ div 1))))))

(defn problem3
	"Problem 3 solution"
	[x]
	(last (apply sorted-set (prime-factors x))))

(problem3 600851475143)
