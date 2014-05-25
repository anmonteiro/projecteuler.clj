(ns projecteuler.clj-test
  (:require [clojure.test :refer :all]
            [projecteuler.clj :refer :all]
            [projecteuler.problem1 :refer :all]
            [projecteuler.problem2 :refer :all]))

(deftest problem1-test-1
  (testing "Problem 1"
    (is (= (problem1 10) (+ 3 5 6 9)))
    (is (= (problem1 15) 45))))


(deftest problem2-test-1
	(testing "Problem 2 Fibonacci sequence"
		(is (= (fib 0) 1))
		(is (= (fib 1) 1))
		(is (= (fib 2) 2))
		(is (= (fib 3) 3))
		(is (= (fib 5) 8))
		(is (= (fib 10) 89))))


(deftest problem2-test-2
  (testing "Problem 2"
    (is (= (problem2 89) (+ 2 8 34)))
    (is (= (problem2 13) (+ 2 8)))
    (is (= (problem2 8) (+ 2 8)))
    (is (= (problem2 21) (+ 2 8)))))

