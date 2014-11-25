(defproject docopt "0.6.1-pubnub"
  :description "docopt creates beautiful command-line interfaces - clojure port"
  :url "http://docopt.org"
  :license {:name "MIT" :url "https://github.com/docopt/docopt.clj/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:test {:dependencies [[org.clojure/data.json "0.2.1"]]}}
  :aot :all
  :plugins [[s3-wagon-private "1.1.2"]]  
  :repositories [["private" {:url "s3p://maven-repo-rafta/snapshot/"
                             :username ~(System/getenv "LEIN_USERNAME")
                             :passphrase ~(System/getenv "LEIN_PASSPHRASE")}]]
  )
