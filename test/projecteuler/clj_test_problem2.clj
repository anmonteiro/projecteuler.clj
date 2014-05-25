(ns projecteuler.clj-test-problem2
  (:require [clojure.test :refer :all]
            [projecteuler.problem2 :refer :all]))

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

