# JDK Lister Utility

A Java utility to discover and list all JDK installations on your system.

## Overview

The JDK Lister utility helps developers identify all JDK (Java Development Kit) installations available on their system. It automatically searches common JDK installation directories and provides detailed information about each found JDK.

## Features

- **Automatic Discovery**: Searches common JDK installation paths on Windows, macOS, and Linux
- **Current JDK Detection**: Identifies the currently active JDK (JAVA_HOME)
- **Detailed Information**: Displays path, version, and vendor for each JDK
- **Cross-Platform**: Works on Windows, macOS, and Linux systems

## Components

### JDKInfo.java
Represents information about a JDK installation with the following properties:
- Path to the JDK installation
- Version number
- Vendor/distribution name

### JDKLister.java
Core utility class that:
- Searches common JDK installation directories based on the operating system
- Validates directories to ensure they contain a JDK (not just a JRE)
- Extracts version and vendor information by executing `java -version`
- Returns a list of all found JDK installations

### Main.java
Demonstration program that:
- Shows the current JDK being used
- Lists all JDK installations found on the system
- Displays detailed information about each JDK

## Usage

### Compile

From the repository root directory:

```bash
javac utils/JDKLister/*.java
```

### Run

```bash
java utils.JDKLister.Main
```

### Example Output

```
=== JDK Lister ===
Searching for JDK installations on the system...

Current JDK (JAVA_HOME):
  JDK [Path: /usr/lib/jvm/temurin-17-jdk-amd64, Version: 17.0.16, Vendor: Eclipse Temurin (OpenJDK)]

Found 5 JDK installation(s):

1. JDK [Path: /usr/lib/jvm/temurin-17-jdk-amd64, Version: 17.0.16, Vendor: Eclipse Temurin (OpenJDK)]
2. JDK [Path: /usr/lib/jvm/temurin-25-jdk-amd64, Version: 25, Vendor: Eclipse Temurin (OpenJDK)]
3. JDK [Path: /usr/lib/jvm/temurin-21-jdk-amd64, Version: 21.0.8, Vendor: Eclipse Temurin (OpenJDK)]
4. JDK [Path: /usr/lib/jvm/temurin-11-jdk-amd64, Version: 11.0.28, Vendor: Eclipse Temurin (OpenJDK)]
5. JDK [Path: /usr/lib/jvm/temurin-8-jdk-amd64, Version: 1.8.0_462, Vendor: Eclipse Temurin (OpenJDK)]

=== End of JDK List ===
```

## Search Locations

The utility searches the following locations based on the operating system:

### Windows
- `C:\Program Files\Java`
- `C:\Program Files (x86)\Java`
- `%USERPROFILE%\AppData\Local\Programs\Java`

### macOS
- `/Library/Java/JavaVirtualMachines`
- `/System/Library/Java/JavaVirtualMachines`
- `~/Library/Java/JavaVirtualMachines`

### Linux
- `/usr/lib/jvm`
- `/usr/java`
- `/opt/java`
- `/usr/local/java`
- `~/.sdkman/candidates/java` (SDKMAN installations)

## Supported JDK Vendors

The utility can identify the following JDK vendors:
- Oracle JDK
- OpenJDK
- Eclipse Temurin (AdoptOpenJDK)
- Azul Zulu
- Amazon Corretto

## Requirements

- Java 8 or higher
- Operating System: Windows, macOS, or Linux

## Integration

You can use the JDKLister class programmatically in your own Java applications:

```java
import utils.JDKLister.JDKLister;
import utils.JDKLister.JDKInfo;
import java.util.List;

// Get all JDKs
List<JDKInfo> jdks = JDKLister.listJDKs();
for (JDKInfo jdk : jdks) {
    System.out.println(jdk.getPath() + " - " + jdk.getVersion());
}

// Get current JDK
JDKInfo current = JDKLister.getCurrentJDK();
System.out.println("Current: " + current.getVersion());
```

## Notes

- The utility requires the `javac` executable to be present in the JDK's `bin` directory to distinguish JDKs from JREs
- Version and vendor information is obtained by executing `java -version` for each discovered JDK
- The utility only searches predefined common locations; custom installation paths may not be detected

## License

This utility is part of the MeetTak/Java repository.
