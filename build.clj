(require 'cljs.closure)

(cljs.closure/build "src" {:output-to "main.js"
                           :main 'hello-world.core
                           :optimizations :none
                           :pretty-print true
                           :target :nodejs})
