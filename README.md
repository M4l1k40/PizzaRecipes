# 🍕 PizzaRecipes

Bienvenue dans **PizzaRecipes** ! Une application Android moderne pour découvrir et partager vos recettes de pizza préférées.

## 📋 Description

PizzaRecipes est une application Android développée en Java qui permet aux utilisateurs de :
- Consulter une collection de recettes de pizza
- Découvrir des techniques de préparation
- Partager et stocker leurs recettes favorites

## 🛠️ Technologies Utilisées

- **Langage** : Java
- **Build System** : Gradle (Kotlin DSL)
- **Android SDK** :
  - Compile SDK: 36
  - Min SDK: 24
  - Target SDK: 36
  - JDK: 11

- **Dépendances principales** :
  - AndroidX AppCompat
  - Material Design
  - ConstraintLayout
  - JUnit (Tests)
  - Espresso (Tests UI)

## 🚀 Installation et Configuration

### Prérequis
- Android Studio (dernière version recommandée)
- JDK 11 ou supérieur
- Android SDK 36+

### Étapes

1. **Cloner le repository**
   ```bash
   git clone https://github.com/M4l1k40/PizzaRecipes.git
   cd PizzaRecipes
Ouvrir dans Android Studio

Ouvrir Android Studio
Sélectionner "Open" et naviguer vers le dossier du projet
Compiler l'application

bash
./gradlew build
Exécuter sur un appareil ou émulateur

bash
./gradlew installDebug
🔨 Commandes Gradle Utiles
bash
# Compiler le projet
./gradlew build

# Nettoyer le build
./gradlew clean

# Exécuter les tests
./gradlew test

# Exécuter les tests d'instrumentation
./gradlew connectedAndroidTest

# Assembler le APK
./gradlew assembleDebug
./gradlew assembleRelease
📱 Appareil Cible
API minimale : 24 (Android 7.0)
API cible : 36 (Android 15)
Compatible : Téléphones et tablettes Android
🧪 Tests
Le projet inclut une suite de tests comprenant :

Tests unitaires : JUnit
Tests UI : Espresso
Exécutez les tests avec :

bash
./gradlew test                    # Tests unitaires
./gradlew connectedAndroidTest   # Tests d'instrumentation
 commit -m 'Add some AmazingFeature')
Push vers la branche (git push origin feature/AmazingFeature)
Ouvrir une Pull Request

# l'app enregistre :
