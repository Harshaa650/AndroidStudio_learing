# 📱 Android Learning Projects

## 🚀 Overview

This repository contains multiple Android applications built using **Kotlin** and **Jetpack Compose** to demonstrate various Android development concepts including state management, UI interactions, and data persistence.

---

## 📂 Project Structure

```
AndroidStudio_learing/
 ├── Counter/               (Simple counter app with state management)
 │   ├── app/
 │   ├── gradle/
 │   └── build.gradle.kts
 ├── Notes_android/         (Todo/Notes app with local database)
 │   ├── app/
 │   ├── gradle/
 │   └── build.gradle.kts
 └── README.md
```

---

# 1️⃣ Counter App

## ✨ Features

* ➕ Increment counter
* ➖ Decrement counter
* 🔄 Reset counter
* ⚡ Instant UI updates using Compose state
* 🎯 Minimal and clean design

## 🛠 Tech Stack

* **Language:** Kotlin
* **UI Toolkit:** Jetpack Compose
* **Architecture:** State Management with Compose

## 📸 Screenshots

<img width="435" height="800" alt="Counter App" src="https://github.com/user-attachments/assets/e19a5c45-8c70-4988-b5e3-40c966773d9a" />

---

# 2️⃣ Notes App (Todo)

## ✨ Features

* 📝 Create new notes/todos
* ✏️ Edit existing notes
* 🗑️ Delete notes
* 💾 Local data persistence with Room database
* 🔍 Organized note management
* 🎨 Clean and intuitive UI with Jetpack Compose

## 🛠 Tech Stack

* **Language:** Kotlin
* **UI Toolkit:** Jetpack Compose
* **Database:** Room (SQLite)
* **Architecture:** MVVM pattern with Coroutines
* **Permissions:** Internet access support

---

## 🛠 Common Tech Stack

* **Language:** Kotlin
* **UI Toolkit:** Jetpack Compose
* **IDE:** Android Studio
* **Minimum SDK:** 24 (Android 7.0)
* **Target SDK:** 35

---

## ▶️ How to Run

### Prerequisites
- Android Studio (latest version)
- Android SDK installed
- JDK 11 or higher

### Steps

1. Clone the repository
2. Open **Android Studio**
3. Open the desired project folder (Counter or Notes_android)
4. Sync Gradle
5. Run on:
   * Android Emulator
   * Physical Android device

### Build Commands

```bash
# Build the project
./gradlew build

# Run debug build
./gradlew installDebug

# Run tests
./gradlew test
```

---

## 📚 Learning Concepts Covered

| Concept | Counter | Notes App |
|---------|---------|-----------|
| State Management | ✅ | ✅ |
| Composables | ✅ | ✅ |
| Recomposition | ✅ | ✅ |
| Database (Room) | ❌ | ✅ |
| CRUD Operations | ❌ | ✅ |
| Coroutines | ❌ | ✅ |
| Local Persistence | ❌ | ✅ |

---

## 🤝 Contributing

Feel free to fork, modify, and use these projects for learning purposes.

## 📄 License

This project is open source and available under the MIT License.

