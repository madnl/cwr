(defproject cwr-worker "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.nrepl "0.2.10"]]
  :main ^:skip-aot cwr.worker.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
