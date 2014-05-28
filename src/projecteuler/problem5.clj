(ns projecteuler.problem5)

(defn is-divisible-until-n?
	[n number]
	(or (= n 1)
		(and (= (mod number n) 0) (is-divisible-until-n? (dec n) number))))


(defn loop-until-divisible
	[i n]
	(if (is-divisible-until-n? n i)
		i
		#(loop-until-divisible (+ i 2) n)))


(defn problem5
	""
	[n]
	(trampoline loop-until-divisible 2 n))


;(problem5 20)
; the above call will take ~27 seconds to complete
; there should be a way to optimize the code
