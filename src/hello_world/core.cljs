(ns hello-world.core
    (:require [cljs.nodejs :as node]))

(node/enable-util-print!)

(def express (node/require "express"))


(defn -main [& args]
  (let [app (express)]
    (.get app "/" (fn [req res]
                    (.send res "Hello")))
    (.listen app 3000)))

(set! *main-cli-fn* -main)
