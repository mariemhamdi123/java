<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Gestion des utilisateurs</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <h1>Créer un compte utilisateur</h1>
  <form id="userForm">
    <input type="text" id="name" placeholder="Nom" >
    <input type="text" id="email" placeholder="Email">
    <input type="password" id="password" placeholder="Mot de passe" >
    <button type="submit">Ajouter</button>
    <p id="formError" class="error"></p>
  </form>

  <h2>Liste des utilisateurs (BackOffice)</h2>
  <table id="userTable">
    <thead>
      <tr>
        <th>Nom</th>
        <th>Email</th>
        <th>Actions</th>
      </tr>
    </thead>
    <tbody>
      <!-- Utilisateurs ajoutés ici dynamiquement -->
    </tbody>
  </table>

  <script src="script.js"></script>
</body>
</html>
