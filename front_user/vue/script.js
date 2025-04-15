document.addEventListener("DOMContentLoaded", () => {
    const registerForm = document.getElementById("register-form");
    if (registerForm) {
      registerForm.addEventListener("submit", function (event) {
        let valid = true;
        const fields = [
          "first_name", "last_name", "email", "phone",
          "dob", "gender", "password", "confirm_password"
        ];
        fields.forEach(id => {
          document.getElementById("error-" + id).innerText = "";
        });
  
        const firstName = document.getElementById("first_name").value.trim();
        const lastName = document.getElementById("last_name").value.trim();
        const email = document.getElementById("email").value.trim();
        const phone = document.getElementById("phone").value.trim();
        const dob = document.getElementById("dob").value;
        const gender = document.getElementById("gender").value;
        const password = document.getElementById("password").value;
        const confirmPassword = document.getElementById("confirm_password").value;
  
        if (firstName === "") {
          document.getElementById("error-first_name").innerText = "Prénom requis";
          valid = false;
        }
        if (lastName === "") {
          document.getElementById("error-last_name").innerText = "Nom requis";
          valid = false;
        }
        const emailRegex = /^[\w.-]+@[a-zA-Z\d.-]+\.[a-zA-Z]{2,6}$/;
        if (!emailRegex.test(email)) {
          document.getElementById("error-email").innerText = "Email invalide";
          valid = false;
        }
        if (!/^[0-9]{8,15}$/.test(phone)) {
          document.getElementById("error-phone").innerText = "Téléphone invalide (8 à 15 chiffres)";
          valid = false;
        }
        if (dob === "") {
          document.getElementById("error-dob").innerText = "Date de naissance requise";
          valid = false;
        }
        if (gender === "") {
          document.getElementById("error-gender").innerText = "Veuillez choisir un genre";
          valid = false;
        }
        if (password.length < 6) {
          document.getElementById("error-password").innerText = "Mot de passe trop court (min. 6 caractères)";
          valid = false;
        }
        if (password !== confirmPassword) {
          document.getElementById("error-confirm_password").innerText = "Les mots de passe ne correspondent pas";
          valid = false;
        }
        if (!valid) event.preventDefault();
      });
    }
  
    const loginForm = document.getElementById("login-form");
    if (loginForm) {
      loginForm.addEventListener("submit", function (event) {
        const email = document.getElementById("login-email").value.trim();
        const password = document.getElementById("login-password").value;
  
        document.getElementById("error-login-email").innerText = "";
        document.getElementById("error-login-password").innerText = "";
  
        let valid = true;
        if (email === "") {
          document.getElementById("error-login-email").innerText = "Email requis";
          valid = false;
        }
        if (password === "") {
          document.getElementById("error-login-password").innerText = "Mot de passe requis";
          valid = false;
        }
        if (!valid) event.preventDefault();
      });
    }
  });
  