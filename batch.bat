set projectLocation=C:\Users\Netzwelt\Downloads\OD-20210830T152703Z-001\OD
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
mvn clean test -DsuiteXmlFile=%projectLocation%\TestSuite.xml
PAUSE