# 📧 Gmail-Style Login Interface (Java Swing)

A sleek, static Login Page inspired by the Gmail interface. This project demonstrates the use of **Java Swing** components and absolute positioning to create a clean and organized user experience.

---

## 🎨 Design Highlights
* **Absolute Positioning**: Uses `setLayout(null)` for precise control over component coordinates (`setBounds`).
* **Branding**: Integrated Gmail icon in both the frame header and the main panel using `ImageIcon`.
* **User Input Variety**: Includes text fields for usernames and specialized password fields for security.
* **Functional Components**: Features a "Save Password" checkbox and a language selection dropdown (Arabic/English).

---

## 🛠️ Components Used
* **`JFrame`**: The main application window.
* **`JPanel`**: A container for grouping components with a customized white background.
* **`JLabel`**: Used for displaying text instructions and images (Icons).
* **`JTextField` & `JPasswordField`**: For capturing user credentials.
* **`JComboBox`**: For the language selection menu.
* **`JCheckBox`**: To allow users to opt-in for password saving.
* **`JButton`**: A stylized button for the login action.

---

## 📁 Project Structure & Resource Management
To ensure the icons load correctly, maintain the following directory structure:
```text
myproj/
├── My.java             # Main source code
└── gmail/
    └── gmail.png       # Icon used in the app
