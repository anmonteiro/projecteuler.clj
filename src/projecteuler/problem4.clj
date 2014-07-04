(ns projecteuler.problem4)

(defn num-to-lst
  [n]
  (if (< n 10)
    [n]
    (conj (num-to-lst (long (/ n 10))) (mod n 10))))


(defn is-palindrome?
  [lst]
  (if (empty? lst)
    true
    (if (= (first lst) (last lst))
      (is-palindrome? (rest (pop (vec lst))))
      false)))


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
  (->> (map (comp read-string clojure.string/join)
            (->> (map num-to-lst (seq-prob4 x))
                (filter is-palindrome?)))
       (apply max)))


;;; This finds the intended solution
;; (problem4 3)
