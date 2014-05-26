(ns projecteuler.problem4)

(defn num-to-lst
	[n]
	(if (< n 10)
		[n]
		(conj (num-to-lst (long (/ n 10))) (mod n 10))))


(defn is-palindrome?
	[vect]
	(if (empty? vect)
		true
		(if (= (first vect) (last vect))
			(is-palindrome? (vec (rest (pop vect))))
			false)))


(defn seq-prob4
	[x]
	())


(defn problem4
	"Take two x-digit numbers and the highest
	palindrome result of their product"
	[x]
	(max (filter is-palindrome? (seq-prob4 x))))


; go through an array of numbers from 1 to 10*n-1,
; multiply each number by an array of digits from i to 10*n-1
; return the highest palindrome (filter)