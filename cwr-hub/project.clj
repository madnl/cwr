(defproject cwr-hub "0.1.0-SNAPSHOT"
  :description "Clojure Web REPL - Hub"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3126"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.2"]]
  :plugins [[lein-ring "0.8.13"]
            [lein-cljsbuild "1.0.5"]]
  :ring {:handler cwr.hub.server/app}
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["client/src"]
                        :compiler {:output-to "resources/public/js/client.js"
                                   :output-dir "resources/public/js"
                                   :optimizations :none
                                   :cache-analysis true
                                   :source-map true}}                       
                       {:id "release"
                        :source-paths ["client/src"]
                        :compiler {:output-to "resources/public/js/client.js"
                                   :pretty-print false
                                   :optimizations :advanced}}]}

  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
