(ns drink-with-strangers.test.database
  (:require [drink-with-strangers.database :refer :all :as db]
            [midje.sweet :refer :all]))

(facts "database"
       (fact "can insert new account"
             (db/insert-account {:nick_name "Hugo"}) => (contains {:nick_name "Hugo"}))
       (fact "can insert new account"
             (db/insert-account {:nick_name "Hugo"}) => (contains {:id truthy})))
