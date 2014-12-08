(defproject docopt "0.6.1-pubnub"
  :description "docopt creates beautiful command-line interfaces - clojure port"
  :url "http://docopt.org"
  :license {:name "MIT" :url "https://github.com/docopt/docopt.clj/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:test {:dependencies [[org.clojure/data.json "0.2.1"]]}}
  :aot :all
 
  :mirrors {#".+" {:name "pubnub" :url "http://maven.devbuild.pubnub.com:8081/artifactory/repo"}} 
  :deploy-repositories [["releases" {:url "http://maven.devbuild.pubnub.com:8081/artifactory/ext-release-local"}]
                        ["snapshots" {:url "http://maven.devbuild.pubnub.com:8081/artifactory/ext-snapshot-local"}]])
