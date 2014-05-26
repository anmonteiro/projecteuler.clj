(ns projecteuler.clj-test-problem3
  (:require [clojure.test :refer :all]
            [projecteuler.problem3 :refer :all]))

(deftest prime-factors-test
	(testing "Prime factors function"
		(is (= (prime-factors 1) #{}))
		(is (= (prime-factors 3) #{3}))
		(is (= (prime-factors 4) #{2}))
		(is (= (prime-factors 13195) #{5 7 13 29}))))

(deftest problem3-test-1
  (testing "Problem 3"
    (is (= (problem3 2) 2))
    (is (= (problem3 21) 7))
    (is (= (problem3 13195) 29))))

