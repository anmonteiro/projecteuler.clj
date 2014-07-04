(ns projecteuler.problem4)


(defn is-palindrome?
  [n]
  (= (str n) (apply str (reverse (str n)))))

(defn seq-prob4
  [n]
  (let [limit (int (Math/pow 10 n))]
    (loop [i 1 vc []]
      (if (= i limit)
        vc
        (recur
          (inc i)
          (into vc (map * (take (- limit i) (cycle [i])) (range i limit))))))))


(defn problem4
  "Take two x-digit numbers and return the highest
  palindrome result of their product"
  [x]
  (apply max (->> (seq-prob4 x)
                  (filter is-palindrome?))))


;;; This finds the intended solution
;; (problem4 3)
