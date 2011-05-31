#! /bin/sh

clear;

java -classpath classes:config:lib/junit.jar:lib/java112Tests.jar:lib/analyzer.jar \
org.junit.runner.JUnitCore \
java112.tests.AnalyzerDriverTest \
java112.tests.SummaryReportTest \
java112.tests.SummaryReportOutputTest \
java112.tests.UniqueTokenAnalyzerOutputTest \
java112.tests.UniqueTokenAnalyzerProcessTokenTest \
java112.tests.AnalyzeFileMethodsTest \
java112.tests.BigWordAnalyzerOutputTest \
java112.tests.BigWordAnalyzerProcessTokenTest \
java112.tests.TokenCountAnalyzerProcessTokenTest \
java112.tests.TokenCountAnalyzerOutputTest \
java112.tests.KeywordAnalyzerProcessTokenTest \
java112.tests.KeywordAnalyzerOutputTest \
java112.tests.TokenSizeAnalyzerOutputTest \
java112.tests.TokenSizeAnalyzerProcessTokenTest
