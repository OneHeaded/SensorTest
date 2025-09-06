# Sensor Test

Sensor Test is an Android application that displays real-time values from the device's Accelerometer, Proximity, and Ambient Light sensors.

## Features

- Shows X, Y, Z values from the accelerometer
- Displays proximity sensor readings
- Displays ambient light sensor readings
- Simple, clean UI

## Requirements

- Android Studio Flamingo or newer
- Android SDK 33 or higher
- Gradle 8.13+
- Java 11+

## Build & Run

1. **Clone the repository:**
   ```sh
   git clone https://github.com/OneHeaded/SensorTest.git
   cd SensorTest
   ```

2. **Open in Android Studio**  
   Open the project folder in Android Studio.

3. **Build the project**  
   Android Studio will handle Gradle sync and build automatically.

4. **Run on a device or emulator**  
   Click the Run button or use:
   ```sh
   ./gradlew installDebug
   ```

## Project Structure

- [`app/src/main/java/com/example/sensortest/MainActivity.java`](app/src/main/java/com/example/sensortest/MainActivity.java): Main activity, handles sensor logic.
- [`app/src/main/res/layout/activity_main.xml`](app/src/main/res/layout/activity_main.xml): UI layout.
- [`app/build.gradle.kts`](app/build.gradle.kts): App module Gradle config.
- [`build.gradle.kts`](build.gradle.kts): Project-level Gradle config.

## License

This project is licensed under the Apache License 2.0. See the [LICENSE](https://www.apache.org/licenses/LICENSE-2.0) file for details.

---
*Created for educational purpose
