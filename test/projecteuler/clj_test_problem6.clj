(ns projecteuler.clj-test-problem6
  (:require [clojure.test :refer :all]
            [projecteuler.problem6 :refer :all]))

(deftest square-sums-test
	(testing "Square of sums"
		(is (= (square-sums 100) 25502500))
		(is (= (square-sums 10) 3025))))


(deftest sum-squares-test
	(testing "Sum of squares"
		(is (= (sum-squares 10) 385))
		(is (= (sum-squares 2) 5))
		(is (= (sum-squares 4) 30))))


(deftest problem6-test-1
  (testing "Problem 6 - Sum Square Difference"
    (is (= (problem6 10) 2640))))

