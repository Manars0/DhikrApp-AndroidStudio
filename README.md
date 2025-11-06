## Dhikr App (Android Studio Project)
A simple Android mobile application built using Java and XML in Android Studio.
The app displays daily Islamic Dhikr (remembrances) with interactive navigation and audio playback.
> This project was developed as part of a mobile application development course at King Saud University.

## Project Overview
The **Dhikr App** provides users with a calm and simple interface to read and listen to Islamic remembrances.
It includes multiple interactive screens, each serving a specific purpose such as navigation, displaying images, and playing audio files.

The application uses **Activities, MediaPlayer**, and **GridView** components to create an engaging user experience.

## Main Features
- Splash screen that automatically navigates to the next activity after a few seconds.
- Buttons and image buttons for easy navigation between different activities.
- Integrated MediaPlayer to play morning and evening dhikr sounds.
- Multiple screens (Activities) with visual and interactive elements.
- GridView layout to display dhikr categories in a clean and organized grid format.
- Logout button that displays a confirmation message when pressed.

## App Structure
- Activity	Description
- Activity 1	Splash screen — displays a logo/image for 2 seconds, then navigates to Activity 2.
- Activity 2	Main navigation page with several ImageButtons and one Button to access dhikr categories.
- Activity 3–10	Pages displaying dhikr images and playing corresponding audio using `MediaPlayer`.
- Activity 11	Contains a `GridView` that displays multiple dhikr images using a custom `ImageAdapter`.
-Activity 12	Final screen with `TextView`, `ImageView`, and a logout `Button` that shows a message.

## Technologies Used
- Android Studio
- Java
- XML Layout Design
- MediaPlayer API
- GridView & ImageAdapter

## How It Works
- When the app starts, Activity 1 shows the splash screen and transitions automatically to the main page.
- Activity 2 acts as a navigation hub, allowing users to open specific dhikr screens.
- Each dhikr screen (Activities 3–10) contains an audio playback button to listen to the dhikr.
- Activity 11 displays dhikr categories in a grid format.
- Activity 12 allows users to log out and see a confirmation message.
- All navigation between screens is handled through Intents and OnClickListeners.
