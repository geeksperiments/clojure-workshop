(defproject webapp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-json "0.4.0"]
                 [org.postgresql/postgresql "42.2.2"]
                 [com.layerware/hugsql "0.4.9"]
                 [ring-cors "0.1.13"]
                 [ring/ring-defaults "0.3.2"]]
  :uberjar-name "webapp-standalone.jar"
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler webapp.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})