(ns projecteuler.clj-test-problem5
  (:require [clojure.test :refer :all]
            [projecteuler.problem5 :refer :all]))

(deftest is-divisible-until-n?-test
  (testing "is-divisible-until-n?"
    (is (= (is-divisible-until-n? 10 2520) true))
    (is (= (is-divisible-until-n? 10 2519) false))))

(deftest problem5-test-1
  (testing "Problem 5"
    (is (= (problem5 10) 2520))))

