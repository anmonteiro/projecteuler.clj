(ns projecteuler.clj-test-problem4
  (:require [clojure.test :refer :all]
            [projecteuler.problem4 :refer :all]))

(deftest num-to-lst-test
  (testing "Number like 9001 should be returned as [9 0 0 1]"
    (is (= (num-to-lst 9001) [9 0 0 1]))
    (is (= (num-to-lst 123456) [1 2 3 4 5 6]))
    (is (= (num-to-lst 180081) [1 8 0 0 8 1]))))


(deftest is-palindrome?-test
  (testing "Funtion is-palindrome"
    (is (= (is-palindrome? [9 0 0 9]) true))
    (is (= (is-palindrome? [9 0 0]) false))
    (is (= (is-palindrome? [1 0 0 1]) true))
    (is (= (is-palindrome? [1 8 0 0 8 1]) true))
    (is (= (is-palindrome? [8]) true))
    (is (= (is-palindrome? [1 8 2 8 1]) true))))


(deftest seq-prob4
  (testing "return vector of products of all x-digit numbers"
    (is (= () [1 2 3 4 5 6 7 8 9]))))

(deftest problem4-test-1
  (testing "Problem 4 - Argument is the number of digits
            from which sum to find the largest palindrome"
    (is (= (problem4 2) 9009))
    (is (= (problem4 1) 9))))

;(let [res []]
;  (loop [i 1]
;    (when (<= i 9)
;      (recur (inc i))
;      (into res
;        (let [resaux []]
;          (loop [j i]
;            (when (<= j 9)
;              (recur (inc j))
;              (conj resaux (* i j))))))))
;    res)