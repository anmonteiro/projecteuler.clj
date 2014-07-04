(ns projecteuler.problem6)

(defn square-sums
  [n]
  (let [n (/ (* n (inc n)) 2)]
    (* n n)))


(defn sum-squares
  "n (n - 1) (2n - 1) / 6"
  [n]
  (/ (* n (inc n) (inc (* n 2))) 6))


(defn problem6
  "Sum square difference"
  [n]
  (- (square-sums n) (sum-squares n)))

