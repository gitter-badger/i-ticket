# Project i-Ticket #
## Goals ##

i-Ticket is simple implementation issue tracking tool, something like Trac as open source based product or proprietary Jira. i-Ticket is based on Grails web application framework which use dynamic programming language Groovy.

**Basic functionality:**

  * per project configuration (ticket type, components, ticket flow ...)
  * customizable ticket types, version types, component types (in hierarchical structure)
  * roles management (development, customer, solution support -> affects viewing of tickets)
  * access control list on projects/components/tickets/fields (bound with roles management)
  * customizable fields for tickets (add, edit, delete?)
  * configurable flow of ticket states (new, assigned, fixed/rejected..., verified, closed)
  * per user customizable views of tickets
  * user/ticket administration
  * time management (estimated time for each ticket)
  * time effort tracking (time spent solving a ticket)

**Advanced functionality:**

  * save current project as template for future use (create a predefined project)
  * ticket exports (pdf, xml, txt, xls)
  * embedded wiki page
  * RSS/ATOM support

**Possible functionality:**

  * source code browsing
    * SVN support
    * CVS support
  * repository changes view
  * skinable interface

**Usefull links**

  * Environment [setup](EnvironmentSetup.md)