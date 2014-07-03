(ns projecteuler.problem2)

(defn fib
  ""
  [x]
  (case x
    0 1
    1 1
    (+ (fib (dec x)) (fib (dec (dec x))))))

(defn problem2
  ""
  [limit]
  (loop [x 0 fibx (fib x) lst-fib '()]
    (if (> fibx limit)
      (reduce + (filter even? lst-fib))
      (recur (inc x) (fib x) (conj lst-fib fibx)))))

(problem2 4000000)
