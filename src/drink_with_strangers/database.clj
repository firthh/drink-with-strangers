(ns drink-with-strangers.database
  (:use korma.db
        korma.core
        korma.config))

(defdb pg (postgres {
                     :db "dws"
                     :user "postgres"
                     :password "postgres"
                     :host "localhost"
                     :port "5432"
                     }))

(declare account)

(defentity account
  (pk :id)
  (table :accounts)
  (database pg))

(defn insert-account [account-to-insert]
  (insert account
          (values account-to-insert)))
