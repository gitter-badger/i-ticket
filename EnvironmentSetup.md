**Necessary downloads**

  * Download [Java](http://java.sun.com/javase/downloads/index.jsp) actual version of virtual machine (1.6.0.2).
  * Download [Grails](http://grails.codehaus.org/Download) actual version is 0.5.6 and project is setuped for this version.
  * Download [Eclipse](http://www.eclipse.org/downloads/) java ee developer version.
  * Download Eclipse [plugin](http://groovy.codehaus.org/Eclipse+Plugin) for groovy.
  * Download Eclipse [plugin](http://subclipse.tigris.org/) for SVN.
  * Download [PostgreSQL](http://www.postgresql.org/) database.

Install all application.

**Mylyn setup:** google [code ticket](http://www.jroller.com/alexRuiz/entry/using_mylyn_with_google_code) system.

**Grails setup:**
  * Extract the archive into an appropriate location; typically C:\grails on Windows or ~/grails on Unix
  * Create a GRAILS\_HOME environment variable that points to the path where you extracted the archive (eg C:\grails on Windows or ~/grails on Unix)
  * If you have not set the JAVA\_HOME environment variable yet, create JAVA\_HOME environment variable that points to the path where you have installed Java
  * Append a reference to the "bin" directory within the Grails directory to your PATH variable (eg %GRAILS\_HOME%\bin on Windows or $GRAILS\_HOME/bin on Unix)

**Sample:** run application
```
cd <project_directory>
grails run-app
```
