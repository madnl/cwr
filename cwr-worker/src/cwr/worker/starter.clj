(ns cwr.worker.starter
  (:require [clojure.tools.nrepl.server :refer [start-server]])
  (:gen-class))


(defn -main
  [& args]
  (start-server :port 8042))
