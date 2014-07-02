(ns projecteuler.problem1)

(defn problem1
  "Find the sum of multiples of 3 and 5 below x"
  [x]
  {:pre [(>= x 0)]}
  (if (zero? x)
    x
    (if (or (zero? (mod (dec x) 3)) (zero? (mod (dec x) 5)))
      (+ (dec x) (problem1 (dec x)))
      (+ 0 (problem1 (dec x))))))

(problem1 1000)
