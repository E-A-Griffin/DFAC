(ns dfac.objects)

;; Atom to hold map of states shared by other files in dfac
(def objects (atom {}))

;; Atom to hold test strings to be evaluated for membership
;; in a given DFA.
(def test-strings (atom []))

