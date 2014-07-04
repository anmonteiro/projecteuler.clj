(ns projecteuler.clj-test-problem4
  (:require [clojure.test :refer :all]
            [projecteuler.problem4 :refer :all]))


(deftest is-palindrome?-test
  (testing "Funtion is-palindrome"
    (is (= (is-palindrome? 9009) true))
    (is (= (is-palindrome? 900) false))
    (is (= (is-palindrome? 1001) true))
    (is (= (is-palindrome? 180081) true))
    (is (= (is-palindrome? 8) true))
    (is (= (is-palindrome? 18281) true))))


(deftest seq-prob4-test
  (testing "return vector of products of all x-digit numbers"
    (is (= (sort(seq-prob4 1)) (sort [1 2 3 4 5 6 7 8 9 4 6 8 10 12 14 16 18 9 12 15 18 21 24 27 16 20 24 28 32 36 25 30 35 40 45 36 42 48 54 49 56 63 64 72 81])))))

(deftest problem4-test-1
  (testing "Problem 4 - Argument is the number of digits
           from which sum to find the largest palindrome"
           (is (= (problem4 2) 9009))
           (is (= (problem4 1) 9))))





