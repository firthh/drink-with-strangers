(ns drink-with-strangers.test.handler
  (:use midje.sweet)
  (:require [clojure.test :refer :all]
            [drink-with-strangers.handler :refer :all]
            [ring.mock.request :as mock]))

(facts "routes"
       (facts "main route"
              (let [response (app (mock/request :get "/"))]
                (fact "status"
                      (:status response) => 200)
                (fact "body"
                      (:body response) => "Hello World")))
       (facts "not found"
              (let [response (app (mock/request :get "/invalid"))]
                (fact "status"
                      (:status response) => 404))))
