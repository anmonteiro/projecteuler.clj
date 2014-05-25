(ns projecteuler.problem2)

(defn fib
	""
	[x]
	(if (= x 0)
		1
		(if (= x 1)
			1
			(+ (fib (- x 1)) (fib (- x 2))))))

(defn problem2
	""
	[limit]
	(let [lstFib (vec(for [x (range)
						:let [fibx (fib x)]
						:while (<= fibx limit)
						:when (even? fibx)] fibx))]
		(reduce + lstFib)))
