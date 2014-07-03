(ns projecteuler.problem1)

(defn problem1
  "Find the sum of multiples of 3 and 5 below x"
  [x]
  {:pre [(>= x 0)]}
  (let [n (dec x)]
    (if (zero? x)
      x
      (if (or (zero? (mod n 3)) (zero? (mod n 5)))
        (+ n (problem1 n))
        (+ 0 (problem1 n))))))

(problem1 1000)
