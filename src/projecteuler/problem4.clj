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
  (apply max (map #(Integer/parseInt %)
                  (map clojure.string/join
                       (filter is-palindrome? (map num-to-lst
                                                   (seq-prob4 x)))))))

(problem4 3)
