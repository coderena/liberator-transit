(defproject io.clojure/liberator-transit "0.3.11"
  :description "Library to add Transit encoding support to Liberator"
  :url "https://github.com/sattvik/liberator-transit"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-RC1"]
                 [com.cognitect/transit-clj "0.8.275"]
                 [liberator "0.13"]]
  :profiles {:dev {:dependencies [[org.clojure/data.generators "0.1.2"]
                                  [org.clojure/test.check "0.5.9"]
                                  [ring/ring-mock "0.2.0"]
                                  [compojure "1.3.4"]]
                   :plugins [[com.jakemccrary/lein-test-refresh "0.9.0"]
                             [lein-marginalia "0.8.0"]
                             [lein-ancient "0.6.7"]]}})
