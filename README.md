# Java Starter App 🚀

Minimal Spring Boot sample app with instructions to set up, build, run, and test locally.

---

## Prerequisites ✅

- Java 17+ (ensure `java -version` shows 17 or higher)
- Git (optional)
- Internet access for Maven wrapper to download Maven and dependencies

## Quick project layout 🔎

- `src/main/java/com/labs/copilot/JavaStarterAppApplication.java` — main Spring Boot app and `/` endpoint
- `src/test/java/com/labs/copilot/JavaStarterAppApplicationTests.java` — sample JUnit test
- `pom.xml` — Maven build
- `mvnw` / `mvnw.cmd` — Maven wrapper

---

## Setup 🛠️

This project uses the Maven Wrapper. Ensure it runs correctly:

```bash
./mvnw -v
```

If that works, dependencies and Maven will be downloaded automatically when you run build or tests.

### (Optional) Enable fast restart during development

Add Spring Boot DevTools to `pom.xml` to enable automatic restart on classpath changes:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-devtools</artifactId>
  <scope>runtime</scope>
</dependency>
```

To make auto-reload effective in VS Code, enable auto-save in settings:

```json
"files.autoSave": "afterDelay",
"files.autoSaveDelay": 1000
```

Then run the app with `./mvnw spring-boot:run` so DevTools can watch for changes.

---

## Build & Package 📦

- Run tests and compile:

```bash
./mvnw test
```

- Create the package (jar):

```bash
./mvnw package
# or run jar directly
java -jar target/java-starter-app-0.0.1-SNAPSHOT.jar
```

---

## Run the app ▶️

- From Maven (recommended for development):

```bash
./mvnw spring-boot:run
```

- Or from packaged jar:

```bash
java -jar target/java-starter-app-0.0.1-SNAPSHOT.jar
```

The app launches on `http://localhost:8080/` by default.

Verify the endpoint:

```bash
curl http://localhost:8080/
# Expected: Welcome to Java Starter App!
```

---

## Tests 🧪

Run unit tests with Maven:

```bash
# all tests
./mvnw test

# single test class
./mvnw -Dtest=JavaStarterAppApplicationTests test

# single test method
./mvnw -Dtest=JavaStarterAppApplicationTests#contextLoads test
```

Test reports are written to `target/surefire-reports/` (e.g. `TEST-com.labs.copilot.JavaStarterAppApplicationTests.xml`).

### VS Code

Install the **Test Runner for Java** and **Java Extension Pack** to run and debug tests from the Testing sidebar or editor gutter.

---

## Debugging & VS Code tips 🔧

- Use the **Spring Boot Dashboard** extension (`vscjava.vscode-spring-boot-dashboard`) to manage and run Spring apps from the UI.
- Use the Testing sidebar or editor gutters to run/debug individual JUnit tests.
- For auto-restart: enable `files.autoSave` and use DevTools as described above.

---

## Notes & Links 📚

- Main controller: `com.labs.copilot.JavaStarterAppApplication#welcome`
- Tests: `com.labs.copilot.JavaStarterAppApplicationTests`
- Build file: `pom.xml`

---

If you want, I can also add a `.vscode/launch.json` sample or add DevTools dependency automatically to `pom.xml`. ✅
