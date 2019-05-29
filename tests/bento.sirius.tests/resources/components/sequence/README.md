
Things to take into account:
* There is a pre-condition in the edge creation tool:
  - Connection pre-condition: aql:preTarget.next = null
    Otherwise, it is possible to create an infinite cycle and hangs Sirius