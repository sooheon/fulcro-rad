(ns com.example.components.auto-resolvers
  (:require
    [mount.core :refer [defstate]]
    [com.example.schema :as ex-schema]
    [com.fulcrologic.rad.resolvers :as res]))

(defstate automatic-resolvers
  :start
  (res/schema->resolvers #{:production} ex-schema/latest-schema))
