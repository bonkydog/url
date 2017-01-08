(ns cemerick.run-tests
  (:require [doo.runner :refer-macros [doo-tests]]
            [cemerick.test-url]))

(doo-tests 'cemerick.test-url)
