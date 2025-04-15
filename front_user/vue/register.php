<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Inscription</title>
  <link rel="stylesheet" href="style.css">
  <script src="script.js" defer></script>
</head>
<body>
  <div class="form-container">
    <h2>Inscription</h2>
    <form id="register-form">
      <input type="text" id="first_name" placeholder="Prénom">
      <div class="error-message" id="error-first_name"></div>

      <input type="text" id="last_name" placeholder="Nom">
      <div class="error-message" id="error-last_name"></div>

      <input type="text" id="email" placeholder="Email">
      <div class="error-message" id="error-email"></div>

      <input type="tel" id="phone" placeholder="Téléphone">
      <div class="error-message" id="error-phone"></div>

      <input type="date" id="dob">
      <div class="error-message" id="error-dob"></div>

      <select id="gender">
        <option value="">-- Genre --</option>
        <option value="female">Femme</option>
        <option value="male">Homme</option>
        <option value="other">Autre</option>
      </select>
      <div class="error-message" id="error-gender"></div>

      <input type="password" id="password" placeholder="Mot de passe">
      <div class="error-message" id="error-password"></div>

      <input type="password" id="confirm_password" placeholder="Confirmer mot de passe">
      <div class="error-message" id="error-confirm_password"></div>

      <button type="submit">S'inscrire</button>
      <p class="link">Déjà inscrit ? <a href="index.php">Se connecter</a></p>
    </form>
  </div>
</body>
</html>