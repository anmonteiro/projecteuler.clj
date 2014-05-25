(ns projecteuler.clj-test-problem3
  (:require [clojure.test :refer :all]
            [projecteuler.problem3 :refer :all]))

(deftest is-prime-test
	(testing "Is prime function"
		(is (= (is-prime 2) true))
		(is (= (is-prime 3) true))
		(is (= (is-prime 5) true))
		(is (= (is-prime 6) false))
		(is (= (is-prime 17) true))
		(is (= (is-prime 42) false))))

(deftest prime-factors-test
	(testing "Prime factors function"
		(is (= (prime-factors 1) #{}))
		(is (= (prime-factors 3) #{}))
		(is (= (prime-factors 4) #{2}))
		(is (= (prime-factors 13195) #{5 7 13 29}))))

(deftest problem3-test-1
  (testing "Problem 3"
    (is (= (problem3 2) nil))
    (is (= (problem3 21) 7))
    (is (= (problem3 13195) 29))))

