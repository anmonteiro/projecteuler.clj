(ns projecteuler.clj-test-problem1
  (:require [clojure.test :refer :all]
            [projecteuler.problem1 :refer :all]))

(deftest problem1-test-1
  (testing "Problem 1"
    (is (= (problem1 10) (+ 3 5 6 9)))
    (is (= (problem1 15) 45))))

