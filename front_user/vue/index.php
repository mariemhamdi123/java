
<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Connexion</title>
  <link rel="stylesheet" href="style.css">
  <script src="script.js" defer></script>
</head>
<body>
  <div class="form-container">
    <h2>Connexion</h2>
    <form id="login-form">
      <input type="text" id="login-email" placeholder="Email">
      <div class="error-message" id="error-login-email"></div>

      <input type="password" id="login-password" placeholder="Mot de passe">
      <div class="error-message" id="error-login-password"></div>

      <button type="submit">Se connecter</button>
      <p class="link">Pas encore inscrit ? <a href="register.php">Créer un compte</a></p>
    </form>
  </div>
</body>
</html>