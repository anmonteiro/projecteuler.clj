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
  (testing "Problem 2"
    (is (= (problem2 10) 10))))
