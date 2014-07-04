(ns projecteuler.problem3
  (:require [clojure.set :refer [union]]))

(defn prime-factors
  "Find all prime factors of x"
  [x]
  (if (<= x 1)
    #{}
    (loop [div 2]
      (if (zero? (mod x div))
        (into #{div} (prime-factors (/ x div)))
        (recur (inc div))))))

(defn problem3
  "Problem 3 solution"
  [x]
  (apply max (prime-factors x)))

;;; This finds the intended solution
;; (problem3 600851475143)
