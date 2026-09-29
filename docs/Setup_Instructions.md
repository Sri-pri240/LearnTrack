# Environment Setup Instructions

## JDK Configuration
- **JDK Version Used:** Java SE 17 or higher
- **Compilation & Run Workflow:**
  Open terminal in project root and run:

  javac -d out src/com/airtribe/learntrack/util/*.java src/com/airtribe/learntrack/exception/*.java src/com/airtribe/learntrack/entity/*.java src/com/airtribe/learntrack/service/*.java src/com/airtribe/learntrack/ui/*.java

  java -cp out com.airtribe.learntrack.ui.Main