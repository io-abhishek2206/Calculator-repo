# 🚀 Project Update: Calculator App

## This branch introduces important updates to the Calculator app project, improving both functionality and user experience.

## ✨ New Features & Changes:
	•	Added a Splash Screen with a 3-second delay before launching the Main Activity.
	•	Implemented safe input validation:
	•	Prevents app crashes when input fields are empty.
	•	Displays appropriate error messages if numbers are not entered.
	•	Added input limit checking:
	•	If a number entered is greater than 100,000,000 or less than -100,000,000, the app displays “Undefined Value”.
	•	Improved UI Stability:
	•	Fixed edge-to-edge padding issues using EdgeToEdge.enable(this) and ViewCompat.setOnApplyWindowInsetsListener().
	•	Ensured better thread handling by safely using a Thread with start() and finish() to properly move from Splash Screen to Main Activity.
	•	General code clean-up and added comments for better readability.

## 📋 How to Run
	•	Launch the app.
	•	Wait for the Splash Screen to complete.
	•	Enter two numbers in the input fields.
	•	Press Add to get the sum or receive an appropriate error if input is invalid.

## ⚡ Upcoming Improvements (optional future work):
	•	Add support for decimal numbers (floating point values).
	•	Improve splash screen with animations or logos.
	•	Add Toast notifications for better UX feedback.

⸻

✅ Branch Name: crash_update
✅ Main Focus: Make the app stable, crash-free, and ready for production use.
